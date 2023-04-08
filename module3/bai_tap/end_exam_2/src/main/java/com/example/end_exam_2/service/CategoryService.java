package com.example.end_exam.service;

import com.example.end_exam.model.Category;

import java.util.List;

public interface CategoryService {
    Category findById(int id_product);

    List<Category> findAll();
}
