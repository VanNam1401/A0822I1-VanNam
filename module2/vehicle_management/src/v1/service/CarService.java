package v1.service;

import v1.model.Car;
import v1.util.ConstantUtil;
import v1.util.WriteFile;

import java.util.ArrayList;
import java.util.List;

public class CarService implements VehicleService<Car> {
    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void create(Car car) {
        cars.add(car);
        WriteFile.writeToFileCar(ConstantUtil.PATH_CAR, cars, true);
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
//        return cars.stream().filter(e ->e.getDriverPlate().contains(driverPlate)).collect(Collectors.toList());
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getDriverPlate().equals(driverPlate)) {
                carList.add(car);
                break;
            }
        }
        return carList;
    }
}
