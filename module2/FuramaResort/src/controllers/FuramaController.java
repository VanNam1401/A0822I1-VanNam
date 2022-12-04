package controllers;

import java.util.Scanner;

public class FuramaController {
    private int chooseFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chọn dịch vụ: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private void executionFunction() {
        switch (chooseFunction()) {
            case 1:
                System.out.println("Employee Management: ");
                EmployeeController employeeController = new EmployeeController();
                employeeController.displayMainMenu();
                break;
            case 2:
                System.out.println("Customer Management: ");
                CustomerController customerController = new CustomerController();
                customerController.displayMainMenu();
                break;
            case 3:
                System.out.println("Facility Management: ");
                FacilityController facilityController = new FacilityController();
                facilityController.displayMainMenu();
                break;
            case 4:
                System.out.println("Booking Management: ");
                BookingController bookingController = new BookingController();
                bookingController.displayMainMenu();
                break;
            case 5:
                System.out.println("Promotion Management: ");
                PromotionController promotionController = new PromotionController();
                promotionController.displayMainMenu();
                break;
            case 6:
                System.out.println("Exit.");
                System.exit(0);
            default:
                while (chooseFunction() <= 0 || chooseFunction() > 6) {
                    displayMainMenu();
                }
                ;
        }
    }

    public void displayMainMenu() {
        do {
            System.out.println("Dịch vụ của Resort: " +
                    "\n 1.Employee Management " +
                    "\n 2.Customer Management" +
                    "\n 3.Facility Management " +
                    "\n 4.Booking Management" +
                    "\n 5.Promotion Management" +
                    "\n 6. Exit");
            executionFunction();
        } while (true);
    }
}
