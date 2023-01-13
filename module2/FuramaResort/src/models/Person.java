package models;

public abstract class Person {
    protected String idCode;
    protected String namePerson;
    protected String dateOfBirth;
    protected String sex;
    protected String idPerson;
    protected String phoneNumber;
    protected String emailAddress;

    public Person(String idCode, String namePerson, String dateOfBirth, String sex, String idPerson, String phoneNumber, String emailAddress) {
        this.idCode = idCode;
        this.namePerson = namePerson;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.idPerson = idPerson;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Person() {
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
