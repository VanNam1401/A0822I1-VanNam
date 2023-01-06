package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
        String regexClass = "^[AC]\\d{4}[IG]\\d$";
        String className1 = "C0uuu";
        String className2 = "C0922G1";
        //cách sử dụng regex
        //cách1
        System.out.println(className1.matches(regexClass));
        System.out.println(className2.matches(regexClass));
        // cách 2
        Pattern pattern = Pattern.compile(regexClass);
        System.out.println(pattern.matcher(className2));
        // cách 3
        Pattern pattern1 = Pattern.compile(regexClass);
        Matcher matcher = pattern1.matcher(className1);
        System.out.println(matcher.matches());
        String str = "hello                 world      việtnam      ";
        String[] arr = str.split("\\s+");
        System.out.println("số lượng tử trong chuỗi " + arr.length);
    }
}
