package com.sirosh.jpa;

import com.sirosh.jpa.entity.Address;
import com.sirosh.jpa.entity.Lecture;
import com.sirosh.jpa.entity.Student;
import com.sirosh.jpa.entity.Teacher;
import com.sirosh.jpa.service.LectureService;
import com.sirosh.jpa.service.StudentService;
import com.sirosh.jpa.service.TeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Illya on 21.03.17.
 */
public class App {


    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        Address address = new Address("Ukraine","Kiyv","Kyiv","Illinska","11");
        Teacher teacher = new Teacher("Pavlo","Doroshenko",new Date(1971,1,1),"+38011111111",address);

        List<Lecture> lectures = new ArrayList<Lecture>();
        lectures.add(new Lecture("Java",3.0));
        lectures.add(new Lecture("Go",4.0));

        Student student = new Student("Volko Vo Vo",3);

        teacher.setLectures(lectures);
        student.setLectures(lectures);

        TeacherService ts = (TeacherService)context.getBean("teacherService");
        StudentService ss = (StudentService)context.getBean("studentService");

        ts.addTeacher(teacher);
        ss.addStudentToDb(student);


    }
}
