package com.feignclient.student.controller;

import com.feignclient.student.entity.Student;
import com.feignclient.student.entity.SubjectResponse;
import com.feignclient.student.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentServiceImpl service;

    @GetMapping("/students")
    public List<Student> getALlStudents() {
        return service.getAllStudents();
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @GetMapping("/subjects")
    public List<SubjectResponse> getAllSubjects() {
        return service.getAllSubjects();
    }

    @GetMapping("/getPortB")
    public String getServerPort() {
        return service.getServerPort();
    }
}
