package com.example.end_exam_2.repository;

import com.example.end_exam_2.model.Category;

import java.util.List;

public interface CategoryRepository {
    Category findById(int id_product);

    List<Category> findAll();
}
