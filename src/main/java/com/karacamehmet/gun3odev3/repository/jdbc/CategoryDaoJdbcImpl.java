package com.karacamehmet.gun3odev3.repository.jdbc;

import com.karacamehmet.gun3odev3.repository.dao.CategoryDao;
import com.karacamehmet.gun3odev3.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDaoJdbcImpl implements CategoryDao {
    //These methods are just simulations, normally they will execute database processes.
    @Override
    public Category getCategoryById(int categoryId) {
        //category is searched and returned
        System.out.println("Category has been brought by JDBC.");
        return new Category(categoryId,"bla");
    }

    @Override
    public List<Category> getAllCategories() {
        //categories are searched and returned
        System.out.println("Categories has been brought by JDBC.");
        return new ArrayList<Category>();
    }

    @Override
    public void createCategory(Category category) {
        //category is added
        System.out.println("Category has been added by JDBC.");
    }

    @Override
    public void updateCategoryById(int categoryId, Category category) {
        //category is searched and updated
        System.out.println("Category has been updated by JDBC.");
    }

    @Override
    public void deleteCategoryById(int categoryId) {
        //category is searched and deleted
        System.out.println("Category has been deleted by JDBC.");
    }
}
