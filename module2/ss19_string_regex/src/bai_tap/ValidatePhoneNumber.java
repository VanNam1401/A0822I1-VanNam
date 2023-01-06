package bai_tap;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String regex = "\\((84)\\)\\-\\(0\\d{9}\\)";
        String numberPhone = "(84)-(0978489648)";
        String numberPhone2 = "(a8)-(22222222)";
        System.out.println(numberPhone.matches(regex));
        System.out.println(numberPhone2.matches(regex));
    }
}
