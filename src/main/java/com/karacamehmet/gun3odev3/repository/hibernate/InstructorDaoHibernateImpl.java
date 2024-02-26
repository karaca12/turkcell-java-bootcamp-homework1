package com.karacamehmet.gun3odev3.repository.hibernate;

import com.karacamehmet.gun3odev3.model.Category;
import com.karacamehmet.gun3odev3.model.Course;
import com.karacamehmet.gun3odev3.repository.dao.InstructorDao;
import com.karacamehmet.gun3odev3.model.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorDaoHibernateImpl implements InstructorDao {
    //These methods are just simulations, normally they will execute database processes.
    @Override
    public Instructor getInstructorById(int instructorId) {
        //instructor searched and returned
        System.out.println("Instructor has been brought by Hibernate.");
        return new Instructor(instructorId,"bla");
    }

    @Override
    public List<Instructor> getAllInstructors() {
        //instructors searched and returned
        System.out.println("Instructors has been brought by Hibernate.");
        return new ArrayList<Instructor>();
    }

    @Override
    public void createInstructor(Instructor instructor) {
        //instructor added
        System.out.println("Instructor has been added by Hibernate.");

    }

    @Override
    public void updateInstructorById(int instructorId, Instructor instructor) {
        //instructor searched and updated
        System.out.println("Instructor has been updated by Hibernate.");
    }

    @Override
    public void deleteInstructorById(int instructorId) {
        //instructor searched and deleted
        System.out.println("Instructor has been deleted by Hibernate.");
    }
}
