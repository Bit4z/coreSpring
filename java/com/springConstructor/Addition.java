package com.springConstructor;

public class Addition { 
	private int a;
	private int b;
	public Addition(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("this is a integer constructor...");
	}
	public Addition(double a, double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("this is a Double constructor...");
	}
	
	public Addition(String a, String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("this is a String constructor...");
	}
	
	public void add()
	{
		System.out.println("The sum is="+(this.a+this.b));	
	}

}