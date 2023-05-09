package com.example.end_exam_2.service.impl;

import com.example.end_exam_2.model.Product;
import com.example.end_exam_2.repository.ProductRepository;
import com.example.end_exam_2.repository.impl.ProductRepositoryImpl;
import com.example.end_exam_2.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository repository = new ProductRepositoryImpl();

    @Override
    public void add(Product product) {
        repository.add(product);
    }

    @Override
    public boolean update(Product product) {
        return repository.update(product);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }

    @Override
    public List<Product> findByNameJob(String name_product) {
        return repository.findByNameJob(name_product);
    }
}
