package com.sirosh.db;

import com.sirosh.db.domain.Student;
import com.sirosh.db.domain.Teacher;
import com.sirosh.db.service.StudentService;
import com.sirosh.db.service.TeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;


/**
 * Created by Illya on 17.03.17.
 */
public class App{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        StudentService worker =
                (StudentService) context.getBean("studentService");
        //new WorkWithStudents();
        Student testStudent = new Student("Vlad Valt", 5);
        worker.addStudentToDb(testStudent);


        TeacherService teacherService =
                (TeacherService) context.getBean("teacherService");
        Teacher teacher = new Teacher();
        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacherService.addTeacher(teacher);
        teacher.setBirthDate(new Date(1985,1,1));
        teacherService.saveTacher(teacher);
    }
}
