package v2.util;

public interface ConstantUtil {

    interface FilePath {
        String motor = "src/v2/data/motor.csv";
        String car = "src/v2/data/car.csv";
        String truck = "src/v2/data/truck.csv";
    }

    enum TypeOfCar {
        Tourist,
        Coach
    }
}
