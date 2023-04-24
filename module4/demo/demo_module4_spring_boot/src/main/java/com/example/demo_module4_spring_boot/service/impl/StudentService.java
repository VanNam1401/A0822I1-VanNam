package com.example.demo_module4_spring_boot.service.impl;

import com.example.demo_module4_spring_boot.model.Student;
import com.example.demo_module4_spring_boot.repository.IStudentRepository;
import com.example.demo_module4_spring_boot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository iStudentRepository;
    @Override
    public List<Student> getAll() {
        return iStudentRepository.findStudentByName("%nh%");
    }

    @Override
    public void save(Student student) {
        this.iStudentRepository.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        return iStudentRepository.findById(id).orElse(null);
    }
}
