package Case_study_new.services.class_service;

import Case_study_new.libs.BookingComparator;
import Case_study_new.libs.CatchRegexString;
import Case_study_new.models.*;
import Case_study_new.services.BookingService;
import Case_study_new.utils.ReadAndWriteBooking;
import Case_study_new.utils.class_ReadAndWrite.ReadAndWriteFacilityImp;

import javax.print.DocFlavor;
import java.io.File;
import java.time.Year;
import java.util.*;
import java.util.regex.Pattern;

public class BookingServiceImpl implements BookingService {
    public static void main(String[] args) {
        new BookingServiceImpl().regexDate();
    }

    private static final Scanner scanner = new Scanner(System.in);

    private static Set<Booking> myTree = new TreeSet<>(new BookingComparator());

    @Override
    public void displayListBooking(ReadAndWriteBooking readAndWrite) {
        File file = new File("src/Case_study_new/data/booking.csv");
        if (file.exists()){
            for (Booking element : readAndWrite.readFile("src/Case_study_new/data/booking.csv")) {
                System.out.println(element.toString());
            }
        }else {
            System.out.println("Chưa có booking nào");
        }
    }

    private String regexDate(){
        String regexModel = "^[\\d]{2}[/][\\d]{2}[/][\\d]{4}$";
        boolean isRight = true;
        while (isRight){
            System.out.println("Day have form like: dd/MM/YYYY with currentYear");
            String day = scanner.nextLine();
            boolean rightDate = Pattern.matches(regexModel, day);
            if (rightDate){
                String[] dayString = day.split("/");
                String anObject = String.valueOf(Year.now());
                if (Integer.parseInt(dayString[0]) >31 || Integer.parseInt(dayString[1])>12
                        || !(Integer.parseInt(dayString[2])>=Integer.parseInt(anObject))){
                    System.out.println("Again");
                }else {
                    return day;
                }
            }else {
                System.out.println("Enter again");
            }
        }
        return null;
    }

    @Override
    public void addBooking(ReadAndWriteBooking readAndWrite) {
        File file = new File("src/Case_study_new/data/booking.csv");
        if (file.exists()){
            myTree = (Set<Booking>) readAndWrite.readFile("src/Case_study_new/data/booking.csv");
        }
        System.out.println("Danh sách customer");
        new CustomerServiceImpl().display();
        System.out.println("Danh sách facility ");
        new FacilityServiceImpl().display();
        String idBooking = "BO-000" + (myTree.size()+1);
        System.out.println("Id của lượt booking này" + idBooking);
        System.out.println("Ngày bắt đầu booking");
        String startDate = regexDate();
        System.out.println("Ngày kết thúc");
        String endDate = regexDate();
        Customer customer;
        Facility facility;
        do {
            customer = findCustomer();
            facility = findFacility();
        }while ((customer == null) || (facility == null));
        Booking booking = new Booking(idBooking, startDate, endDate, customer, facility);
        myTree.add(booking);
        readAndWrite.writeFile("src/Case_study_new/data/booking.csv", myTree);
        System.out.println("Ghi file thanh cong");
    }

    private static Customer findCustomer(){
        System.out.println("Nhập id của customer");
        String idCus = scanner.nextLine();
        for (Customer element : new CustomerServiceImpl().getList()) {
            if (element.getIdCode().equals(idCus)) {
                return element;
            }
        }
        return null;
    }

    private static Facility findFacility(){
        System.out.println("Nhập id của mã dịch vụ");
        String idFac = scanner.nextLine();
        Facility facility = null;
        Map<Facility, Integer> facilityIntegerMap = new FacilityServiceImpl().getList();
        for (Facility element : facilityIntegerMap.keySet()) {
            if (element.getIdFacility().equals(idFac)) {
                facility = element;
                int newValue = facilityIntegerMap.get(element) +1;
                facilityIntegerMap.put(element, newValue);
                break;
            }
        }
        Map<Facility, Integer> mapVilla = new LinkedHashMap<>();
        Map<Facility, Integer> mapHouse = new LinkedHashMap<>();
        Map<Facility, Integer> mapRoom = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            if (element.getKey() instanceof Villa) {
                mapVilla.put(element.getKey(), element.getValue());
                continue;
            }
            if (element.getKey()  instanceof House) {
                mapHouse.put(element.getKey(), element.getValue());
                continue;
            }
            if (element.getKey()  instanceof Room) {
                mapRoom.put(element.getKey(), element.getValue());
            }
        }
        new ReadAndWriteFacilityImp().writeFile("src/Case_study_new/data/villa.csv", mapVilla);
        new ReadAndWriteFacilityImp().writeFile("src/Case_study_new/data/house.csv", mapHouse);
        new ReadAndWriteFacilityImp().writeFile("src/Case_study_new/data/room.csv", mapRoom);
        return facility;
    }
}
