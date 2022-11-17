package com.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;

@Service
public class StudentDaoImpl implements Studentdao{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void addStudent(Student student) {
		
		
		Session session = sf.openSession();
		session.save(student);
		session.beginTransaction().commit();
		System.out.println("inside dao layer "+student);
	}

	@Override
	public List<Student> getAllStudentDetails(String uname, String pass) {
		Session session = sf.openSession();
		List<Student> slist = new ArrayList<Student>();
		if(uname.equals("admin")&&uname.equals("admin")) {
			
			Query<Student> query = session.createQuery("from Student");
			
			slist = query.getResultList();
			
		}
		
		
		return slist;
	}

}
