package com.springLifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		System.out.println("Get price is call...");
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setter method is call...");
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void init()
	{
		System.out.println("This is the init method...");
	}
	public void destroy() {
		System.out.println("This is destroy method...");
	}

}
