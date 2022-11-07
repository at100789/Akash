package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {

		System.out.println("Main Method Started");
		
		Resource resource = new ClassPathResource("NewFile.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);  // lazy loading
		
		Example example = beanFactory.getBean("m", Example.class);
		
		example.exON();
		
		example.exOFF();
		
		System.out.println("----------------------------");
		
		example = beanFactory.getBean("o", Example.class);
		example.exON();
		
		example.exOFF();
		
		System.out.println("===Using Application Context===");
		
		ApplicationContext app = new ClassPathXmlApplicationContext("NewFile.xml"); //egar loading
		
		Example e = app.getBean("m", Example.class);
		
		e.exON();
		e.exOFF();
		System.out.println("============================");
		e = app.getBean("o", Example.class);
		e.exON();
		e.exOFF();
		
		System.out.println("++++++++++++++++++++++++++");
		
		Mysql mysql = (Mysql) app.getBean("m",Example.class);
		
		mysql.exON();
		mysql.exOFF();
		
		
	}
	
}
