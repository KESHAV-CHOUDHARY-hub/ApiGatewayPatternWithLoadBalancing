package com.feignclient.subject.service;

import com.feignclient.subject.entity.Subject;
import com.feignclient.subject.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectServer {

    @Autowired
    SubjectRepo repo;

    @Override
    public List<Subject> getSubjects() {
        return repo.findAll();
    }

    @Override
    public Subject saveSubject(Subject subject) {
        return repo.save(subject);
    }

    @Override
    public Subject getSubject(int id) {
        return repo.findById(id).get();
    }
}
