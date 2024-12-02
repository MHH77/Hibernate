package com.mhh.Hibernate.Controller;

import com.mhh.Hibernate.Service.InstructorService;
import com.mhh.Hibernate.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class StudentController {

    private final StudentService studentService;
    private final InstructorService instructorService;

    @PostMapping("/student")
    public void createStudent() {
        studentService.saveStudent();
        instructorService.saveInstructor();
    }

}