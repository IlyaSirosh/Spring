package com.sirosh.jpa.dao;

import com.sirosh.jpa.entity.Lecture;

/**
 * Created by Illya on 21.03.17.
 */
public interface LecturesDao {

    Lecture addLecture(Lecture lecture);
    Lecture getLectureById(int id);
    void saveLecture(Lecture lecture);

}
