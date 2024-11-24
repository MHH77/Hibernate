package com.mhh.Hibernate.Service;

import com.mhh.Hibernate.Domain.Student;
import com.mhh.Hibernate.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student saveStudent() {
        Student student = new Student();
        student.setFirstName("ali");
        student.setLastName("bagheri");
        student.setEmail("ali@example.com");
        //file name    image name
        Map<String,String> images = student.getImages();
        images.put("photo1.jpg","photo 1");
        images.put("photo2.jpg","photo 2");
        images.put("photo3.jpg","photo 3");
        images.put("photo4.jpg","photo 4");
        images.put("photo4.jpg","photo 4");
        return studentRepository.save(student);
    }
}
