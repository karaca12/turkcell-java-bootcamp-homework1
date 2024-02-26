package com.karacamehmet.gun3odev3.service.interf;

import com.karacamehmet.gun3odev3.model.Course;

import java.util.List;

public interface CourseService {
    Course getCourseById(int courseId) throws Exception;

    List<Course> getAllCourses() throws Exception;

    void createCourse(Course course) throws Exception;

    void updateCourseById(int courseId, Course course) throws Exception;

    void deleteCourseById(int courseId) throws Exception;
}
