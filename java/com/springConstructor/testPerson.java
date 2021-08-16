package com.springConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testPerson {
public static void main(String args[])
{
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springConstructor/conConfig.xml");
	person pr=(person) context.getBean("person");
	person pr1=(person) context.getBean("person1");
	Addition add1=(Addition) context.getBean("add");
	Addition add2=(Addition) context.getBean("add1");
	Addition add3=(Addition) context.getBean("add2");
	System.out.println(pr);
	System.out.println(pr1);
	add1.add();
	add2.add();
	add3.add();
			
}
}
