package com.removeXmlSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new AnnotationConfigApplicationContext(javaConfig.class);   
	//Student obj=context.getBean("myStudent",Student.class);
//Student obj=context.getBean("getStudent",Student.class);
Student obj=context.getBean("myConfig",Student.class);
	System.out.println(obj);
	obj.study();
	}

}
