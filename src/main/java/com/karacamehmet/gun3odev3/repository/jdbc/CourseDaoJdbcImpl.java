package com.karacamehmet.gun3odev3.repository.jdbc;

import com.karacamehmet.gun3odev3.repository.dao.CourseDao;
import com.karacamehmet.gun3odev3.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseDaoJdbcImpl implements CourseDao {
    //These methods are just simulations, normally they will execute database processes.
    @Override
    public Course getCourseById(int courseId) {
        //course searched and returned
        System.out.println("Course has been brought by JDBC.");
        return new Course(courseId,"bla",0,0,0);
    }

    @Override
    public List<Course> getAllCourses() {
        //courses searched and returned
        System.out.println("Courses has been brought by JDBC.");
        return new ArrayList<Course>();
    }

    @Override
    public void createCourse(Course course) {
        //course added
        System.out.println("Course has been added by JDBC.");
    }

    @Override
    public void updateCourseById(int courseId, Course course) {
        //course searched and updated
        System.out.println("Course has been updated by JDBC.");
    }

    @Override
    public void deleteCourseById(int courseId) {
        //course searched deleted
        System.out.println("Course has been deleted by JDBC.");
    }
}
