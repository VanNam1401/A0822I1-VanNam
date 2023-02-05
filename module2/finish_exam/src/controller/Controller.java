package controller;

import model.DanhBa;
import service.DanhBaService;
import util.ConstantUtil;
import util.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);
    private static DanhBaService service = new DanhBaService();

    public static void displayMenu() {
        while (true) {
            System.out.println("--- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ---");
            System.out.print("1. Xem danh sách." + "\n2. Thêm mới." + "\n3. Cập nhật." + "\n4. Xóa." + "\n5. Tìm kiếm." + "\n6. Đọc từ file" + "\n7. Ghi vào file." + "\n8. Thoát.");
            int choice = getChoice(1, 8);
            switch (choice) {
                case 1 -> {
                    List<DanhBa> list = service.findAll();
                    display(list);
                }
                case 2 -> {
                    add();
                }
                case 3 -> {
                    update();
                }
                case 4 -> {
                    delete();
                }
                case 5 -> {
                    search();
                }
                case 6 -> {
                    readFile();
                }
                case 7 -> {
                    writeFile();
                }
                case 8 -> {
                    System.exit(0);
                }
            }
        }
    }

    private static void display(List<DanhBa> danhBaList) {
        System.out.printf("%-20s %-20s %-30s %-20s %-20s %n", "PHONE NUMBER", "GROUP", "YOUR NAME", "SEX", "ADDRESS");
        System.out.println("--------------------------------------------------------------------------------------------------------");

        for (DanhBa danhBa : danhBaList) {
            System.out.printf("%-20s %-20s %-30s %-20s %-20s %n", danhBa.getPhoneNumber(), danhBa.getGroup(), danhBa.getName(), danhBa.getSex(), danhBa.getAddress());
        }
    }

    private static void add() {
        System.out.print("Enter your phoneNumber: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter your group: ");
        String group = scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your sex: ");
        String sex = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        System.out.print("Enter your birthday: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Enter your address email: ");
        String email = scanner.nextLine();
        DanhBa danhBa = new DanhBa(phoneNumber, group, name, sex, address, dateOfBirth, email);
        service.create(danhBa);
    }

    private static void update() {
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
//        List<DanhBa> danhBaList = service.search(phoneNumber);
    }

    private static void delete() {
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        DanhBa danhBa = service.search(phoneNumber);
        if (danhBa != null) {
            service.delete(danhBa);
        } else {
            System.out.println("Không tìm được danh bạ với số điện thoại trên");
        }
    }

    private static void search() {
        System.out.println("--- SEARCH ---");
        System.out.println("1. Phone" + "\n2. Name");
        int choice = getChoice(1, 2);
        switch (choice) {
            case 1 -> {
                System.out.print("Enter your phone: ");
                String phone = scanner.nextLine();
                List<DanhBa> danhBaList = service.searchPhone(phone);
                if (!danhBaList.isEmpty()) {
                    display(danhBaList);
                }
            }
            case 2 -> {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                List<DanhBa> danhBaList = service.searchName(name);
                if (!danhBaList.isEmpty()) {
                    display(danhBaList);
                }
            }
        }
    }

    private static void readFile() {
        service.readFile();
    }

    private static void writeFile() {
        service.writeFile();
        System.out.println("Success");
    }

    private static int getChoice(int start, int end) {
        System.out.print("\nEnter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        while (choice > end || choice < start) {
            System.out.print("\nEnter choice again: ");
            choice = Integer.parseInt(scanner.nextLine());
        }
        return choice;
    }
}
