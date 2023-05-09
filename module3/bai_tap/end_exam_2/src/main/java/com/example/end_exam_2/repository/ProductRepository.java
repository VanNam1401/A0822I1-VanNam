package com.example.end_exam_2.repository;

import com.example.end_exam_2.model.Product;

import java.util.List;

public interface ProductRepository {
    void add(Product product);

    boolean update(Product product);

    List<Product> findAll();

    Product findById(int id);

    boolean delete(int id);

    List<Product> findByNameJob(String name_product);

}
