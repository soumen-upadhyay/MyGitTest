package com.spring.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.model.Employee;

public class Application {

	public static void main(String[] args) {
		
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		Employee emp = (Employee)factory.getBean("employee");
		System.out.println(emp);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp1 = (Employee)context.getBean("employee");
		System.out.println(emp1);

	}

}
