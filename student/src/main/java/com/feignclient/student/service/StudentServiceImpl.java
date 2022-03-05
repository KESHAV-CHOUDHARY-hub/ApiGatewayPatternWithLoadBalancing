package com.feignclient.student.service;

import com.feignclient.student.entity.Student;
import com.feignclient.student.entity.SubjectResponse;
import com.feignclient.student.feignClient.SubjectClient;
import com.feignclient.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository;

    @Autowired
    SubjectClient client;

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<SubjectResponse> getAllSubjects() {
        return client.getAllSubjects();
    }

    @Override
    public String getServerPort() {
        return client.getServerPort();
    }
}
