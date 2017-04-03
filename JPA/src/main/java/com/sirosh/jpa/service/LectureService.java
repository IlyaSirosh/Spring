package com.sirosh.jpa.service;

import com.sirosh.jpa.dao.LecturesDao;
import com.sirosh.jpa.entity.Lecture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Illya on 21.03.17.
 */
@Service
public class LectureService {

    @Autowired
    LecturesDao lecturesDao;

    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }
}
