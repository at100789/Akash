package com.example.demo.Dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void addStudent(Student student) {
		Session session = sf.openSession();
		System.out.println("In Dao Layer "+student);
		session.save(student);
		
		session.beginTransaction().commit();
		
		
		
	}

	@Override
	public List<Student> getData(String uname, String pass) {
		Session session = sf.openSession();
		
		List<Student> list = new ArrayList<Student>();
		
		if(uname.equals("Admin")&& pass.equals("Admin")) {
			Query<Student> query = session.createQuery("from Student");
			
			 list = query.getResultList();
			
		}
		
		return list;
	}

}
