package module2.models;

public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String id, String fullName, String date, String gender, int numberPhone) {
        super(id, fullName, date, gender, numberPhone);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", numberPhone=" + numberPhone +
                '}';
    }
}
