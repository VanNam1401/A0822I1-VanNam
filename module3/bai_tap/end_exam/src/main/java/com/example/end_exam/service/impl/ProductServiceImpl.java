package com.example.end_exam.service.impl;

import com.example.end_exam.model.Product;
import com.example.end_exam.repository.ProductRepository;
import com.example.end_exam.repository.impl.ProductRepositoryImpl;
import com.example.end_exam.service.ProductService;

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
}
