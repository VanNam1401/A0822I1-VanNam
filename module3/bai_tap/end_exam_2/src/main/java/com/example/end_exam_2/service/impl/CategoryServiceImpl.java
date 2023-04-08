package com.example.end_exam.service.impl;

import com.example.end_exam.model.Category;
import com.example.end_exam.repository.CategoryRepository;
import com.example.end_exam.repository.impl.CategoryRepositoryImpl;
import com.example.end_exam.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository repository = new CategoryRepositoryImpl();

    @Override
    public Category findById(int id_product) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }
}
