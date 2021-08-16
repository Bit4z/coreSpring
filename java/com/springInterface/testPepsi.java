package com.springInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testPepsi {
	public static void main(String args[])
	{
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springInterface/configInter.xml");
	context.registerShutdownHook();
	Pepsi ip=(Pepsi) context.getBean("inter");
	exampleAnnotation ex=(exampleAnnotation) context.getBean("wxy");
	System.out.println(ex);
	System.out.println(ip);
	}

}
