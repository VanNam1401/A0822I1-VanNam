package v1.service;

import v1.model.Motor;
import v1.util.ConstantUtil;
import v1.util.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MotorService implements VehicleService<Motor> {
    private List<Motor> motors = new ArrayList<>();

    @Override
    public List<Motor> findAll() {
        return motors;
    }

    @Override
    public void create(Motor motor) {
        motors.add(motor);
        WriteFile.writeToFileMotor(ConstantUtil.PATH_MOTOR, motors, true);
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
    }

    @Override
    public List<Motor> search(String driverPlate) {
        return motors.stream().filter(e -> e.getDriverPlate().contains(driverPlate)).collect(Collectors.toList());
    }
}
