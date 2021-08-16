package com.ormSpringEntities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
@Entity
@Table(name="student")
public class Student {
@Id
@Column(name="Id")
private int Id;
@Column(name="Name")
private String Student;
@Column(name="City")
private String City;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getStudent() {
	return Student;
}
public void setStudent(String student) {
	Student = student;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String student, String city) {
	super();
	Id = id;
	Student = student;
	City = city;
}

}
