package com.example.testspring.service;

import com.example.testspring.entity.Student;
import com.example.testspring.repozitory.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo repo;

    public Student add (Student student) {
       return repo.save(student);
    }
    public List<Student> getAll(){
        return repo.findAll();
    }
    public Optional<Student> getID(Long id) {
        return repo.findById(id);
    }
    public void deleteStudentByID (Long id) {
        repo.deleteById(id);
    }
    public void updateStudent(Student student, Long id) {
        repo.save(student, id);
    }
}
