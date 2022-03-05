package com.feignclient.student.service;


import com.feignclient.student.entity.Student;
import com.feignclient.student.entity.SubjectResponse;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(int id);

    List<SubjectResponse> getAllSubjects();

    String getServerPort();
}
