package Case_study_new.controllers;

import Case_study_new.libs.CatchAgeExceptionImp;
import Case_study_new.libs.CatchRegexIntegerImpl;
import Case_study_new.libs.CatchRegexStringImp;
import Case_study_new.services.class_service.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagement {
    private static Scanner scanner = new Scanner(System.in);
    public void employeesMenu(){
        while (true) {
            System.out.println("1. Display all employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Return menu");
            boolean checkLoop = false;
            int choiceSecond = 0;
            while (!checkLoop){
                try {
                    choiceSecond = Integer.parseInt(scanner.nextLine());
                    checkLoop = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Nhập số cho chính xác");
                }
            }
            switch (choiceSecond) {
                case 1:
                    new EmployeeServiceImpl().display();
                    break;
                case 2:
                    new EmployeeServiceImpl().add(new CatchAgeExceptionImp(),  new CatchRegexStringImp(),new CatchRegexIntegerImpl());
                    break;
                case 3:
                    new EmployeeServiceImpl().edit(new CatchAgeExceptionImp(),  new CatchRegexStringImp());
                    break;
                case 4:
                    return;
            }
        }
    }


}
