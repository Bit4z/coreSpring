package com.jdbcCoreSpringEnttities;

public class Student {
private String name;
private int Id;
private String city;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String name, int id, String city) {
	super();
	this.name = name;
	Id = id;
	this.city = city;
}
@Override
public String toString() {
	return "Student [name=" + name + ", Id=" + Id + ", city=" + city + "]";
}

}
