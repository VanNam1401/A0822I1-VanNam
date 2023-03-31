package com.example.exercise_hrm.service;

import com.example.exercise_hrm.model.Job;

import java.util.List;

public interface JobService {
    Job findById(String jobCode);

    List<Job> findAll();
}
