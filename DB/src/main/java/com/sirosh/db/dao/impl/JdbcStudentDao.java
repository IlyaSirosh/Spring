package com.sirosh.db.dao.impl;

import com.sirosh.db.dao.StudentDao;
import com.sirosh.db.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Illya on 17.03.17.
 */

@Repository
public class JdbcStudentDao implements StudentDao {

    private static final String SQL_INSERT_STUDENT = "INSERT INTO students (pib,course) VALUES (?,?)";
    private static final String SQL_SELECT_STUDENT_BY_ID = "SELECT id,pib,course FROM students WHERE id=?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addStudent(Student student) {
        jdbcTemplate.update(SQL_INSERT_STUDENT,student.getPib(),student.getCourse());
    }

    public Student getStudentById(int id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_STUDENT_BY_ID, new RowMapper<Student>() {
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student();
                student.setId(resultSet.getInt(1));
                student.setPib(resultSet.getString(2));
                student.setCourse(resultSet.getInt(3));
                return student;
            }
        },id);
    }
}
