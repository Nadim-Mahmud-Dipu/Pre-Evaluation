package com.example.springrestapi.service;

import com.example.springrestapi.model.Student;
import com.example.springrestapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student saveStudent(Student student) {
        System.out.println(student.getCGPA());
        return repository.save(student);
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Student getStudentByFirstName(String first_name) {
        return repository.findByFirstName(first_name);
    }

}
