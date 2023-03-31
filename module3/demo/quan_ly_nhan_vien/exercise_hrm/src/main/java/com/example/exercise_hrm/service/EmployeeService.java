package com.example.exercise_hrm.service;

import com.example.exercise_hrm.model.Employee;

import java.util.Date;
import java.util.List;

public interface EmployeeService {
    void add(Employee employee);
    void update(Employee employee);
    List<Employee> findAll();
    List<Employee> findByNameJob(String jobName);
    List<Employee> search(Date startDate, Date endDate);
}
