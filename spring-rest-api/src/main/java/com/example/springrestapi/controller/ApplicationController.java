package com.example.springrestapi.controller;

import com.example.springrestapi.model.Student;
import com.example.springrestapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RestController
public class ApplicationController {
    @Autowired
    private StudentService service;

    @GetMapping("/api/v1/users")
    public List<Student> findAllStudents() {
        return service.getStudents();
    }
    @PostMapping("/api/v1/users")
    public Student addStudent(
            @ModelAttribute Student student) throws IOException {

        return service.saveStudent(student);
    }

}
