package com.example.exercise_hrm.repository;

import com.example.exercise_hrm.model.Job;

import java.util.List;

public interface JobRepository {
    Job findById(String jobCode);

    List<Job> findAll();
}
