package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerDao;
import com.model.Customer;
@Service
public class CustServiceIMPL implements CustomerService{

	@Autowired
	private CustomerDao customerdao;
	
	@Override
	public void addCustomerDetails(Customer customer) {
		
		System.out.println("inside service layer " +customer);
		
		customerdao.addCustomerDetails(customer);
		
		
		
	}

	@Override
	public List<Customer> getAllDetetails(String uname, String pass) {
		
		return customerdao.getAllDetetails(uname, pass);
	}

	@Override
	public Customer getSingleCustomer(int id) {
		// TODO Auto-generated method stub
		return customerdao.getSingleCustomer(id);
	}

	@Override
	public List<Customer> getChechUpdateData(Customer customer) {
		// TODO Auto-generated method stub
		
		return customerdao.getCheckUpdateData(customer);
	}

	@Override
	public List<Customer> deleteCustomerData(int id) {
		// TODO Auto-generated method stub
		return customerdao.deleteCustomerData(id);
	}

}
