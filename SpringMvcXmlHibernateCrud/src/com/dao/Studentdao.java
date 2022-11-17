package com.dao;

import java.util.List;

import com.model.Student;

public interface Studentdao {
	
	void addStudent(Student student);
	
	List<Student> getAllStudentDetails(String uname, String pass);

}
