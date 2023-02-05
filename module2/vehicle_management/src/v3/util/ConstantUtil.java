package v3.util;

public interface ConstantUtil {

    interface FilePath {
        String motor = "src/v3/data/motor.csv";
        String car = "src/v3/data/car.csv";
        String truck = "src/v3/data/truck.csv";
    }

    enum TypeOfCar {
        Tourist,
        Coach
    }
}
