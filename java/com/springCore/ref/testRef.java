package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testRef {
public static void main(String args[])
{
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/ref/refConfig.xml");
	A temp=(A)context.getBean("aref");
	System.out.println(temp.getX());
	System.out.println(temp.getOb().getY());
	System.out.println(temp);
}
}
