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

    public Student updateStudent(Student student) {
        Student existingStudent = repository.findById(student.getId()).orElse(null);
        existingStudent.setInstitution_id(student.getInstitution_id());
        existingStudent.setStudent_id(student.getStudent_id());
        existingStudent.setInstitution_id(student.getInstitution_id());
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setReg_date(student.getReg_date());
        existingStudent.setDate_of_birth(student.getDate_of_birth());
        existingStudent.setAge(student.getAge());
        existingStudent.setGender(student.getGender());
        existingStudent.setNID(student.getNID());
        existingStudent.setOccupation(student.getOccupation());
        existingStudent.setPost_office(student.getPost_office());
        existingStudent.setUpazila(student.getUpazila());
        existingStudent.setDistrict(student.getDistrict());


        existingStudent.setDivision(student.getDivision());
        existingStudent.setContact_no(student.getContact_no());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setCreated_on(student.getCreated_on());
        existingStudent.setCreated_by(student.getCreated_by());
        existingStudent.setDistrict(student.getDistrict());

        existingStudent.setDegree(student.getDegree());
        existingStudent.setInstitute(student.getInstitute());
        existingStudent.setCompletion_year(student.getCompletion_year());
        existingStudent.setCGPA(student.getCGPA());

        return repository.save(existingStudent);
    }
}
