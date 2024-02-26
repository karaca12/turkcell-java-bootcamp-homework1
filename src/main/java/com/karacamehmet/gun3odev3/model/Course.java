package com.karacamehmet.gun3odev3.model;

public class Course {
    private int courseId;
    private String courseName;
    private double coursePrice;
    private int categoryId;
    private int instructorId;

    public Course(int courseId, String courseName, double coursePrice, int categoryId, int instructorId) {
        if (coursePrice < 0) {
            System.out.println("Course price cannot be less than 0.");
            throw new IllegalArgumentException("Course price cannot be less than 0.");
        } else {
            this.courseId = courseId;
            this.courseName = courseName;
            this.coursePrice = coursePrice;
            this.categoryId = categoryId;
            this.instructorId = instructorId;
        }
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        if (coursePrice < 0) {
            System.out.println("Course price cannot be less than 0.");
            throw new IllegalArgumentException("Course price cannot be less than 0.");
        } else {
            this.coursePrice = coursePrice;
        }

    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }
}
