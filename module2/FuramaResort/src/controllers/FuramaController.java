package controllers;

import java.util.Scanner;

public class FuramaController {
    private static final Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("1. Employee Management" +
                "\n2. Customer Management" +
                "\n3. Facility Management" +
                "\n4. Booking Management" +
                "\n5. Promotion Management" +
                "\n6. Exit");
        int choice = getChoice();
        switch (choice) {
            case 1 -> {
                new EmployeeManagement().employeeMenu();
            }
            case 2 -> {
                new CustomerManagement().customerMenu();
            }
            case 3 -> {
                new FacilityManagement().facilityMenu();
            }
            case 4 -> {
                new BookingManagement().bookingMenu();
            }
            case 5 -> {
                new PromotionManagement().promotionMenu();
            }
            case 6 -> {
                System.exit(0);
            }
        }

    }

    private int getChoice() {
        int choice = -1;
        try {
            System.out.print("Enter choice 1 -> 7: ");
            choice = Integer.parseInt(scanner.nextLine());
            while (choice < 1 || choice > 7) {
                System.out.print("Enter choice again: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
        } catch (Exception e) {
            displayMainMenu();
        }
        return choice;
    }
}
