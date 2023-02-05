package v3.service;

import v3.model.Manufacture;
import v3.model.Truck;
import v3.service.ManufactureService;
import v3.service.VehicleService;
import v3.util.ConstantUtil.FilePath;
import v3.util.FileHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TruckService implements VehicleService<Truck> {
    private List<Truck> trucks = new ArrayList<>();
    private FileHelper<Truck> fileHelper = new FileHelper<>();
    private ManufactureService manufactureService = new ManufactureService();

    public TruckService() {
        this.trucks = mapToObject();
    }

    @Override
    public List<Truck> findAll() {
        return trucks;
    }

    @Override
    public void create(Truck truck) {
        trucks.add(truck);
        fileHelper.write(FilePath.truck, trucks, false);
    }

    @Override
    public boolean findByDriverPlate(String driverPlate) {
        for (Truck truck : trucks) {
            return truck.getDriverPlate().equals(driverPlate);
        }
        return false;
    }

    @Override
    public void delete(String driverPlate) {
        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i).getDriverPlate().equals(driverPlate)) {
                trucks.remove(i);
                break;
            }
        }
        fileHelper.write(FilePath.truck, trucks, false);
    }

    @Override
    public List<Truck> search(String driverPlate) {
        return trucks.stream().filter(e -> e.getDriverPlate().contains(driverPlate)).collect(Collectors.toList());
    }

    private List<Truck> mapToObject() {
        List<Truck> result = new ArrayList<>();
        List<String> lines = fileHelper.read(FilePath.truck);
        for (String line :
                lines) {
            if (!line.isEmpty()) {
                String[] temp = line.split(",");
                String driverPlate = temp[0];
                Manufacture manufacture = manufactureService.findByName(temp[1]);
                int yearOfManufacturer = Integer.parseInt(temp[2]);
                String owner = temp[3];
                double load = Double.parseDouble(temp[4]);
                Truck truck = new Truck(driverPlate, manufacture, yearOfManufacturer, owner, load);
                result.add(truck);
            }
        }
        return result;
    }
}
