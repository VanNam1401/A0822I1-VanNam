package com.example.exercise_hrm.repository.impl;

import com.example.exercise_hrm.model.Job;
import com.example.exercise_hrm.repository.JobRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.example.exercise_hrm.util.ConstantUtil.getConnection;


public class JobRepositoryImpl implements JobRepository {
    private static final String SELECT_ALL = "select * from job";

    @Override
    public Job findById(String jobCode) {
        return null;
    }

    @Override
    public List<Job> findAll() {
        List<Job> list = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idJob = resultSet.getInt("job_id");
                String nameJob = resultSet.getString("job_name");
                int minSalary = resultSet.getInt("min_salary");
                int maxSalary = resultSet.getInt("max_salary");
                list.add(new Job(idJob, nameJob, minSalary, maxSalary));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
