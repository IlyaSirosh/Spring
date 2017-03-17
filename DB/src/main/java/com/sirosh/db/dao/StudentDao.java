package com.sirosh.db.dao;

import com.sirosh.db.domain.Student;

/**
 * Created by Illya on 17.03.17.
 */
public interface StudentDao {
    void addStudent(Student student);
    Student getStudentById(int id);
}
