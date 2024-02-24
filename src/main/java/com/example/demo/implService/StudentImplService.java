package com.example.demo.implService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentImplService implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	
	
	@Override
	public Student addAllStudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return this.studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return this.studentRepository.findById(id).orElseThrow();
			
	}

	@Override
	public String  deleteStuentById(Long id) {
		// TODO Auto-generated method stub
		 this.studentRepository.deleteById(id);
		 return "hotel deleted";
	}

	@Override
	public Student updateStudentById(Long id, Student student) {
		Student std=studentRepository.getById(id);
		std.setFirstName(student.getFirstName());
		std.setLastName(student.getLastName());
		std.setGmail(student.getGmail());
		std.setAbout(student.getAbout());
		Student studentUpdate=studentRepository.save(std);
		
		return studentUpdate;
	}

}
