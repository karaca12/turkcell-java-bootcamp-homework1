package com.karacamehmet.gun3odev3.service;

import com.karacamehmet.gun3odev3.logging.Logger;
import com.karacamehmet.gun3odev3.model.Course;
import com.karacamehmet.gun3odev3.repository.dao.CourseDao;

import java.util.List;

public class CourseService {
    CourseDao courseDao;
    Logger logger;

    public CourseService(CourseDao courseDao, Logger logger) {
        this.courseDao = courseDao;
        this.logger = logger;
    }

    public Course getCourseById(int courseId) throws Exception {
        try {
            Course course = courseDao.getCourseById(courseId);
            System.out.println("Course has been brought successfully.");
            logger.log("Course has been brought successfully.");
            return course;
        } catch (Exception e) {
            logger.log("Couldn't bring the course.");
            throw new Exception("Couldn't bring the course.");
        }
    }

    public List<Course> getAllCourses() throws Exception {
        try {
            List<Course> courses = courseDao.getAllCourses();
            System.out.println("Course has been brought successfully.");
            logger.log("Course has been brought successfully.");
            return courses;
        } catch (Exception e) {
            logger.log("Couldn't bring the courses.");
            throw new Exception("Couldn't bring the courses.");
        }
    }

    public void createCourse(Course course) throws Exception {
        //if the database contains the course or there is a course named as ours, we will not add the new course to our database
        //if the price of the course is lower than 0, we will not add the new course to our database
        if ((courseDao.getAllCourses().contains(course) || courseDao.getCourseById(course.getCourseId()).equals(course))
                || course.getCoursePrice() < 0) {
            System.out.println("Couldn't add the course because this course already exists.");
            logger.log("Couldn't add the course because this course already exists.");
        } else {
            try {
                courseDao.createCourse(course);
                System.out.println("Course added successfully.");
                logger.log("Course added successfully.");
            } catch (Exception e) {
                logger.log("Couldn't add the course.");
                throw new Exception("Couldn't add the course.");
            }
        }
    }

    public void updateCourseById(int courseId, Course course) throws Exception {
        //if the database contains the course with the courseId and the new course is not contained in the database or there isn't a course named as it,
        //if the price of the course is not lower than 0
        // we will update the course
        if (courseDao.getAllCourses().contains(courseDao.getCourseById(courseId)) &&
                !(courseDao.getAllCourses().contains(course) ||
                        courseDao.getCourseById(course.getCourseId()).equals(course))) {
            try {
                courseDao.createCourse(course);
                System.out.println("Course added successfully.");
                logger.log("Course added successfully.");
            } catch (Exception e) {
                logger.log("Couldn't add the course.");
                throw new Exception("Couldn't add the course.");
            }
        } else {
            System.out.println("Couldn't add the course because this course already exists.");
            logger.log("Couldn't add the course because this course already exists.");
        }
    }

    public void deleteCourseById(int courseId) throws Exception {
        try {
            courseDao.deleteCourseById(courseId);
            System.out.println("Course has been deleted successfully.");
            logger.log("Course has been deleted successfully.");

        } catch (Exception e) {
            logger.log("Couldn't bring the course.");
            throw new Exception("Couldn't bring the course.");
        }
    }
}
