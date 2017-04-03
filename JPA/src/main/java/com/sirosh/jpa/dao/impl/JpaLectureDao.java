package com.sirosh.jpa.dao.impl;

import com.sirosh.jpa.dao.LecturesDao;
import com.sirosh.jpa.entity.Lecture;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Illya on 21.03.17.
 */
@Repository
@Transactional
public class JpaLectureDao implements LecturesDao {

    @PersistenceContext
    private EntityManager em;

    public Lecture addLecture(Lecture lecture) {

        em.persist(lecture);
        return lecture;
    }

    public Lecture getLectureById(int id) {
        return em.find(Lecture.class,id);
    }

    public void saveLecture(Lecture lecture) {
        em.merge(lecture);
    }
}
