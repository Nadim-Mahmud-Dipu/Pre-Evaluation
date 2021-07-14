package com.example.springrestapi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT_DATA")
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer institution_id;
    private Integer student_id;
    private String firstName;
    private String lastName;
    private Date reg_date;
    private Date date_of_birth;
    private Integer age;
    private String gender;
    private Long NID;
    private String occupation;
    private String street;
    private String post_office;
    private String upazila;
    private String district;
    private String division;
    private String contact_no;
    private String email;

    @Lob
    private byte[] photo;

    private Date created_on;
    private String created_by;

    protected String degree;
    private String institute;
    private Integer completion_year;
    private Float cgpa;

    public Student(Integer institution_id, Integer student_id, String firstName, String lastName, Date reg_date, Date date_of_birth, Integer age, String gender, Long NID, String occupation, String street, String post_office, String upazila, String district, String division, String contact_no, String email, byte[] photo, Date created_on, String created_by, String degree, String institute, Integer completion_year, Float CGPA) {
        this.institution_id = institution_id;
        this.student_id = student_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.reg_date = reg_date;
        this.date_of_birth = date_of_birth;
        this.age = age;
        this.gender = gender;
        this.NID = NID;
        this.occupation = occupation;
        this.street = street;
        this.post_office = post_office;
        this.upazila = upazila;
        this.district = district;
        this.division = division;
        this.contact_no = contact_no;
        this.email = email;
        this.photo = photo;
        this.created_on = created_on;
        this.created_by = created_by;
        this.degree = degree;
        this.institute = institute;
        this.completion_year = completion_year;
        this.cgpa = cgpa;
    }



    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getInstitution_id() {
        return institution_id;
    }

    public void setInstitution_id(Integer institution_id) {
        this.institution_id = institution_id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getNID() {
        return NID;
    }

    public void setNID(Long NID) {
        this.NID = NID;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPost_office() {
        return post_office;
    }

    public void setPost_office(String post_office) {
        this.post_office = post_office;
    }

    public String getUpazila() {
        return upazila;
    }

    public void setUpazila(String upazila) {
        this.upazila = upazila;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public byte[] getPhoto() { return photo; }

    public void setPhoto(byte[] photo) { this.photo = photo; }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public int getCompletion_year() {
        return completion_year;
    }

    public void setCompletion_year(int completion_year) {
        this.completion_year = completion_year;
    }

    public float getCGPA() {
        return cgpa;
    }

    public void setCGPA(float cgpa) {
        this.cgpa = cgpa;
    }


}
