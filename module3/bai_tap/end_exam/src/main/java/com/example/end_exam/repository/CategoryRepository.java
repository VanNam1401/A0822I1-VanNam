package com.example.end_exam.repository;

import com.example.end_exam.model.Category;

import java.util.List;

public interface CategoryRepository {
    Category findById(int id_product);

    List<Category> findAll();
}
