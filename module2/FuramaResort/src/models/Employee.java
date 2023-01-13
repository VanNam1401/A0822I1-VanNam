package models;

public class Employee extends Person{
    private String level;
    private String position;
    private int salary;

    public Employee(String idCode, String namePerson, String dateOfBirth, String sex, String idPerson, String phoneNumber, String emailAddress, String level, String position, int salary) {
        super(idCode, namePerson, dateOfBirth, sex, idPerson, phoneNumber, emailAddress);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", idCode='" + idCode + '\'' +
                ", namePerson='" + namePerson + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", idPerson='" + idPerson + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                "} " + super.toString();
    }
}
