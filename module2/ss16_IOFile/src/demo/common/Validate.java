package demo.common;

public class Validate {
    public static boolean checkAge(int age){
        String regexAge ="^\\d{1,2}$";
        return String.valueOf(age).matches(regexAge);
    }
}
