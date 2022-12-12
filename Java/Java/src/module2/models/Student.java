package module2.models;

public class Student extends Person{
    private String idClass;

    public Student() {
    }

    public Student(String id, String fullName, String date, String gender, int numberPhone, String idClass) {
        super(id, fullName, date, gender, numberPhone);
        this.idClass = idClass;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", numberPhone=" + numberPhone +
                ", idClass='" + idClass + '\'' +
                '}';
    }
}
