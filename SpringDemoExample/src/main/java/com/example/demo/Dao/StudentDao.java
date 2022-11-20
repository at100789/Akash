package com.example.demo.Dao;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentDao {
	
	void addStudent(Student student);
	
	List<Student> getData(String uname, String pass);

}
