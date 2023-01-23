package v1.service;

import v1.model.Truck;
import v1.util.ConstantUtil;
import v1.util.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TruckService implements VehicleService<Truck> {
    private List<Truck> trucks = new ArrayList<>();

    @Override
    public List<Truck> findAll() {
        return trucks;
    }

    @Override
    public void create(Truck truck) {
        trucks.add(truck);
        WriteFile.writeToFileTruck(ConstantUtil.PATH_TRUCK, trucks, true);
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
    }

    @Override
    public List<Truck> search(String driverPlate) {
        return trucks.stream().filter(e -> e.getDriverPlate().contains(driverPlate)).collect(Collectors.toList());
    }
}
