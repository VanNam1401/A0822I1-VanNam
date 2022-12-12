package module2.libs;

import java.util.Scanner;

public class CatchRegexStringImp implements CatchRegexString {
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public String regexString() {
        boolean isNotNull = true;
        String regexString = null;
        while (isNotNull){
            System.out.println("Please enter your String: ");
            regexString = scanner.nextLine();
            if (!(regexString.equals(""))){
                isNotNull = false;
            }
        }
        return regexString;
    }

    @Override
    public void regexNumberPhone(String phone) {
        
    }

    @Override
    public void regexFullName(String fullName) {
        boolean check = true;
        do{
            String[] str = fullName.split("");
            if(str.length < 4 || str.length >50){
                System.out.println("Nhap lai: ");
                fullName = scanner.nextLine();
            }
        }while(!check);
    }
}
