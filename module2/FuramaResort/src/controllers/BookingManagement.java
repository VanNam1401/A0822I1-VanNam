package controllers;

import java.util.Scanner;

public class BookingManagement {
    private static Scanner scanner = new Scanner(System.in);

    public void bookingMenu() {
        while (true) {
            System.out.println("1. Add new booking" +
                    "\n2. Display list booking" +
                    "\n3. Create new contracts" +
                    "\n4. Display list contracts" +
                    "\n5. Edit contracts" +
                    "\n6. Return main menu");
            int choice = getChoice();
            switch (choice) {
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {
                    new FuramaController().displayMainMenu();
                }
            }
        }
    }

    private int getChoice() {
        int choice = -1;
        try {
            System.out.print("Enter choice 1 -> 6: ");
            choice = Integer.parseInt(scanner.nextLine());
            while (choice < 1 || choice > 6) {
                System.out.print("Enter choice again: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
        } catch (Exception e) {
            bookingMenu();
        }
        return choice;
    }
}
