package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Studentdao;
import com.model.Student;

@Service
public class StudentServiceImpl implements Studentservice{

	@Autowired
	private Studentdao studentdao;
	
	@Override
	public void addStudent(Student student) {
		System.out.println("Inside Student Service "+student);
		studentdao.addStudent(student);
	}

	@Override
	public List<Student> getAllStudentDetails(String uname, String pass) {

		
		return studentdao.getAllStudentDetails(uname, pass);
	}
	

}
