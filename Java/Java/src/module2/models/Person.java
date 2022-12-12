package module2.models;

import case_study.services.Service;

import java.io.Serializable;

public abstract class Person implements Serializable {
    protected String id;
    protected String fullName;
    protected String date;
    protected String gender;
    protected int numberPhone;

    public Person() {
    }

    public Person(String id, String fullName, String date, String gender, int numberPhone) {
        this.id = id;
        this.fullName = fullName;
        this.date = date;
        this.gender = gender;
        this.numberPhone = numberPhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", numberPhone=" + numberPhone +
                '}';
    }
}
