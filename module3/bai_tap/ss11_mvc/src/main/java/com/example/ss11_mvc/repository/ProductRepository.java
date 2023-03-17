package com.example.ss11_mvc.repository;

import com.example.ss11_mvc.bean.Product;

import java.util.List;

public interface ProductRepository {
    void create (Product product);
    void delete (String id);
    void update (Product product);
    List<Product> findAll();
    Product findById(String id);
}
