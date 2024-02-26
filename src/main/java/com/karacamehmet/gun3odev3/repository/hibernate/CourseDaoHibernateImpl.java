package com.karacamehmet.gun3odev3.repository.hibernate;

import com.karacamehmet.gun3odev3.model.Category;
import com.karacamehmet.gun3odev3.repository.dao.CourseDao;
import com.karacamehmet.gun3odev3.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseDaoHibernateImpl implements CourseDao {
    //These methods are just simulations, normally they will execute database processes.
    @Override
    public Course getCourseById(int courseId) {
        //course searched and returned
        System.out.println("Course has been brought by Hibernate.");
        return new Course(courseId,"bla",0,0,0);
    }

    @Override
    public List<Course> getAllCourses() {
        //courses searched and returned
        System.out.println("Courses has been brought by Hibernate.");
        return new ArrayList<Course>();
    }

    @Override
    public void createCourse(Course course) {
        //course added
        System.out.println("Course has been added by Hibernate.");
    }

    @Override
    public void updateCourseById(int courseId, Course course) {
        //course searched and updated
        System.out.println("Course has been updated by Hibernate.");
    }

    @Override
    public void deleteCourseById(int courseId) {
        //course searched deleted
        System.out.println("Course has been deleted by Hibernate.");
    }
}
