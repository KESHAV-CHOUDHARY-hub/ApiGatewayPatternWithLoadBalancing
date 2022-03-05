package com.feignclient.subject.controller;

import com.feignclient.subject.entity.Subject;
import com.feignclient.subject.service.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    Environment environment;

    @Autowired
    SubjectServiceImpl service;;

    @GetMapping("/subjects")
    public List<Subject> getSubjects() {
        return service.getSubjects();
    }

    @PostMapping("/subject")
    public Subject saveSubject(@RequestBody Subject subject) {
        return service.saveSubject(subject);
    }

    @GetMapping("/subject/{id}")
    public Subject getSubject(@PathVariable int id) {
        return service.getSubject(id);
    }

    @GetMapping("/port")
    public String getPort() {
      return "Port Number Is :- "+ environment.getProperty("local.server.port");
    }
}
