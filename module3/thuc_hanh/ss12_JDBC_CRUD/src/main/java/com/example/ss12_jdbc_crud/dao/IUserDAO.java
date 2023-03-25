package com.example.ss12_jdbc_crud.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.ss12_jdbc_crud.model.User;

public interface IUserDAO {
    void insertUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectAllUsers();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;
}
