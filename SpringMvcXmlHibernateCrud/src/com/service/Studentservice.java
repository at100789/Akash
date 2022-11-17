package com.service;

import java.util.List;

import com.model.Student;

public interface Studentservice {

	void addStudent(Student  student);
	
	List<Student> getAllStudentDetails(String uname, String pass);
	
}
