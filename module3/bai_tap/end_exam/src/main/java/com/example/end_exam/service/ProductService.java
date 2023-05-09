package com.example.end_exam.service;

import com.example.end_exam.model.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);

    boolean update(Product product);

    List<Product> findAll();

    Product findById(int id);

    boolean delete(int id);
}
