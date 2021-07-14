package com.example.springrestapi.controller;

import com.example.springrestapi.model.Student;
import com.example.springrestapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
