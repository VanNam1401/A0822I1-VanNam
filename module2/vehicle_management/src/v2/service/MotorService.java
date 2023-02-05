package v2.service;

import v2.model.Manufacture;
import v2.model.Motor;
import v2.util.ConstantUtil.FilePath;
import v2.util.FileHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MotorService implements VehicleService<Motor> {
    private List<Motor> motors = new ArrayList<>();

    private FileHelper<Motor> fileHelper = new FileHelper<>();
    private ManufactureService manufactureService = new ManufactureService();

    public MotorService() {
        this.motors = mapToObject();
    }

    @Override
    public List<Motor> findAll() {
        return motors;
    }

    @Override
    public void create(Motor motor) {
        motors.add(motor);
        fileHelper.write(FilePath.motor, motors, false);
    }

    @Override
    public boolean findByDriverPlate(String driverPlate) {
        for (Motor motor : motors) {
            return motor.getDriverPlate().equals(driverPlate);
        }
        return false;
    }

    @Override
    public void delete(String driverPlate) {
        for (int i = 0; i < motors.size(); i++) {
            if (motors.get(i).getDriverPlate().equals(driverPlate)) {
                motors.remove(i);
                break;
            }
        }
        fileHelper.write(FilePath.motor, motors, false);
    }

    @Override
    public List<Motor> search(String driverPlate) {
        return motors.stream().filter(e -> e.getDriverPlate().contains(driverPlate)).collect(Collectors.toList());
    }

    private List<Motor> mapToObject() {
        List<Motor> result = new ArrayList<>();
        List<String> lines = fileHelper.read(FilePath.motor);
        for (String line :
                lines) {
            if (!line.isEmpty()) {
                String[] temp = line.split(",");
                String driverPlate = temp[0];
                Manufacture manufacture = manufactureService.findByName(temp[1]);
                int yearOfManufacturer = Integer.parseInt(temp[2]);
                String owner = temp[3];
                double wattage = Double.parseDouble(temp[4]);
                Motor motor = new Motor(driverPlate, manufacture, yearOfManufacturer, owner, wattage);
                result.add(motor);
            }
        }
        return result;
    }
}
