package com.mhh.Hibernate.Service;

import com.mhh.Hibernate.Domain.Address;
import com.mhh.Hibernate.Domain.Student;
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

        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("San Francisco");
        address.setZipcode("101010");

        student.setHomeAddress(address);

        return studentRepository.save(student);

    }
}
