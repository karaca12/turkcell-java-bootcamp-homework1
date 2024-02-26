package com.karacamehmet.gun3odev3.repository.dao;

import com.karacamehmet.gun3odev3.model.Course;

import java.util.List;

public interface CourseDao {
    Course getCourseById(int courseId);

    List<Course> getAllCourses();

    void createCourse(Course course);

    void updateCourseById(int courseId, Course course);

    void deleteCourseById(int courseId);
}
