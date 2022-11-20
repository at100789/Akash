package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	void addStudent(Student student);
	
	List<Student> getData(String uname, String pass);

}
