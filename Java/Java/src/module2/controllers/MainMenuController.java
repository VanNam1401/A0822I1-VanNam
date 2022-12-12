package module2.controllers;

import Case_study_new.controllers.*;
import case_study.services.Service;
import module2.libs.CatchAgeExceptionImp;
import module2.libs.CatchRegexStringImp;
import module2.services.impl.ServiceImpl;

import java.util.Scanner;

public class MainMenuController {
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Them moi sinh vien");
            System.out.println("2. Xoa sinh vien");
            System.out.println("3. Xem danh sach sinh vien ");
            System.out.println("4. Xem thong tin giao vien");
            System.out.println("5. Tim kiem sinh vien");
            System.out.println("6. Exit");
            System.out.println("Chon chuc nang: ");
            int choice = 0;
            boolean checkLoop = false;
            while (!checkLoop) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    checkLoop = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Nhập số cho chính xác");
                }
            }
            switch (choice) {
                case 1:
                    new ServiceImpl().addNewStudent(new CatchRegexStringImp(),new CatchAgeExceptionImp(),"src/module2/data/student.csv");
                    break;
                case 2:
                    new ServiceImpl().delStudent("src/module2/data/student.csv");
                    break;
                case 3:
                    new ServiceImpl().displayListStudent("src/module2/data/student.csv");
                    break;
                case 4:
                    new ServiceImpl().displayTeacher();
                    break;
                case 5:
                    new ServiceImpl().searchStudent("src/module2/data/student.csv");
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}

