package com.example.test.repository;

import com.example.test.model.Staff;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StaffRepository {
    private String URL = "jdbc:mysql://localhost:3306/test";
    private String UserName = "root";
    private String Password = "12345";
    private static final String SELECT_ALL = "select * from staff join job using(job_id)";
    private static final String INSERT_SQL = "Insert into staff" + "(name,  date_birth, address, day_start, day_end, salary, job_id) values " + "(?,?,?,?,?,?,?);";

    public StaffRepository() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, UserName, Password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public List<Staff> selectAll() {
        List<Staff> staff = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                LocalDate dateOfBirth = resultSet.getDate("date_birth").toLocalDate();
                String address = resultSet.getString("address");
                LocalDate dayStart = resultSet.getDate("day_start").toLocalDate();
                LocalDate endStart = resultSet.getDate("day_end").toLocalDate();
                int salary = resultSet.getInt("salary");
                String jobName = resultSet.getString("job_name");
                staff.add(new Staff(id, name, dateOfBirth, address, dayStart, endStart, salary, jobName));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return staff;
    }

    public void insertStaff(Staff staff) {

    }
}
