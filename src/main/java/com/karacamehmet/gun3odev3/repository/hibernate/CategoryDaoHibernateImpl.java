package com.karacamehmet.gun3odev3.repository.hibernate;

import com.karacamehmet.gun3odev3.repository.dao.CategoryDao;
import com.karacamehmet.gun3odev3.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDaoHibernateImpl implements CategoryDao {
    //These methods are just simulations, normally they will execute database processes.

    @Override
    public Category getCategoryById(int categoryId) {
        //category searched and returned
        System.out.println("Category has been brought by Hibernate.");
        return new Category(categoryId,"bla");
    }

    @Override
    public List<Category> getAllCategories() {
        //categories searched and returned
        System.out.println("Categories has been brought by Hibernate.");
        return new ArrayList<Category>();
    }

    @Override
    public void createCategory(Category category) {
        //category added
        System.out.println("Category has been added by Hibernate.");
    }

    @Override
    public void updateCategoryById(int categoryId, Category category) {
        //category searched and updated
        System.out.println("Category has been updated by Hibernate.");
    }

    @Override
    public void deleteCategoryById(int categoryId) {
        //category searched and deleted
        System.out.println("Category has been deleted by Hibernate.");
    }
}
