package com.karacamehmet.gun3odev3.service;

import com.karacamehmet.gun3odev3.logging.Logger;
import com.karacamehmet.gun3odev3.model.Course;
import com.karacamehmet.gun3odev3.model.Instructor;
import com.karacamehmet.gun3odev3.repository.dao.InstructorDao;

import java.util.List;

public class InstructorService {
    InstructorDao instructorDao;
    Logger logger;

    public InstructorService(InstructorDao instructorDao, Logger logger) {
        this.instructorDao = instructorDao;
        this.logger = logger;
    }

    public Instructor getInstructorById(int instructorId) throws Exception {
        try {
            Instructor instructor = instructorDao.getInstructorById(instructorId);
            System.out.println("Instructor has been brought successfully.");
            logger.log("Instructor has been brought successfully.");
            return instructor;
        } catch (Exception e) {
            logger.log("Couldn't bring the instructor.");
            throw new Exception("Couldn't bring the instructor.");
        }
    }

    public List<Instructor> getAllInstructors() throws Exception {
        try {
            List<Instructor> instructors = instructorDao.getAllInstructors();
            System.out.println("Instructor has been brought successfully.");
            logger.log("Instructor has been brought successfully.");
            return instructors;
        } catch (Exception e) {
            logger.log("Couldn't bring the instructors.");
            throw new Exception("Couldn't bring the instructors.");
        }
    }

    public void createInstructor(Instructor instructor) throws Exception {
        //if the database contains the instructor or there is a instructor named as ours, we will not add the new instructor to our database
        if (instructorDao.getAllInstructors().contains(instructor) || instructorDao.getInstructorById(instructor.getInstructorId()).equals(instructor)) {
            System.out.println("Couldn't add the instructor because this instructor already exists.");
            logger.log("Couldn't add the instructor because this instructor already exists.");
        } else {
            try {
                instructorDao.createInstructor(instructor);
                System.out.println("Instructor added successfully.");
                logger.log("Instructor added successfully.");
            } catch (Exception e) {
                logger.log("Couldn't add the instructor.");
                throw new Exception("Couldn't add the instructor.");
            }
        }
    }

    public void updateInstructorById(int instructorId, Instructor instructor) throws Exception {
        //if the database contains the instructor with the instructorId and the new instructor is not contained in the database or there isn't an instructor named as it,
        // we will update the instructor
        if (instructorDao.getAllInstructors().contains(instructorDao.getInstructorById(instructorId)) &&
                !(instructorDao.getAllInstructors().contains(instructor) ||
                        instructorDao.getInstructorById(instructor.getInstructorId()).equals(instructor))) {
            try {
                instructorDao.createInstructor(instructor);
                System.out.println("Instructor added successfully.");
                logger.log("Instructor added successfully.");
            } catch (Exception e) {
                logger.log("Couldn't add the instructor.");
                throw new Exception("Couldn't add the instructor.");
            }
        } else {
            System.out.println("Couldn't add the instructor because this instructor already exists.");
            logger.log("Couldn't add the instructor because this instructor already exists.");
        }
    }

    public void deleteInstructorById(int instructorId) throws Exception {
        try {
            instructorDao.deleteInstructorById(instructorId);
            System.out.println("Instructor has been deleted successfully.");
            logger.log("Instructor has been deleted successfully.");

        } catch (Exception e) {
            logger.log("Couldn't bring the instructor.");
            throw new Exception("Couldn't bring the instructor.");
        }
    }
}
