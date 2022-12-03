package demo.service.impl;

import demo.model.Student;
import demo.service.IStudentService;

import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "Nam", "QN");
        students[1] = new Student(1, "Nam", "QN");
        students[2] = new Student(1, "Nam", "QN");
    }

    @Override
    public void display() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println((i + 1) + "." + students[i]);
            } else {
                break;
            }
        }
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap name: ");
        String name = scanner.nextLine();
        System.out.println("Nhap address: ");
        String address = scanner.nextLine();
        Student student = new Student(id, name, address);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    @Override
    public void delete() {
        delete();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon Student muon xoa: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        for (int i = 0; i < students.length; i++) {
            if (i == index) {
                for (int j = 0; j < students.length; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                break;
            }
        }
    }

    @Override
    public void update() {
        display();
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn Student muốn sửa");
        int index = Integer.parseInt(scanner.nextLine())-1;
        for (int i = 0; i < students.length; i++) {
            if (i == index) {
                System.out.println("chọn trường cần sửa" +
                        "\n 1. name"+
                        "\n 2. address"+
                        "\n 3.back main menu");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:
                        // sửa name
                        System.out.println("nhập tên cần sửa");
                        String newName = scanner.nextLine();
                        students[i].setName(newName);
                        break;
                    case 2:
                        // sửa address
                        System.out.println("nhập địa chỉ cần sửa");
                        String newAddress = scanner.nextLine();
                        students[i].setAddress(newAddress);
                        break;
                    default:
                        break;
                }

                break;
            }
        }
    }

    @Override
    public void search() {

    }
}
