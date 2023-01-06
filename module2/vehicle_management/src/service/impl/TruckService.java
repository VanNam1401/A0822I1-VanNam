package service.impl;

import model.Truck;
import service.VehicleService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TruckService implements VehicleService<Truck> {
    private List<Truck> truckList = new ArrayList<>();


    @Override
    public List<Truck> findAll() {
        return truckList;
    }

    @Override
    public void create(Truck truck) {
        truckList.add(truck);
    }


    @Override
    public boolean findByDriverPlate(String driverPlate) {
        for (Truck truck :
                truckList) {
            return truck.getDriverPlate().equals(driverPlate);
        }
        return false;
    }

    @Override
    public void delete(String driverPlate) {
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getDriverPlate().equals(driverPlate)) {
                truckList.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Truck> search(String driverPlate) {
        return truckList.stream().filter(e -> e.getDriverPlate().contains(driverPlate)).collect(Collectors.toList());
    }
}
