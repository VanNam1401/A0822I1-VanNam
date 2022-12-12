package Case_study_new.libs;

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
}
