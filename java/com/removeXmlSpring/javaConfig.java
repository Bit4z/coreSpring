package com.removeXmlSpring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
//@ComponentScan(basePackages="com.removeXmlSpring")
public class javaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	@Bean(name={"myConfig","temp","student"})
	public Student getStudent()
	{
		Student student=new Student(getSamosa());
		return student;
	}

}
