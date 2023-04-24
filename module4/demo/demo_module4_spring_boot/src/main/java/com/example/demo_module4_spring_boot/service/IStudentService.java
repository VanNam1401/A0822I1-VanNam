package com.example.demo_module4_spring_boot.service;

import com.example.demo_module4_spring_boot.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();

    void save(Student student);

    Student getStudentById(int id);
}
