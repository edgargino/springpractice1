package com.sg.classroster.interfaces;

import com.sg.classroster.entities.Student;

import java.util.List;

public interface StudentDAO {
    Student getStudentById(int id);
    List<Student> getAllStudents();
    Student addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);

}
