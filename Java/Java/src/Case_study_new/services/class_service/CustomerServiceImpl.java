package Case_study_new.services.class_service;

import Case_study_new.libs.CatchAgeException;
import Case_study_new.libs.CatchRegexInteger;
import Case_study_new.libs.CatchRegexString;
import Case_study_new.models.Customer;
import Case_study_new.models.Employee;
import Case_study_new.services.CustomerService;
import Case_study_new.utils.ReadAndWrite;
import Case_study_new.utils.ReadAndWriteCustomer;
import Case_study_new.utils.class_ReadAndWrite.ReadAndWriteCustomerImp;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customers = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer element : new ReadAndWriteCustomerImp().readFile("src/Case_study_new/data/customer.csv")) {
            System.out.println(element.toString());
        }
    }
    //C0421G1_TranXuanTuanKiet_Module2\Module_2\src\Case_study_new\data\customer.csv

    @Override
    public void add(CatchAgeException catchAgeException, CatchRegexString catchRegexString, CatchRegexInteger catchRegexInteger) {
        if (new File("src/Case_study_new/data/customer.csv").exists()) {
            customers = (List<Customer>) new ReadAndWriteCustomerImp().readFile("src/Case_study_new/data/customer.csv");
        }
        String idCustom = "CU_000" + (customers.size() + 1);
        System.out.println("0. Mã số của khách hàng" + idCustom);
        System.out.println("1. Name customer");
        String nameCustomers = catchRegexString.regexString();
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
        System.out.println("7. Loại khách hàng: Diamond, Platinium, Gold, Silver, Member");
        String typeCustomer = catchRegexString.regexString();
        System.out.println("8. Địa chỉ");
        String address = catchRegexString.regexString();
        Customer element = new Customer(idCustom, nameCustomers, day, sex, idPerson, number, email, typeCustomer, address);
        customers.add(element);
        new ReadAndWriteCustomerImp().writeFile("src/Case_study_new/data/customer.csv", customers);
    }

    @Override
    public void edit(CatchAgeException catchAgeException, CatchRegexString catchRegexString) {
        if (new File("src/Case_study_new/data/customer.csv").exists()) {
            customers = (List<Customer>) new ReadAndWriteCustomerImp().readFile("src/Case_study_new/data/customer.csv");
        }
        System.out.println("Danh sach khach hang: ");
        for(Customer customer : customers){
            System.out.println(customer.toString());
        }
        System.out.println("Nhập id của customer cần edit");
        String idCode = catchRegexString.regexString();
        boolean checkCustomer = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getIdCode().equals(idCode)) {
                checkCustomer = true;
                System.out.println("Bạn muốn sửa thông tin nào cho " + customers.get(i).getNamePerson());
                System.out.println("1. Name employee");
                System.out.println("2. Ngày sinh");
                System.out.println("3. Giới tính");
                System.out.println("4. Số Chứng minh nhân dân");
                System.out.println("5. Số điện thoại");
                System.out.println("6. Địa chỉ email");
                System.out.println("7. Loại khách hàng");
                System.out.println("8. Địa chỉ của khách hàng");
                int choice = 0;
                boolean check = false;
                while (!check) {
                    try {
                        choice = Integer.parseInt(scanner.nextLine());
                        check = true;
                    } catch (NumberFormatException ex) {
                        System.err.println("Nhập đúng định dạng số");
                    }
                }
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên muốn sửa");
                        String name = catchRegexString.regexString();
                        customers.get(i).setNamePerson(name);
                        break;
                    case 2:
                        System.out.println("Nhập dateOfBirth");
                        String day = scanner.nextLine();
                        catchAgeException.checkDateOfBirth(day);
                        customers.get(i).setDateOfBirth(day);
                        break;
                    case 3:
                        System.out.println("Nhập giới tính");
                        String sex = catchRegexString.regexString();
                        customers.get(i).setDateOfBirth(sex);
                        break;
                    case 4:
                        System.out.println("Nhập CMND");
                        String idPerson = catchRegexString.regexString();
                        customers.get(i).setIdPerson(idPerson);
                        break;
                    case 5:
                        System.out.println("Nhập số điện thoại");
                        String number = catchRegexString.regexString();
                        customers.get(i).setPhoneNumber(number);
                        break;
                    case 6:
                        System.out.println("Nhập emailAddress");
                        String email = catchRegexString.regexString();
                        customers.get(i).setEmailAddress(email);
                        break;
                    case 7:
                        System.out.println("Nhập loại khách hàng: Diamond, Platinium, Gold, Silver, Member");
                        String typeCustomer = catchRegexString.regexString();
                        customers.get(i).setTypeCustomer(typeCustomer);
                        break;
                    case 8:
                        System.out.println("Nhập địa chỉ của khách hàng");
                        String address = catchRegexString.regexString();
                        customers.get(i).setAddress(address);
                        break;
                }
            }
        }
        if (checkCustomer) {
            System.out.println("Hoàn thành việc cập nhật");
            new ReadAndWriteCustomerImp().writeFile("src/Case_study_new/data/customer.csv", customers);
        } else {
            System.out.println("Không có id này trong list Employees");
        }
    }

    //Sử dụng getList để lấy danh sách customer phục vụ việc booking
    @Override
    public List<Customer> getList() {
        return (List<Customer>) new ReadAndWriteCustomerImp().readFile("src/Case_study_new/data/customer.csv");
    }
}
