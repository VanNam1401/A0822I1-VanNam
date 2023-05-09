package com.example.end_exam_2.service.impl;


import com.example.end_exam_2.model.Category;
import com.example.end_exam_2.repository.CategoryRepository;
import com.example.end_exam_2.repository.impl.CategoryRepositoryImpl;
import com.example.end_exam_2.service.CategoryService;

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
