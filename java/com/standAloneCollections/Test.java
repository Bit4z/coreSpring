package com.standAloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.collections.employee;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/standAloneCollections/standConfig.xml");
		Person emp=(Person) context.getBean("person1");
		System.out.println(emp);
		System.out.println(emp.getFeeStructure());
		System.out.println(emp.getFeeStructure().getClass().getName());
		
		System.out.println(emp.getProperty());
		
	}
	
}
