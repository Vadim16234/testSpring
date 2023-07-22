package com.example.testspring.controller;

import com.example.testspring.entity.Student;
import com.example.testspring.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class StudentController {
    private final StudentService service;
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
       return service.add(student);
    }
}
