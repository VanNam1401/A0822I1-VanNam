package service.impl;

import model.Car;
import service.VehicleService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarService implements VehicleService<Car> {
    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void create(Car car) {
        cars.add(car);
    }

    @Override
    public boolean findByDriverPlate(String driverPlate) {
        for (Car car : cars) {
            return car.getDriverPlate().equals(driverPlate);
        }
        return false;
    }

    @Override
    public void delete(String driverPlate) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getDriverPlate().equals(driverPlate)) {
                cars.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Car> search(String driverPlate) {
        return cars.stream().filter(e -> e.getDriverPlate().contains(driverPlate)).collect(Collectors.toList());
    }
}
