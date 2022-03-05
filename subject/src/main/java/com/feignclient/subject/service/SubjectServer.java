package com.feignclient.subject.service;

import com.feignclient.subject.entity.Subject;

import java.util.List;

public interface SubjectServer {

    List<Subject> getSubjects();

    Subject saveSubject(Subject subject);

    Subject getSubject(int id);
}
