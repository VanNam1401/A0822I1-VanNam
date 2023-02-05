package v3.service;

import v3.model.Car;
import v3.model.Manufacture;
import v3.service.ManufactureService;
import v3.service.VehicleService;
import v3.util.ConstantUtil.FilePath;
import v3.util.ConstantUtil.TypeOfCar;
import v3.util.FileHelper;

import java.util.ArrayList;
import java.util.List;

public class CarService implements VehicleService<Car> {
    private List<Car> cars = new ArrayList<>();
    private FileHelper<Car> fileHelper = new FileHelper<>();
    private ManufactureService manufactureService = new ManufactureService();

    public CarService() {
        cars = mapToObject();
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void create(Car car) {
        cars.add(car);
        fileHelper.write(FilePath.car, cars, false);
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
        fileHelper.write(FilePath.car, cars, false);
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

    private List<Car> mapToObject() {
        List<Car> result = new ArrayList<>();

        List<String> lines = fileHelper.read(FilePath.car);

        for (String line :
                lines) {
            if (!line.isEmpty()) {
                String[] temp = line.split(",");
                String drivePlate = temp[0];
                Manufacture manufacture = manufactureService.findByName(temp[1]);
                int yearOfManufacturer = Integer.parseInt(temp[2]);
                String owner = temp[3];
                int numberOfSeat = Integer.parseInt(temp[4]);
                TypeOfCar typeOfCar = TypeOfCar.valueOf(temp[5]);
                Car car = new Car(drivePlate, manufacture, yearOfManufacturer, owner, numberOfSeat, typeOfCar);
                result.add(car);
            }
        }
        return result;
    }
}
