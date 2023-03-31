package com.example.exercise_hrm.repository.impl;

import com.example.exercise_hrm.model.Employee;
import com.example.exercise_hrm.repository.EmployeeRepository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {


    @Override
    public void add(Employee employee) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public List<Employee> findAll() {
        List<Employee> list = new ArrayList<>();
        try (Connection connection = getCon) {

        }
        return null;
    }

    @Override
    public List<Employee> findByNameJob(String jobName) {
        return null;
    }

    @Override
    public List<Employee> search(Date startDate, Date endDate) {
        return null;
    }
}
