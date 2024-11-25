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
        student.setFirstName("hosein jooonam");
        student.setLastName("Molaaa");
        student.setEmail("hosein@example.com");
        //file name    image name
        Map<String, String> images = student.getImages();
        images.put("photo2.jpg", "description photo 2");
        images.put("photo4.jpg", "description photo 4");
        images.put("photo3.jpg", "description photo 3");
        images.put("photo1.jpg", "description photo 1");
        images.put("photo4.jpg", "description photo 4");
        return studentRepository.save(student);


    }
}
