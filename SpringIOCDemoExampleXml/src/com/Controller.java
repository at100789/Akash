package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Controller {
	
	public static void main(String[] args) {

		System.out.println("Main method Started--");
		
		Resource resource = new ClassPathResource("NewFile.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
//		Demo demo = beanFactory.getBean("m" , Demo.class);
//	
//		demo.deOn();
//		
//		demo.deOff();
//		
//		demo = beanFactory.getBean("o" , Demo.class);
//		
//		demo.deOn();
//		
//		demo.deOff();
//		
//		System.out.println("\n APPLICATION CONTEXT \n");
//		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("NewFile.xml");
//		
//		 MySql ms =(MySql) ac.getBean("m" , Demo.class);
//		ms.deOn();
//		ms.deOff();
//		
//		Oracle oc = (Oracle) ac.getBean("o" , Demo.class);
//		
//		oc.deOn();
//		oc.deOff();
		System.out.println("Main method Ended--");
	
	}

}
