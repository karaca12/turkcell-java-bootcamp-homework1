package com.karacamehmet.gun3odev3.repository.dao;

import com.karacamehmet.gun3odev3.model.Category;

import java.util.List;

public interface CategoryDao {
    Category getCategoryById(int categoryId);

    List<Category> getAllCategories();

    void createCategory(Category category);

    void updateCategoryById(int categoryId, Category category);

    void deleteCategoryById(int categoryId);
}
