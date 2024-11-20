package com.mhh.Hibernate.Service;

import com.mhh.Hibernate.Domain.Student;
import com.mhh.Hibernate.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student saveStudent() {
        Student student = new Student();
        student.setFirstName("ali");
        student.setLastName("bagheri");
        student.setEmail("ali@example.com");
        Set<String> images = student.getImages();
        images.add("photo1.jpg");
        images.add("photo2.jpg");
        images.add("photo3.jpg");
        images.add("photo4.jpg");
        images.add("photo4.jpg");//Duplicate , filtered at java level by Hashset!!
        return studentRepository.save(student);
    }
}
