package Case_study_new.controllers;

import Case_study_new.libs.CatchAgeExceptionImp;
import Case_study_new.libs.CatchRegexIntegerImpl;
import Case_study_new.libs.CatchRegexString;
import Case_study_new.libs.CatchRegexStringImp;
import Case_study_new.services.class_service.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerManagement {
    private static final Scanner scanner = new Scanner(System.in);
    public void customerMenu() {
        while (true) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return menu");
            boolean checkLoop = false;
            int choice = 0;
            while (!checkLoop){
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    checkLoop = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Nhập số cho chính xác");
                }
            }
            switch (choice) {
                case 1:
                    new CustomerServiceImpl().display();
                    break;
                case 2:
                    new CustomerServiceImpl().add(new CatchAgeExceptionImp(), new CatchRegexStringImp(), new CatchRegexIntegerImpl());
                    break;
                case 3:
                    new CustomerServiceImpl().edit(new CatchAgeExceptionImp(),  new CatchRegexStringImp());
                    break;
                case 4:
                    return;
            }
        }
    }
}
