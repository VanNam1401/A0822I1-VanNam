package com.example.ss11_mvc.service;

import com.example.ss11_mvc.bean.Product;

import java.util.List;

public interface ProductService {
    void create (Product product);
    void delete (String id);
    void update (Product product);
    List<Product> findAll();
    Product findById(String id);
}
