package com.feignclient.student.feignClient;

import com.feignclient.student.entity.SubjectResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(value = "Subject-Client", url = "http://SUBJECT-SERVICE")
@FeignClient(name = "http://SUBJECT-SERVICE/subject")
public interface SubjectClient {

    @GetMapping("/subjects")
    public List<SubjectResponse> getAllSubjects();

    @GetMapping("/port")
    String getServerPort();
}
