package com.example.end_exam_2.service;



import com.example.end_exam_2.model.Category;

import java.util.List;

public interface CategoryService {
    Category findById(int id_product);

    List<Category> findAll();
}
