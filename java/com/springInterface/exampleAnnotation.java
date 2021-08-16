package com.springInterface;

public class exampleAnnotation {
	private String subject;

	@Override
	public String toString() {
		return "exampleAnnotation [subject=" + subject + "]";
	}

	public exampleAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	//@PostConstruct
public void start()
{
	System.out.println("this is start method....");
	
}
public void end() {
System.out.println("this is  ending method...");	
}
}
