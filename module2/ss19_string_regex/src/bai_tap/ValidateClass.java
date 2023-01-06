package bai_tap;

public class ValidateClass {
    public static void main(String[] args) {
        String regex = "[ACP]\\d{4}[GHIKLM]";
        String nameClass = "C0318G";
        String nameClass2 = "M0318G";
        System.out.println(nameClass.matches(regex));
        System.out.println(nameClass2.matches(regex));

    }
}
