package com.example.ss12_jdbc_crud.dao;

import com.example.ss12_jdbc_crud.model.User;

import java.util.List;

public interface IUserDao {
    void insertUser(User user);
    User selectUser(int id);
    List<User> selectAllUser();
    boolean deleteUser(int id);
    boolean updateUser(User user);
}
