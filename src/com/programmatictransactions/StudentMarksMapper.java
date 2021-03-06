package com.programmatictransactions;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author kohchuanhock on 24/9/14.
 */
public class StudentMarksMapper implements RowMapper<StudentMarks> {
        public StudentMarks mapRow(ResultSet rs, int rowNum) throws
                SQLException {
            StudentMarks studentMarks = new StudentMarks();
            studentMarks.setId(rs.getInt("id"));
            studentMarks.setName(rs.getString("name"));
            studentMarks.setAge(rs.getInt("age"));
            studentMarks.setSid(rs.getInt("sid"));
            studentMarks.setMarks(rs.getInt("marks"));
            studentMarks.setYear(rs.getInt("year"));
            return studentMarks;
        }
}
