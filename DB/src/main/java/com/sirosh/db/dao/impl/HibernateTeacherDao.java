package com.sirosh.db.dao.impl;

import com.sirosh.db.dao.TeacherDao;
import com.sirosh.db.domain.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Illya on 17.03.17.
 */
@Repository
public class HibernateTeacherDao implements TeacherDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }



    public void addTeacher(Teacher teacher) {
        currentSession().save(teacher);
    }

    public Teacher getTeacherById(int id) {
        return (Teacher) currentSession().get(Teacher.class,id);
    }

    public void saveTeacher(Teacher teacher) {
        currentSession().update(teacher);
    }
}
