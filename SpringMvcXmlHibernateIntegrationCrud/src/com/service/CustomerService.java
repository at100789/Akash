package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService {
	
	void addCustomerDetails(Customer customer);
	List<Customer> getAllDetetails( String uname , String pass);
	
	Customer getSingleCustomer(int id);
	
	List<Customer> getChechUpdateData(Customer customer);
	
	List<Customer> deleteCustomerData(int id );
}
