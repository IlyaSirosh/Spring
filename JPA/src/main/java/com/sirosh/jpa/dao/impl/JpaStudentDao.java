package com.sirosh.jpa.dao.impl;

import com.sirosh.jpa.dao.StudentDao;
import com.sirosh.jpa.entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Illya on 21.03.17.
 */
@Repository
@Transactional
public class JpaStudentDao implements StudentDao {

    @PersistenceContext
    private EntityManager em;

    public Student addStudent(Student student) {
        em.persist(student);
        return student;
    }

    public Student getStudentById(int id) {
        return em.find(Student.class,id);
    }

    public void saveStudent(Student student){
        em.merge(student);
    }
}
