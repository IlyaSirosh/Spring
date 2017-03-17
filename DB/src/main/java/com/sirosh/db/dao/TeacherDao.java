package com.sirosh.db.dao;

import com.sirosh.db.domain.Teacher;

/**
 * Created by Illya on 17.03.17.
 */
public interface TeacherDao {

    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);
}
