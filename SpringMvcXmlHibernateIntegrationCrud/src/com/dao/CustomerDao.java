package com.dao;

import java.util.List;

import com.model.Customer;

public interface CustomerDao {

	void addCustomerDetails(Customer customer);
	
	List<Customer> getAllDetetails(String un, String ps);
	
	Customer getSingleCustomer(int id);
	
	List<Customer> getCheckUpdateData(Customer customer);
	
	List<Customer> deleteCustomerData(int id);
}
