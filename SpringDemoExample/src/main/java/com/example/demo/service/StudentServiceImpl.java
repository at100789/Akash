package com.example.demo.service;

import java.util.List;

import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.StudentDao;
import com.example.demo.model.Student;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao sd;
	
	@Override
	public void addStudent(Student student) {
	
		System.out.println("Service Layer "+student);
		
		sd.addStudent(student);
	}

	@Override
	public List<Student> getData(String uname, String pass) {
		// TODO Auto-generated method stub
		return sd.getData(uname, pass);
	}

}
