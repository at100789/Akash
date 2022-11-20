package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class MainPage {
	
	
	@RequestMapping(value ="/getmsg")
	public String getPage() {
		
		
		return "Check Messange !!!";
	}
	
	@RequestMapping(value = "/getstu")
	
	public Student getSingleStudent() {
		Student student = new Student();
		
		student.setId(101);
		student.setName("Akash");
		student.setAddress("Latur");
		
		System.out.println("Student Derails :"+student);
		
		return student;
	}
	
	@RequestMapping(value = "/getList")
	public List<Student> getAllStudent(){
		List<Student> list =new ArrayList<Student>();
		
		Student student = new Student();
		student.setId(101);
		student.setName("Akash");
		student.setAddress("Latur");
		
		Student s2 = new Student();
		s2.setId(333);
		s2.setName("Shree");
		s2.setAddress("Pune");
		
		list.add(student);
		list.add(s2);
		
		return list;
	}

}
