package com.shangjie.advancedcruddemo.dao;

import com.shangjie.advancedcruddemo.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

}
