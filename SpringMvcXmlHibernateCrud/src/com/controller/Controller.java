package com.controller;



import java.util.List;

import javax.jws.WebParam.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.service.Studentservice;



@org.springframework.stereotype.Controller
public class Controller {
    
	@Autowired
	private Studentservice studentservice;
	
	@RequestMapping(value = "/reg")
	public String m1(@ModelAttribute Student student) {
		System.out.println("Get Student Data "+student);
		studentservice.addStudent(student);
		
		return "Login";
	}
	
	@RequestMapping(value = "/log")
	public String getlogindata(@RequestParam String uname,@RequestParam String pass,Model m) {
		System.out.println("Getting STudent Data "+uname+" "+pass);
		
		List<Student> slist = studentservice.getAllStudentDetails(uname, pass);
				
		
		m.addAttribute("s",slist);
		
		return "success";
	}
	
}
