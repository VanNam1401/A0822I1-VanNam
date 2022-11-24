package demo;

public class Student extends Person {
    private static String school = "codeGym";
    private int point;

    Student() {
        System.out.println("Constructor con");
    }

    public Student(int id, String name, String address, int point) {
        super(id, name, address);
        this.point = point;
    }

    // phương thức đang được ghi dè lại method của cha
    @Override
    void howToGo() {
        System.out.println("Sinh viên đi học bằng xe máy");
    }

    @Override
    public String toString() {
        return "Student{" +
                "point=" + point +
                '}';
    }

    public void study() {
        System.out.println("Sinh viên đang học");
    }
}
