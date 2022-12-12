package Case_study_new.services.class_service;

import Case_study_new.libs.BookingComparator;
import Case_study_new.models.*;
import Case_study_new.services.ContactService;
import Case_study_new.utils.ReadAndWriteContract;
import Case_study_new.utils.class_ReadAndWrite.ReadAndWriteBookingImp;

import java.io.File;
import java.util.*;

public class ContactServiceImpl implements ContactService {

    private static java.util.List<Contract> arrayList = new ArrayList<>();

    private static final Scanner scanner = new Scanner(System.in);
    private static final String PATH_2 = "src/Case_study_new/data/contract.csv";
    @Override
    public void creatNewContract(ReadAndWriteContract readAndWrite) {
        if (isFileNotExist("src/Case_study_new/data/booking.csv")) {
            System.out.println("Ko có booking");
            return;
        }
        Set<Booking> bookingSet = (Set<Booking>) new ReadAndWriteBookingImp().readFile("src/Case_study_new/data/booking.csv");
        Queue<Booking> bookingQueue = new PriorityQueue<>(15, new BookingComparator());
        bookingQueue.addAll(bookingSet);
        Booking element;
        do {
            element = bookingQueue.poll();
            if (element != null) {
                System.out.println(element.toString());
                if (!(element.getFacility() instanceof Room)) {
//                    bookingSet.remove(element);
                    System.out.println("Tạo hợp đồng cho idCustomer: " + element.getCustomer().getIdCode());
                    System.out.println("Mã bookinig là:" + element.getIdBooking());
                    String idContract = "CT-000" + (arrayList.size()+1);
                    System.out.println("Id cho contract này" + idContract);
                    Customer idCus = element.getCustomer();
                    boolean rightType = true;
                    int prePayment = 0;
                    int totalPayment =0;
                    while (rightType){
                        try {
                            System.out.println("Số tiền khách hàng trả trước");
                            prePayment = Integer.parseInt(scanner.nextLine());
                            System.out.println("Tổng tiền khách hàng phải trả");
                            totalPayment = Integer.parseInt(scanner.nextLine());
                            rightType = false;
                        }catch (RuntimeException ex){
                            System.out.println("Nhập đúng dữ liệu số");
                        }
                    }
                    arrayList.add(new Contract(idContract, element, prePayment, totalPayment, idCus));
                }
            }
        } while (!bookingQueue.isEmpty());
//        new ReadAndWriteBookingImp().writeFile("src\\Case_study_new\\data\\booking.csv",bookingSet);
        readAndWrite.writeFile(PATH_2, arrayList);
    }

    private boolean isFileNotExist(String path){
        return !new File(path).exists();
    }

    @Override
    public void displayListContract(ReadAndWriteContract readAndWrite) {
        if (isFileNotExist(PATH_2)){
            System.out.println("Dont have any Contract to display");
            return;
        }
        arrayList = (ArrayList<Contract>) readAndWrite.readFile(PATH_2);
        for (Contract element : arrayList) {
            System.out.println(element.toString());
        }
    }

    @Override
    public void editContract(ReadAndWriteContract readAndWrite) {
        if (isFileNotExist(PATH_2)){
            System.out.println("Dont have any Contract to edit");
            return;
        }
        arrayList = (ArrayList<Contract>) readAndWrite.readFile(PATH_2);
        for (Contract element : arrayList) {
            System.out.println(element.toString());
        }
        System.out.println("Nhập id cho contract cần chỉnh sửa");
        String idContract = scanner.nextLine();
        boolean checkContract = false;
        Contract editContract = null;
        for (Contract element : arrayList) {
            if (element.getIdContract().equals(idContract)) {
                editContract = element;
                checkContract = true;
                break;
            }
        }
        if (checkContract) {
            while (true) {
                System.out.println("1. Chỉnh sửa tiền trả trước");
                System.out.println("2. Chỉnh sửa tổng tiền phải trả");
                System.out.println("3. Return to menu");
                System.out.println("Nhập số");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        boolean checkType = true;
                        int prePayment = 0;
                        while (checkType){
                            try {
                                System.out.println("Nhập số tiền trả trước");
                                prePayment = Integer.parseInt(scanner.nextLine());
                                checkType = false;
                            }catch (RuntimeException ex){
                                System.out.println("Nhập đúng dữ liệu số");
                            }
                        }
                        editContract.setPrePayment(prePayment);
                        break;
                    case 2:
                        boolean checkTypeSecond = true;
                        int totalPayment = 0;
                        while (checkTypeSecond){
                            try {
                                System.out.println("Nhập tổng tiền phải trả");
                                totalPayment = Integer.parseInt(scanner.nextLine());
                                checkTypeSecond = false;
                            }catch (RuntimeException ex){
                                System.out.println("Nhập đúng dữ liệu số");
                            }
                        }
                        editContract.setTotalPayment(totalPayment);
                        break;
                    case 3:
                        readAndWrite.writeFile(PATH_2, arrayList);
                        return;
                }
            }
        } else {
            System.out.println("Không có idContract này trong danh sách");
        }
    }
}
