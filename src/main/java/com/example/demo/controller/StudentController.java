package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.implService.StudentImplService;

@RestController
public class StudentController {
	
	@Autowired
	StudentImplService studentImplService;
	
	@ResponseStatus(HttpStatus.OK)
	@PostMapping("/insert")
	public Student addstudent(@RequestBody Student student) {
		return this.studentImplService.addAllStudent(student);
	}
	
	@ResponseStatus(HttpStatus.ACCEPTED)
	@GetMapping("/select")
	public List<Student> gettAllStudent(){
		return this.studentImplService.getAllStudent();
	}
	
	@ResponseStatus(HttpStatus.ACCEPTED)
	@GetMapping("/select/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return this.studentImplService.getStudentById(id);
	}
	@ResponseStatus(HttpStatus.OK)
	@DeleteMapping("/delete/{id}")
	public String deleteStudentById(@PathVariable Long id) {
		return this.studentImplService.deleteStuentById(id);
	}
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/update/{id}")
	public Student updateStudentById(@PathVariable Long id,@RequestBody Student student) {
		return this.studentImplService.updateStudentById(id,student);
	}

}
