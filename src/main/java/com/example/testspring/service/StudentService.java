package com.example.testspring.service;

import com.example.testspring.entity.Student;
import com.example.testspring.repozitory.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo repo;

    public Student add (Student student) {
       return repo.save(student);
    }

}
