package com.sg.classroster.interfaces;

import com.sg.classroster.entities.Teacher;

import java.util.List;

public interface TeacherDAO {
    Teacher getTeacherById(int id);
    List<Teacher> getAllTeachers();
    Teacher addTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacherById(int id);

}
