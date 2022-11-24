package demo;

public class Person {
    private int id;
    private String name;
    private String address;

    Person() {
        System.out.println("Constructor cha");
    }

    Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void howToGo() {
        System.out.println("Người đi bộ");
    }

    // mehtod overloading mehthod trên
    void howToGo(String text) {
        System.out.println("Nguời đi bộ");
    }
}
