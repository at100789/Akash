package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Customer;
import com.service.CustomerService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/reg")
	public String m1(@ModelAttribute Customer customer) {
		System.out.println("Login Page " + customer);
		customerService.addCustomerDetails(customer);
		return "Login";
	}
	
	@RequestMapping(value = "/log")
	public String getlogindata(@RequestParam String uname, @RequestParam String pass,Model m) {
		
		System.out.println("Getting Customer Data " +uname+" "+pass);
		
		List<Customer> clist = customerService.getAllDetetails(uname, pass);
		
		m.addAttribute("cl",clist);
		return "success";
		}
	
	
	@RequestMapping(value = "/edit")
	public String editCustomerData(@RequestParam int id, Model m) {
		
			Customer customer= customerService.getSingleCustomer(id);
			m.addAttribute("c",customer);
			return "edit";
	}
	
	@RequestMapping(value = "/Up")
	public String updateCustomerData(@ModelAttribute Customer customer, Model m) {
		List<Customer> clist = customerService.getChechUpdateData(customer);
		m.addAttribute("cl",clist);
		
		return "success";
	}
	
	@RequestMapping(value = "/del")
	public String deleteCustomer(@RequestParam int id , Model m) {
		List<Customer> list = customerService.deleteCustomerData(id);
		m.addAttribute("cl",list);
		return "success";
		
	}
}
