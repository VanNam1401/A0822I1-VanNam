package com.example.end_exam_2.repository.impl;

import com.example.end_exam_2.model.Category;
import com.example.end_exam_2.repository.CategoryRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.example.end_exam_2.util.ConnectionUtil.getConnection;

public class CategoryRepositoryImpl implements CategoryRepository {
    private static final String SELECT_ALL = "select * from category;";
    private static final String SELECT_JOB_BY_ID = "select * from category where id_danh_muc =?";


    @Override
    public Category findById(int id_product) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_JOB_BY_ID)) {
            preparedStatement.setInt(1, id_product);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String name_product = resultSet.getString("name_product");
                return new Category(id_product, name_product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Category> findAll() {
        List<Category> list = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id_product = resultSet.getInt("id_danh_muc");
                String name_product = resultSet.getString("ten_product");
                list.add(new Category(id_product, name_product));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
