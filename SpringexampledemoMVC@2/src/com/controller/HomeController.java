package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;

@Controller
public class HomeController {

	@RequestMapping(value = "pagecall")
	public String m1() {
		System.out.println("Page Called");
		return "success";
	}

	@RequestMapping(value = "/requestparam")
	public String m2(@RequestParam String uname, @RequestParam("pass") String ps) {

		System.out.println("Data Get Using Request Param " + uname + " " + ps);

		System.out.println("Get Data");

		return "success1";
	}

	@RequestMapping(value = "/ref/{uname}/{pass}")
	public String m3(@PathVariable String uname, @PathVariable String pass) {

		System.out.println("Data Get By Using Path Variable" + " " + uname + " " + pass);

		return "success3";
	}

	@RequestMapping(value = "/reg")
	public String m4(@ModelAttribute Student student , Model m) {
		System.out.println("Get Student data " + " " + student);
		m.addAttribute("s", student);
		return "success4";
	}

}
