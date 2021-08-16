package com.springConstructor;

public class person {
private String name;
private int personId;
private certifiicate certi;

public person(String name, int personId, certifiicate certi)
{
	this.name=name;
	this.personId=personId;
	this.certi=certi;
	
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name+":"+this.personId+":"+"{"+this.certi.name+"}";
}
}
