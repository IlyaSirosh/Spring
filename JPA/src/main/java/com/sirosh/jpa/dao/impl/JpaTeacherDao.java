package com.sirosh.jpa.dao.impl;

import com.sirosh.jpa.dao.TeacherDao;
import com.sirosh.jpa.entity.Teacher;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Illya on 4/3/17.
 */

@Repository
@Transactional
public class JpaTeacherDao implements TeacherDao {

    @PersistenceContext
    private EntityManager em;

    public void addTeacher(Teacher teacher) {
        em.persist(teacher);
    }

    public Teacher getTeacherById(int id) {
        return em.find(Teacher.class,id);
    }

    public void saveTeacher(Teacher teacher) {
        em.merge(teacher);
    }
}
