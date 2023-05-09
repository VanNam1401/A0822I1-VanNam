package com.example.end_exam_2.repository.impl;

import com.example.end_exam_2.model.Product;
import com.example.end_exam_2.repository.ProductRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.example.end_exam_2.util.ConnectionUtil.getConnection;
import static com.example.end_exam_2.util.ConnectionUtil.getConnection;

public class ProductRepositoryImpl implements ProductRepository {
    private static final String SELECT_ALL = "select * from product join category on product.id_danh_muc = category.id_danh_muc;";
    private static final String DELETE_PRODUCT_ID = "delete from product where id = ?";
    private static final String INSERT_PRODUCT = "INSERT INTO product(name, price, so_luong, color, mo_ta, id_danh_muc) value (?,?,?,?,?,?)";
    private static final String SELECT_PRODUCT_BY_ID = "select * from product join category on product.id_danh_muc = category.id_danh_muc where id =?";
    private static final String UPDATE_PRODUCT_BY_ID = "update product set name =?, price =?, so_luong =?, color=?, mo_ta=?, id_danh_muc=? where id =?;";
    private static final String SELECT_ALL_BY_NAME_PRODUCT = "select * from product join category on product.id_danh_muc = category.id_danh_muc where name like ?";

    @Override
    public void add(Product product) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT)) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescribe());
            preparedStatement.setInt(6, product.getId_product());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean update(Product product) {
        boolean update =false;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT_BY_ID)) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescribe());
            preparedStatement.setInt(6, product.getId_product());
            preparedStatement.setInt(7, product.getId());
            update =  preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return update;
    }

    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int quantity = resultSet.getInt("so_luong");
                String color = resultSet.getString("color");
                String describe = resultSet.getString("mo_ta");
                int id_product = resultSet.getInt("id_danh_muc");
                String name_product = resultSet.getString("ten_product");
                list.add(new Product(id, name, price, quantity, color, describe, id_product, name_product));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Product findById(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int quantity = resultSet.getInt("so_luong");
                String color = resultSet.getString("color");
                String describe = resultSet.getString("mo_ta");
                int id_product = resultSet.getInt("id_danh_muc");
                String name_product = resultSet.getString("ten_product");
                return new Product(id, name, price, quantity, color, describe, id_product, name_product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        boolean rowDeleted = false;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_ID)) {
            preparedStatement.setInt(1, id);
            rowDeleted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    @Override
    public List<Product> findByNameJob(String name_product) {
        List<Product> list = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BY_NAME_PRODUCT)) {
            preparedStatement.setString(1, '%' + name_product +'%');
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int quantity = resultSet.getInt("so_luong");
                String color = resultSet.getString("color");
                String describe = resultSet.getString("mo_ta");
                int id_product = resultSet.getInt("id_danh_muc");
                list.add(new Product(id, name, price, quantity, color, describe, id_product, name_product));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
