package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        System.out.println("Bắt đầu");
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        do {
            flag=false;
            System.out.println("nhập tuổi");
            int age =0;
            try {
                age = Integer.parseInt(scanner.nextLine());
                checkAge(age);
            } catch (AgeExeption ageExeption) {
                System.out.println(ageExeption.getMessage());
                System.out.println("nhập lại tuổi");
                flag=true;
            }catch (NumberFormatException e){
                flag=true;
                e.printStackTrace();
                System.out.println("đang nhập chữ");
            }
        }while (flag);

//        System.out.println(method1());
//        try {
//            method2("src\\ss15_exception\\student.csv");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        System.out.println("Kết thúc");
    }

    public static int method1() {
        int[] arr = {10, 20, 30};
        int index = -1;
        int element = 0;
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        do {
            flag = false;
            System.out.println("nhập vào vị trí phần tử cần lấy");
            try {
                String str = scanner.nextLine();
                index = Integer.parseInt(str);
                element = arr[index];
                return element;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Lỗi nhập chữ");
                flag = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Lỗi truy cập ngoài phần tử mảng");
                element = arr[arr.length - 1];
            } catch (Exception e) {
                System.out.println("chưa biết lỗi");
            } finally {
                System.out.println("khối finally này luôn chạy");
            }
        } while (flag);

        System.out.println("Giá trị phần tử cần lấy ra " + element);
      return element;
    }

    public static void method2(String filePath) throws FileNotFoundException {

            FileReader fileReader = new FileReader(filePath);

    }

    public static void checkAge(int age) throws AgeExeption {
        if (age < 0) {
            throw  new AgeExeption("tuổi nhỏ hơn 0");
            // sử dụng exceptio do người dùng định nghĩa
        } else if (age > 200) {
           throw new AgeExeption("tuổi lơp hơn 200");
        }
    }
}
