package com.example.exoStudentV2.service;

import com.example.exoStudentV2.model.Student;

import java.util.List;

public interface IStudentService {

    List<Student> getAllStudents();

    Student getStudentById(Long id);

//    Student getStudentByLastname(String lastname);

    Student createStudent(Student student);

    Student updateStudent(Long id,Student updateStudent);

    void deleteStudent(Long id);

}