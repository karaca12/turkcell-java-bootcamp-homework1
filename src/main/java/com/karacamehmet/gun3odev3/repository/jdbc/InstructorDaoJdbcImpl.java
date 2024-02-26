package com.karacamehmet.gun3odev3.repository.jdbc;

import com.karacamehmet.gun3odev3.repository.dao.InstructorDao;
import com.karacamehmet.gun3odev3.model.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorDaoJdbcImpl implements InstructorDao {
    //These methods are just simulations, normally they will execute database processes.
    @Override
    public Instructor getInstructorById(int instructorId) {
        //instructor searched and returned
        System.out.println("Instructor has been brought by JDBC.");
        return new Instructor(instructorId,"bla");
    }

    @Override
    public List<Instructor> getAllInstructors() {
        //instructors searched and returned
        System.out.println("Instructors has been brought by JDBC.");
        return new ArrayList<Instructor>();
    }

    @Override
    public void createInstructor(Instructor instructor) {
        //instructor added
        System.out.println("Instructor has been added by JDBC.");

    }

    @Override
    public void updateInstructorById(int instructorId, Instructor instructor) {
        //instructor searched and updated
        System.out.println("Instructor has been updated by JDBC.");
    }

    @Override
    public void deleteInstructorById(int instructorId) {
        //instructor searched and deleted
        System.out.println("Instructor has been deleted by JDBC.");
    }
}
