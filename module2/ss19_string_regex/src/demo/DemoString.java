package demo;

public class DemoString {
    public static void main(String[] args) {
        String s0 = "hello";
        String s1 = "hello";
        String s2 = "helloworld";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s0 == s1); // true
        System.out.println(s3 == s4);// false
        System.out.println(s1 == s3);// false
        System.out.println(s0.equals(s3));
        System.out.println(s1);
        s1 = s1 + "world";
        System.out.println(s1);
        System.out.println(s1 == s2);
        String s5 = s1;
        System.out.println(s1 == s5);
        System.out.println(s5);
        StringBuffer sb = new StringBuffer("vietnam");
        sb.append("vodich");
        System.out.println(sb);
    }
}
