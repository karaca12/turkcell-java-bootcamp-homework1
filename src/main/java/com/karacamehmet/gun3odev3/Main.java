package com.karacamehmet.gun3odev3;

import com.karacamehmet.gun3odev3.logging.impl.DatabaseLogger;
import com.karacamehmet.gun3odev3.logging.impl.EmailLogger;
import com.karacamehmet.gun3odev3.logging.impl.FileLogger;
import com.karacamehmet.gun3odev3.logging.interf.Logger;
import com.karacamehmet.gun3odev3.model.Category;
import com.karacamehmet.gun3odev3.model.Course;
import com.karacamehmet.gun3odev3.model.Instructor;
import com.karacamehmet.gun3odev3.repository.dao.CategoryDao;
import com.karacamehmet.gun3odev3.repository.dao.CourseDao;
import com.karacamehmet.gun3odev3.repository.dao.InstructorDao;
import com.karacamehmet.gun3odev3.repository.hibernate.CategoryDaoHibernateImpl;
import com.karacamehmet.gun3odev3.repository.hibernate.CourseDaoHibernateImpl;
import com.karacamehmet.gun3odev3.repository.hibernate.InstructorDaoHibernateImpl;
import com.karacamehmet.gun3odev3.repository.jdbc.CategoryDaoJdbcImpl;
import com.karacamehmet.gun3odev3.repository.jdbc.CourseDaoJdbcImpl;
import com.karacamehmet.gun3odev3.repository.jdbc.InstructorDaoJdbcImpl;
import com.karacamehmet.gun3odev3.service.impl.CategoryServiceImpl;
import com.karacamehmet.gun3odev3.service.impl.CourseServiceImpl;
import com.karacamehmet.gun3odev3.service.impl.InstructorServiceImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        //Loggers
        Logger fileLogger = new FileLogger();
        Logger emailLogger = new EmailLogger();
        Logger databaseLogger = new DatabaseLogger();

        //Repositories
        //Category
        CategoryDao categoryDaoHibernate = new CategoryDaoHibernateImpl();
        CategoryDao categoryDaoJdbc = new CategoryDaoJdbcImpl();
        //Course
        CourseDao courseDaoHibernate = new CourseDaoHibernateImpl();
        CourseDao courseDaoJdbc = new CourseDaoJdbcImpl();
        //Instructor
        InstructorDao instructorDaoHibernate = new InstructorDaoHibernateImpl();
        InstructorDao instructorDaoJdbc = new InstructorDaoJdbcImpl();


        //Entities
        //Category
        Category category1 = new Category(1, "Category1");
        Category category2 = new Category(2, "Category2");
        //Instructor
        Instructor instructor1 = new Instructor(1, "Instructor1");
        Instructor instructor2 = new Instructor(2, "Instructor2");
        //Course
        Course course1 = new Course(1, "Course1", 1000, 1, 1);
        Course course2 = new Course(2, "Course2", 500, 1, 2);
        Course course3 = new Course(3, "Course3", 100, 2, 1);
        Course course4 = new Course(4, "Course4", 2000, 2, 2);

        //Services
        //Category
        CategoryServiceImpl categoryServiceHibernate = new CategoryServiceImpl(categoryDaoHibernate, fileLogger);
        CategoryServiceImpl categoryServiceJdbc = new CategoryServiceImpl(categoryDaoJdbc, emailLogger);
        //Instructor
        InstructorServiceImpl instructorServiceHibernate = new InstructorServiceImpl(instructorDaoHibernate, databaseLogger);
        InstructorServiceImpl instructorServiceJdbc = new InstructorServiceImpl(instructorDaoJdbc, emailLogger);
        //Course
        CourseServiceImpl courseServiceHibernate = new CourseServiceImpl(courseDaoHibernate, fileLogger);
        CourseServiceImpl courseServiceJdbc = new CourseServiceImpl(courseDaoJdbc, databaseLogger);


        //Using the services
        categoryServiceHibernate.createCategory(category1);
        categoryServiceHibernate.getCategoryById(category1.getCategoryId());

        categoryServiceJdbc.createCategory(category2);
        categoryServiceJdbc.getAllCategories();

        instructorServiceHibernate.createInstructor(instructor1);
        instructorServiceHibernate.deleteInstructorById(instructor1.getInstructorId());

        instructorServiceJdbc.createInstructor(instructor2);
        instructorServiceJdbc.updateInstructorById(instructor2.getInstructorId(), instructor1);

        courseServiceHibernate.createCourse(course1);
        courseServiceHibernate.createCourse(course2);
        courseServiceHibernate.getAllCourses();

        courseServiceJdbc.createCourse(course3);
        courseServiceJdbc.createCourse(course4);
        courseServiceJdbc.deleteCourseById(course3.getCourseId());
        courseServiceJdbc.getCourseById(course4.getCourseId());


    }
}
