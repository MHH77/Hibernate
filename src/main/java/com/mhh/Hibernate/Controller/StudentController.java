package com.mhh.Hibernate.Controller;

import com.mhh.Hibernate.Domain.Student;
import com.mhh.Hibernate.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/student")
    public Student createStudent() {
        return studentService.saveStudent();
    }
}