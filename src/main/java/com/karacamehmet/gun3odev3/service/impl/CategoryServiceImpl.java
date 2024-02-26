package com.karacamehmet.gun3odev3.service.impl;

import com.karacamehmet.gun3odev3.logging.interf.Logger;
import com.karacamehmet.gun3odev3.model.Category;
import com.karacamehmet.gun3odev3.repository.dao.CategoryDao;
import com.karacamehmet.gun3odev3.service.interf.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    CategoryDao categoryDao;
    Logger logger;


    public CategoryServiceImpl(CategoryDao categoryDao, Logger logger) {
        this.categoryDao = categoryDao;
        this.logger = logger;
    }
    @Override
    public Category getCategoryById(int categoryId) throws Exception {
        try {
            Category category = categoryDao.getCategoryById(categoryId);
            System.out.println("Category has been brought successfully.");
            logger.log("Category has been brought successfully.");
            return category;
        } catch (Exception e) {
            logger.log("Couldn't bring the category.");
            throw new Exception("Couldn't bring the category.");
        }
    }
    @Override
    public List<Category> getAllCategories() throws Exception {
        try {
            List<Category> categories = categoryDao.getAllCategories();
            System.out.println("Category has been brought successfully.");
            logger.log("Category has been brought successfully.");
            return categories;
        } catch (Exception e) {
            logger.log("Couldn't bring the categories.");
            throw new Exception("Couldn't bring the categories.");
        }
    }

    @Override
    public void createCategory(Category category) throws Exception {
        //if the database contains the category or there is a category names as ours we will not add the new category to our database
        if (categoryDao.getAllCategories().contains(category) || categoryDao.getCategoryById(category.getCategoryId()).equals(category)) {
            System.out.println("Couldn't add the category because this category already exists.");
            logger.log("Couldn't add the category because this category already exists.");
        } else {
            try {
                categoryDao.createCategory(category);
                System.out.println("Category added successfully.");
                logger.log("Category added successfully.");
            } catch (Exception e) {
                logger.log("Couldn't add the category.");
                throw new Exception("Couldn't add the category.");
            }

        }
    }

    @Override
    public void updateCategoryById(int categoryId, Category category) throws Exception {
        //if the database contains the category with the categoryId and the new category is not contained in the database or there isn't a category named as it,
        // we will update the category
        if (categoryDao.getAllCategories().contains(categoryDao.getCategoryById(categoryId)) &&
                !(categoryDao.getAllCategories().contains(category) ||
                        categoryDao.getCategoryById(category.getCategoryId()).equals(category))) {
            try {
                categoryDao.createCategory(category);
                System.out.println("Category added successfully.");
                logger.log("Category added successfully.");
            } catch (Exception e) {
                logger.log("Couldn't add the category.");
                throw new Exception("Couldn't add the category.");
            }
        } else {
            System.out.println("Couldn't add the category because this category already exists.");
            logger.log("Couldn't add the category because this category already exists.");
        }
    }
    @Override
    public void deleteCategoryById(int categoryId) throws Exception {
        try {
            categoryDao.deleteCategoryById(categoryId);
            System.out.println("Category has been deleted successfully.");
            logger.log("Category has been deleted successfully.");

        } catch (Exception e) {
            logger.log("Couldn't bring the category.");
            throw new Exception("Couldn't bring the category.");
        }
    }
}
