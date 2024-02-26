package com.karacamehmet.gun3odev3.service.interf;

import com.karacamehmet.gun3odev3.model.Instructor;

import java.util.List;

public interface InstructorService {
    Instructor getInstructorById(int instructorId) throws Exception;

    List<Instructor> getAllInstructors() throws Exception;

    void createInstructor(Instructor instructor) throws Exception;

    void updateInstructorById(int instructorId, Instructor instructor) throws Exception;

    void deleteInstructorById(int instructorId) throws Exception;
}
