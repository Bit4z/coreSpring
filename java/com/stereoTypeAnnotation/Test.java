package com.stereoTypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.standAloneCollections.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	ApplicationContext context=new ClassPathXmlApplicationContext("com/stereoTypeAnnotation/stereoConfig.xml");
		Student emp= context.getBean("student",Student.Class);
		System.out.println(emp);
		
		
		//print same hashCode emp and emp1 object this is the singleton scope. change for hashcode we need to use prototype scope
		System.out.println(emp.hashCode());
		Student emp1= context.getBean("student",Student.Class);
		System.out.println(emp1.hashCode());
		
		*/
		
		
		//for prototype scope
		ApplicationContext context=new ClassPathXmlApplicationContext("com/stereoTypeAnnotation/proScopeConfig.xml");
		Teacher teacher= context.getBean("teacher",Teacher.class);
		System.out.println(teacher.hashCode());
		
		Teacher teacher1= context.getBean("teacher",Teacher.class);
		System.out.println(teacher1.hashCode());
		
	}

}
