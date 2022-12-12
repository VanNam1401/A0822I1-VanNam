package viettuts;

import java.util.Scanner;

public class BaiTap2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap gia tri can tinh giai thua: ");
        int giaiThua = scanner.nextInt();
        System.out.println("Ket qua: "+tinhGiaiThua(giaiThua));
    }
    public static long tinhGiaiThua(int a){
        int total = 1;
        if(a == 0 || a == 1){
            return total;
        }else{
            for(int i = 2 ; i <= a;i++){
                total *= i;
            }
            return total;
        }
    }

    public static long giaiThuaDeQuy(int a){
        if(a > 0){
            return a * giaiThuaDeQuy(a -1);
        }else{
            return 1;
        }
    }

}
