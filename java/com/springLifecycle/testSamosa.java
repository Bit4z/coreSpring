package com.springLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSamosa {
public static void main(String args[])
{
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springLifecycle/configLife.xml");
	Samosa samosa=(Samosa) context.getBean("s1");
	System.out.println(samosa.getPrice());
	//registering shutdown hook means destroy method call with AbstractApplicationContext
	context.registerShutdownHook();
}
}
