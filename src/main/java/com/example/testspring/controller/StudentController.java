package com.example.testspring.controller;

import com.example.testspring.entity.Student;
import com.example.testspring.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class StudentController {
    private final StudentService service;
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
       return service.add(student);
    }
    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Student> getID(@PathVariable Long id) {
        return service.getID(id).or(null);
    }
    @DeleteMapping("/{id}")
    public void deleteStudentByID (@PathVariable Long id) {
        service.deleteStudentByID(id);
    }
//    @PutMapping("/{id}")
//    public void updateStudent (@RequestBody Student student, @PathVariable Long id) {
//        service.updateStudent(student, id);
//    }
}
