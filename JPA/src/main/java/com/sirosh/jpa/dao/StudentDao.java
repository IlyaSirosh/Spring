package com.sirosh.jpa.dao;


import com.sirosh.jpa.entity.Student;

/**
 * Created by Illya on 17.03.17.
 */
public interface StudentDao {
    Student addStudent(Student student);
    Student getStudentById(int id);
    void saveStudent(Student student);
}
