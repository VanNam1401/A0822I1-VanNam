package demo;

public class Student {
    // thuộc tính, biến toàn cục, biến instance
    int id;
    String name;
    String address;
    String school;

    // constructor không tham số
    public Student() {
    }

    // constructor đầy đủ tham số
    public Student(int id, String name, String address, String school) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.school = school;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // hành vi => method
    public void study(String subject) {
        System.out.println(this.name + "đang học môn" + subject);
    }
}
