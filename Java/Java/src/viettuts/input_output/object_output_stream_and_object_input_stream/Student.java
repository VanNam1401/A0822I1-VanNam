package viettuts.input_output.object_output_stream_and_object_input_stream;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionID = 1L;
    private String name;
    private int age;
    private int id;
    private String address;

    public Student() {
    }

    public Student(String name, int age, int id, String address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
