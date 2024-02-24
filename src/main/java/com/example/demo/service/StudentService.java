package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
//	add all student;
	
	public Student addAllStudent(Student student);
	
	//get all student
	
	public List<Student> getAllStudent();
	
//	get student By Id
	
	public Student getStudentById(Long id);
	
	
//	delete student by id
	
	public String deleteStuentById(Long id);
	
	// update Student By Id
	public Student updateStudentById(Long id, Student student);

}
