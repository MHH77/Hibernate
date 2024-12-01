package com.mhh.Hibernate.Service;

import com.mhh.Hibernate.Domain.Student;
import com.mhh.Hibernate.Enum.Status;
import com.mhh.Hibernate.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student saveStudent() {
        Student student = new Student();
        student.setFirstName("vahid");
        student.setLastName("ghamari");
        student.setEmail("ghamari@gmail.com");
        student.setStatus(Status.ACTIVE);

        return studentRepository.save(student);

    }
}
