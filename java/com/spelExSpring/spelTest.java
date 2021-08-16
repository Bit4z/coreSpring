package com.spelExSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.stereoTypeAnnotation.Teacher;
import com.sun.org.apache.xpath.internal.Expression;

public class spelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spelExSpring/spelConfig.xml");
		Demo demo1= context.getBean("demo",Demo.class);
		System.out.println(demo1);
		SpelExpressionParser temp=new SpelExpressionParser();
		org.springframework.expression.Expression exp=temp.parseExpression("45+37");
		System.out.println(exp.getValue());


	}

}
