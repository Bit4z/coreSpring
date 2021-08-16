package com.example.anmolSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student st=(Student)context.getBean("student1");
        System.out.println("Ths s stdent data="+st);
        Student st1=(Student)context.getBean("student2");
        System.out.println("Ths s stdent data="+st1);
        Student st2=(Student)context.getBean("student3");
        System.out.println("Ths s stdent data="+st2);
        Student st3=(Student)context.getBean("student4");
        System.out.println("Ths s stdent data="+st3);
    }
}
