package bai_tap;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName() + " - " + student.getClasses());
        student.setName("Nam");
        student.setClasses("A08");
        System.out.println(student.getName() + " - " + student.getClasses());
    }
}
