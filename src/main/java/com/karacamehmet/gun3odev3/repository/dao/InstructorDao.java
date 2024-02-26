package com.karacamehmet.gun3odev3.repository.dao;

import com.karacamehmet.gun3odev3.model.Instructor;

import java.util.List;

public interface InstructorDao {
    Instructor getInstructorById(int instructorId);

    List<Instructor> getAllInstructors();

    void createInstructor(Instructor instructor);

    void updateInstructorById(int instructorId, Instructor instructor);

    void deleteInstructorById(int instructorId);
}
