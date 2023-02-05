package v2.controller;

import v2.model.Car;
import v2.model.Manufacture;
import v2.model.Motor;
import v2.model.Truck;
import v2.service.*;
import v2.util.ConstantUtil.TypeOfCar;

import java.util.List;
import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);
    private static TruckService truckService = new TruckService();
    private static CarService carService = new CarService();
    private static MotorService motorService = new MotorService();

    public static void displayMenu() {
        while (true) {
            System.out.println("--- Main Menu ---");
            System.out.println("1. Add" +
                    "\n2. Display" +
                    "\n3. Delete" +
                    "\n4. Search" +
                    "\n5. Exit");
            int choice = getChoice();
            switch (choice) {
                case 1 -> add();
                case 2 -> display();
                case 3 -> delete();
                case 4 -> search();
                case 5 -> System.exit(0);
            }
        }
    }

    private static void add() {
        System.out.println("1. Truck" +
                "\n2. Car" +
                "\n3. Motor");
        int choice = getChoice();

        System.out.print("Driver plate: ");
        String plate = scanner.nextLine();

        System.out.println("--- List Manufacturer ---");
        ManufactureService manufactureService = new ManufactureService();
        List<Manufacture> manufactureList = new ManufactureService().findAll();
        for (Manufacture manufacture :
                manufactureList) {
            System.out.println(manufacture);
        }

        System.out.print("Enter manufacturer name: ");
        String manufacturerName = scanner.nextLine();
        Manufacture manufacture = manufactureService.findByCode(manufacturerName);

        System.out.print("Year Of Manufacturer: ");
        int yearOfManufacturer = Integer.parseInt(scanner.nextLine());

        System.out.print("Owner: ");
        String owner = scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Load: ");
                double load = Double.parseDouble(scanner.nextLine());
                Truck truck = new Truck(plate, manufacture, yearOfManufacturer, owner, load);
                truckService.create(truck);
            }
            case 2 -> {
                System.out.print("Number of seat: ");
                int numberOfSeat = Integer.parseInt(scanner.nextLine());
                System.out.print("Type of car: ");
                String typeOfCar = scanner.nextLine();
                Car car = new Car(plate, manufacture, yearOfManufacturer, owner, numberOfSeat, TypeOfCar.valueOf(typeOfCar));
                carService.create(car);
            }
            case 3 -> {
                System.out.print("Wattage: ");
                double wattage = Double.parseDouble(scanner.nextLine());
                Motor motor = new Motor(plate, manufacture, yearOfManufacturer, owner, wattage);
                motorService.create(motor);
            }
        }
        System.out.println("Created successfully!");
    }

    private static void display() {
        System.out.println("1. Truck\n2. Car\n3. Motor");
        int choice = getChoice();
        switch (choice) {
            case 1 -> {
                List<Truck> trucks = truckService.findAll();
                displayTruck(trucks);
            }
            case 2 -> {
                List<Car> cars = carService.findAll();
                displayCar(cars);
            }
            case 3 -> {
                List<Motor> motors = motorService.findAll();
                displayMotor(motors);
            }
        }
    }

    private static void delete() {
        System.out.print("enter driver plate to delete: ");
        String driverPlate = scanner.nextLine();

        if (truckService.findByDriverPlate(driverPlate)) {
            deleteWithConfirm(truckService, driverPlate);
        } else if (carService.findByDriverPlate(driverPlate)) {
            deleteWithConfirm(carService, driverPlate);
        } else if (motorService.findByDriverPlate(driverPlate)) {
            deleteWithConfirm(motorService, driverPlate);
        } else {
            System.out.println("No exists driver plate");
        }
    }

    private static void search() {
        System.out.print("Enter driver plate to search: ");
        String driverPlate = scanner.nextLine();

        List<Truck> trucks = truckService.search(driverPlate);
        List<Motor> motors = motorService.search(driverPlate);
        List<Car> cars = carService.search(driverPlate);

        if (trucks.size() == 0 && motors.size() == 0 && cars.size() == 0) {
            System.out.println("No driver plate exists");
        } else {
            trucks.forEach(System.out::println);
            motors.forEach(System.out::println);
            cars.forEach(System.out::println);

        }
    }

    private static int getChoice() {
        System.out.print("Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static void deleteWithConfirm(VehicleService vehicleService, String driverPlate) {
        System.out.println("Are you sure to delete this item: \n1. Yes\n2. No");
        int choice = getChoice();
        if (choice == 1) {
            vehicleService.delete(driverPlate);
            System.out.println("Deleted successfully!");
        } else {
            displayMenu();
        }
    }

    private static void displayTruck(List<Truck> trucks) {
        System.out.printf("%-20s %-20s %-30s %-20s %-20s %n", "DRIVER PLATE", "MANUFACTURER", "YEAR OF MANUFACTURER", "OWNER", "LOAD");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        for (Truck truck :
                trucks) {
            System.out.printf("%-20s %-20s %-30s %-20s %-20s %n", truck.getDriverPlate(), truck.getManufacture().getName(), truck.getYearOfManufacture(), truck.getOwner(), truck.getLoad());
        }
    }

    private static void displayMotor(List<Motor> motors) {
        System.out.printf("%-20s %-20s %-30s %-20s %-20s %n", "DRIVER PLATE", "MANUFACTURER", "YEAR OF MANUFACTURER", "OWNER", "WATTAGE");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        for (Motor motor :
                motors) {
            System.out.printf("%-20s %-20s %-30s %-20s %-20s %n", motor.getDriverPlate(), motor.getManufacture().getName(), motor.getYearOfManufacture(), motor.getOwner(), motor.getWattage());
        }
    }

    private static void displayCar(List<Car> cars) {
        System.out.printf("%-20s %-20s %-30s %-20s %-20s %n", "DRIVER PLATE", "MANUFACTURER", "YEAR OF MANUFACTURER", "OWNER", "NUMBER OF SEAT", "TYPE OF CAR");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        for (Car car :
                cars) {
            System.out.printf("%-20s %-20s %-30s %-20s %-20s %n", car.getDriverPlate(), car.getManufacture().getName(), car.getYearOfManufacture(), car.getOwner(), car.getNumberOfSeat(), car.getTypeOfCar());
        }
    }
}
