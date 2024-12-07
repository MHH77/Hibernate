package com.mhh.Hibernate.Service;

import com.mhh.Hibernate.Domain.Instructor;
import com.mhh.Hibernate.Repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InstructorService {
    private final InstructorRepository instructorRepository;

    public Instructor saveInstructor() {

        Instructor instructor = new Instructor("morteza","ahmadi","m@exam.com",2892.53453);
        return instructorRepository.save(instructor);
    }
}
