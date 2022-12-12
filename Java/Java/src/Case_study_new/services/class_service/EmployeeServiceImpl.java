package Case_study_new.services.class_service;

import Case_study_new.libs.CatchAgeException;
import Case_study_new.libs.CatchRegexInteger;
import Case_study_new.libs.CatchRegexString;
import Case_study_new.models.Customer;
import Case_study_new.models.Employee;
import Case_study_new.services.EmployeeService;
import Case_study_new.utils.class_ReadAndWrite.ReadAndWriteCustomerImp;
import Case_study_new.utils.class_ReadAndWrite.ReadAndWriteEmployeeImp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> employees = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee element : new ReadAndWriteEmployeeImp().readFile("src/Case_study_new/data/employees.csv")) {
            System.out.println(element.toString());
        }
    }
    //C0421G1_TranXuanTuanKiet_Module2\Module_2\src\Case_study_new\data

    @Override
    public void add(CatchAgeException catchAgeException, CatchRegexString catchRegexString, CatchRegexInteger catchRegexInteger) {
        if (new File("src/case_study/data/employee.csv").exists()){
            employees = (List<Employee>) new ReadAndWriteEmployeeImp().readFile("src/Case_study_new/data/employees.csv");
        }

//        String idEmploy = scanner.nextLine();
        String idEmploy = "EM_000" + (employees.size() +1);
        System.out.println("0. Mã số của nhân viên" + idEmploy);
        System.out.println("1. Name employee");
        String name = catchRegexString.regexString();
        System.out.println("2. Ngày sinh");
        String day = scanner.nextLine();
        catchAgeException.checkDateOfBirth(day);
        System.out.println("3. Giới tính");
        String sex = catchRegexString.regexString();
        System.out.println("4. Số Chứng minh nhân dân");
        String idPerson = catchRegexString.regexString();
        System.out.println("5. Số điện thoại");
        String number = catchRegexString.regexString();
        System.out.println("6. Địa chỉ email");
        String email = catchRegexString.regexString();
        System.out.println("7. Trình độ: Trung cấp, Cao đẳng, Đại học và sau đại học");
        String level = catchRegexString.regexString();
        System.out.println("8. Vị trí: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc");
        String position = catchRegexString.regexString();
        System.out.println("9. Salary");
//        boolean checkSalary = true;
        int salary = catchRegexInteger.regexInteger();
//        while (checkSalary){
//            try {
//                salary = Integer.parseInt(scanner.nextLine());
//                checkSalary = false;
//            }catch (RuntimeException ex){
//                System.out.println("Nhập số vào: ");
//            }
//        }
        Employee element = new Employee(idEmploy,name,day,sex,idPerson,number,email,level,position,salary);
        employees.add(element);
        new ReadAndWriteEmployeeImp().writeFile("src/Case_study_new/data/employees.csv",employees);
    }

    @Override
    public void edit(CatchAgeException catchAgeException, CatchRegexString catchRegexString) {
        if (new File("src/Case_study_new/data/employees.csv").exists()){
            employees = (List<Employee>) new ReadAndWriteEmployeeImp().readFile("src/Case_study_new/data/employees.csv");
        }
        System.out.println("Danh sach chinh sua: ");
        for(Employee employee : employees){
            System.out.println(employee.toString());
        }
        System.out.println("Nhập id employee muốn tìm kiếm");
        String idCode = catchRegexString.regexString();
        boolean checkEmploye = false;
        for (Employee employee : employees) {
            if (employee.getIdCode().equals(idCode)) {
                checkEmploye = true;
                System.out.println("Bạn muốn sửa thông tin nào cho" + employee.getNamePerson());
                System.out.println("1. Name employee");
                System.out.println("2. Ngày sinh");
                System.out.println("3. Giới tính");
                System.out.println("4. Số Chứng minh nhân dân");
                System.out.println("5. Số điện thoại");
                System.out.println("6. Địa chỉ email");
                System.out.println("7. Trình độ");
                System.out.println("8. Vị trí");
                System.out.println("9. Salary");
                int choice = 0;
                boolean check = false;
                while (!check){
                    try {
                        choice = Integer.parseInt(scanner.nextLine());
                        check = true;
                    }catch (NumberFormatException ex){
                        System.err.println("Nhập đúng định dạng số");
                    }
                }
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên muốn sửa");
                        String name = catchRegexString.regexString();
                        employee.setNamePerson(name);
                        break;
                    case 2:
                        System.out.println("Nhập dateOfBirth");
                        String day = scanner.nextLine();
                        catchAgeException.checkDateOfBirth(day);
                        employee.setDateOfBirth(day);
                        break;
                    case 3:
                        System.out.println("Nhập giới tính");
                        String sex = catchRegexString.regexString();
                        employee.setDateOfBirth(sex);
                        break;
                    case 4:
                        System.out.println("Nhập CMND");
                        String idPerson = catchRegexString.regexString();
                        employee.setIdPerson(idPerson);
                        break;
                    case 5:
                        System.out.println("Nhập số điện thoại");
                        String number = catchRegexString.regexString();
                        employee.setPhoneNumber(number);
                        break;
                    case 6:
                        System.out.println("Nhập emailAddress");
                        String email = catchRegexString.regexString();
                        employee.setEmailAddress(email);
                        break;
                    case 7:
                        System.out.println("Nhập trình độ:  Trung cấp, Cao đẳng, Đại học và sau đại học");
                        String level = catchRegexString.regexString();
                        employee.setLevel(level);
                        break;
                    case 8:
                        System.out.println("Nhập position: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc");
                        String position = catchRegexString.regexString();
                        employee.setPosition(position);
                        break;
                    case 9:
                        System.out.println("Nhập lương");
                        boolean checkSalary = true;
                        int salary = 0;
                        while (checkSalary) {
                            try {
                                salary = Integer.parseInt(scanner.nextLine());
                                checkSalary = false;
                            } catch (RuntimeException ex) {
                                System.out.println("Nhập số vào: ");
                            }
                        }
                        employee.setSalary(salary);
                        break;
                }
                break;
            }
        }
        if (checkEmploye){
            System.out.println("Hoàn thành việc cập nhật");
            new ReadAndWriteEmployeeImp().writeFile("src/Case_study_new/data/employees.csv",employees);
        }else {
            System.out.println("Không có id này trong list Employees");
        }

    }

}
