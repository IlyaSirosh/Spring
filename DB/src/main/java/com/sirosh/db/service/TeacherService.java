package com.sirosh.db.service;

import com.sirosh.db.dao.TeacherDao;
import com.sirosh.db.domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Illya on 17.03.17.
 */

@Transactional
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public Teacher addTeacher(Teacher teacher){
        teacherDao.addTeacher(teacher);
        System.out.println("Teacher has been added "+teacher);
        return teacher;
    }
    public Teacher getTeacherById(int id){
        return teacherDao.getTeacherById(id);
    }
    public void saveTacher(Teacher teacher){
        teacherDao.saveTeacher(teacher);
        System.out.println("Teacher has been saved "+teacher);
    }

}
