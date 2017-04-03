package com.sirosh.jpa.dao;


import com.sirosh.jpa.entity.Teacher;

/**
 * Created by Illya on 17.03.17.
 */
public interface TeacherDao {

    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);
}
