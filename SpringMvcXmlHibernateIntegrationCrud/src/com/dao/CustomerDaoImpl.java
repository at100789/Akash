package com.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Customer;
@Service
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	private SessionFactory sf;
	
	
	@Override
	public void addCustomerDetails(Customer customer) {
		Session session = sf.openSession();
		System.out.println("in dao layer " + customer);
		session.save(customer);
		session.beginTransaction().commit();
		
	}


	@Override
	public List<Customer> getAllDetetails( String un, String ps) {
		Session session = sf.openSession();
		System.out.println("----Get Data ON======");
		List<Customer> clist = new ArrayList<Customer>();
		if(un.equals("admin")&& ps.equals("admin")) {
		Query<Customer> query = session.createQuery("from Customer");
		clist = query.getResultList();
		}else {
			try {
				
			
			Query<Customer> query1 = session.createQuery("from Customer where uname=:un and pass=:ps");
			query1.setParameter("un", un);
			query1.setParameter("ps", ps);
			Customer customer = query1.getSingleResult();
			clist.add(customer);
			
			return clist;
			} catch (Exception e) {
				System.out.println("Invalid User Name And PassWord");
			}
		}
		
		System.out.println("----Get Data off======");
		return clist;
	}


	@Override
	public Customer getSingleCustomer(int id) {
		
		Session session = sf.openSession();
		Customer customer = session.get(Customer.class, id );
		return customer;
	}


	@Override
	public List<Customer> getCheckUpdateData(Customer customer) {
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		session.update(customer);
		session.getTransaction().commit();
		Query<Customer> query = session.createQuery("from Customer");
		List<Customer> clist = query.getResultList();
		
		return clist;
	}


	@Override
	public List<Customer> deleteCustomerData(int id) {
		Session session = sf.openSession();
		Customer customer2 = session.get(Customer.class, id);
		
		session.delete(customer2);
		session.beginTransaction().commit();
		Query<Customer> query = session.createQuery("from Customer");
		List<Customer> clist = query.getResultList();
		return clist;
	}

}
