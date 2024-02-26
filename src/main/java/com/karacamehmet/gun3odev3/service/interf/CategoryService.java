package com.karacamehmet.gun3odev3.service.interf;

import com.karacamehmet.gun3odev3.model.Category;

import java.util.List;

public interface CategoryService {
    Category getCategoryById(int categoryId) throws Exception;

    List<Category> getAllCategories() throws Exception;

    void createCategory(Category category) throws Exception;

    void updateCategoryById(int categoryId, Category category) throws Exception;

    void deleteCategoryById(int categoryId) throws Exception;
}
