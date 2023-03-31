package com.example.test.model;

import java.time.LocalDate;
import java.util.Date;

public class Staff {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String address;
    private LocalDate dayStart;
    private LocalDate dayEnd;
    private int salary;
    private int jobID;

    private String jobName;

    public Staff() {
    }

    public Staff(int id, String name, LocalDate dateOfBirth, String address, LocalDate dayStart, LocalDate dayEnd, int salary, String jobName) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.salary = salary;
        this.jobName = jobName;
    }

    public Staff(int id, String name, LocalDate dateOfBirth, String address, LocalDate dayStart, LocalDate dayEnd, int salary, int jobID) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.salary = salary;
        this.jobID = jobID;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDayStart() {
        return dayStart;
    }

    public void setDayStart(LocalDate dayStart) {
        this.dayStart = dayStart;
    }

    public LocalDate getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(LocalDate dayEnd) {
        this.dayEnd = dayEnd;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }
}
