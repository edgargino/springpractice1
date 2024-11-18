package com.sg.classroster.repositories;

import com.sg.classroster.entities.Teacher;
import com.sg.classroster.interfaces.TeacherDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TeacherDaoDB implements TeacherDAO {
    @Autowired
    JdbcTemplate jdbc;

    @Override
    public Teacher getTeacherById(int id){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Teacher> getAllTeachers(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Teacher addTeacher(Teacher teacher){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateTeacher(Teacher teacher){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteTeacherById(int id){
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

public static final class TeacherMapper implements RowMapper<Teacher> {

    @Override
    public Teacher mapRow(ResultSet rs, int index) throws SQLException {
        Teacher teacher = new Teacher();
        teacher.setId(rs.getInt("id"));
        teacher.setFirstName(rs.getString("firstName"));
        teacher.setLastName(rs.getString("lastName"));
        teacher.setSpecialty(rs.getString("specialty"));

        return teacher;
    }
}
