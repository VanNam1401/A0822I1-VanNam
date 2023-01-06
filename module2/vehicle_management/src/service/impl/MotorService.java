package service.impl;

import model.Motor;
import service.VehicleService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MotorService implements VehicleService<Motor> {
    private List<Motor> motorList = new ArrayList<>();

    @Override
    public List<Motor> findAll() {
        return motorList;
    }

    @Override
    public void create(Motor motor) {
        motorList.add(motor);
    }

    @Override
    public boolean findByDriverPlate(String driverPlate) {
        for (Motor motor :
                motorList) {
            return motor.getDriverPlate().equals(driverPlate);
        }
        return false;
    }

    @Override
    public void delete(String driverPlate) {
        for (int i = 0; i < motorList.size(); i++) {
            if (motorList.get(i).getDriverPlate().equals(driverPlate)) {
                motorList.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Motor> search(String driverPlate) {
        return motorList.stream().filter(e -> e.getDriverPlate().contains(driverPlate)).collect(Collectors.toList());
    }
}
