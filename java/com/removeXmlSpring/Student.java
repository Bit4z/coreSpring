package com.removeXmlSpring;

import org.springframework.stereotype.Component;

//@Component("myStudent")
public class Student {
	
	private Samosa samosa;
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public void study()
	{
		this.samosa.display();
		System.out.println("Student is reading book");
	}
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	

}
