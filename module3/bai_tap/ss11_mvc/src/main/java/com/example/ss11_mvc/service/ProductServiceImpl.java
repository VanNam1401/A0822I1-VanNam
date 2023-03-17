package com.example.ss11_mvc.service;

import com.example.ss11_mvc.bean.Product;
import com.example.ss11_mvc.repository.ProductRepository;
import com.example.ss11_mvc.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public void create(Product product) {
        productRepository.create(product);
    }

    @Override
    public void delete(String id) {
        productRepository.delete(id);
    }

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(String id) {
        return productRepository.findById(id);
    }
}
