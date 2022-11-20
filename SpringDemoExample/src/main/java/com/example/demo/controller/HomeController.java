package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/")
	public String getIndexPage() {
		System.out.println("Calling Index Page");
		
		return "index";
	}
	
	@RequestMapping(value = "/reg")
	public String addStudentData(@ModelAttribute Student student) {
		
		studentService.addStudent(student);
		return "login";
	}
	
	@RequestMapping(value = "/log")
	public String getData(@RequestParam String uname , @RequestParam String pass, Model m) {
		
		List<Student> list = studentService.getData(uname, pass);
		
		m.addAttribute("s",list);
		
		return "success";
	}

}
