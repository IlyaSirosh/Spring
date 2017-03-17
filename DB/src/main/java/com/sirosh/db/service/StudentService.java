package com.sirosh.db.service;

import com.sirosh.db.dao.StudentDao;
import com.sirosh.db.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Illya on 17.03.17.
 */


public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public void addStudentToDb(Student student){
        if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
            studentDao.addStudent(student);
            System.out.println("Student have been saved "+student);
        }

    }
}
