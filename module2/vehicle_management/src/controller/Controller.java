package controller;

import model.Car;
import model.Manufacturer;
import model.Motor;
import model.Truck;
import service.impl.CarService;
import service.impl.ManufactureService;
import service.impl.MotorService;
import service.impl.TruckService;
import util.ConstantUtil;

import java.util.List;
import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);
    private static TruckService truckService = new TruckService();
    private static CarService carService = new CarService();
    private static MotorService motorService = new MotorService();

    static void display() {
        while (true) {
            System.out.println("----Main Menu----");
            System.out.println("1. Add\n2.Display\n3. Delete\n4. Search\n5. Exit");
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

    private static int getChoice() {
        System.out.print("Enter your choice:");
        return Integer.parseInt(scanner.nextLine());
    }

    private static void add() {
        System.out.println("1. Truck\n2. Car\n3. Motor");
        int choice = getChoice();

        System.out.print("Driver plate:");
        String plate = scanner.nextLine();

        System.out.println("----- List Manufacturer -----");
        ManufactureService manufactureService = new ManufactureService();
        List<Manufacturer> manufacturerList = manufactureService.findAll();
        for (Manufacturer manufacturer :
                manufacturerList) {
            System.out.println(manufacturer);
        }

        System.out.print("Enter manufacturer name:");
        String manufacturerName = scanner.nextLine();
        Manufacturer manufacturer = manufactureService.findByName(manufacturerName);

        System.out.print("Year Of Manufacturer:");
        int yearOfManufacturer = Integer.parseInt(scanner.nextLine());

        System.out.print("Owner:");
        String owner = scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Load:");
                Double load = Double.parseDouble(scanner.nextLine());

                Truck truck = new Truck(plate, manufacturer, yearOfManufacturer, owner, load);
                truckService.create(truck);
            }
            case 2 -> {
                System.out.print("Number of seat:");
                int numberOfSeat = Integer.parseInt(scanner.nextLine());
                System.out.print("Type of car:");
                String typeOfCar = scanner.nextLine();

                Car car = new Car(plate, manufacturer, yearOfManufacturer, owner, numberOfSeat, ConstantUtil.TypeOfCar.valueOf(typeOfCar));
                carService.create(car);
            }
            case 3 -> {
                System.out.print("Wattage:");
                Double wattage = Double.parseDouble(scanner.nextLine());

                Motor motor = new Motor(plate, manufacturer, yearOfManufacturer, owner, wattage);
                motorService.create(motor);
            }
        }
        System.out.println("Created successfully!");
    }

    private static void delete() {

    }
    private static void search() {

    }
}
