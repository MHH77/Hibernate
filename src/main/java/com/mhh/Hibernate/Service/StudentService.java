package com.mhh.Hibernate.Service;

import com.mhh.Hibernate.Domain.Student;
import com.mhh.Hibernate.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;


@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student saveStudent() {
        Student student = new Student();
        student.setFirstName("ali jooonam");
        student.setLastName("Molaaa");
        student.setEmail("ali@example.com");
        //file name    image name
        Set<String> images = student.getImages();
        images.add("photo2.jpg");
        images.add("photo4.jpg");
        images.add("photo3.jpg");
        images.add("photo1.jpg");
        images.add("photo4.jpg");
        return studentRepository.save(student);


    }
}
