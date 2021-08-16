package com.stereoTypeAnnotation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereoptype.Component;
@Component
@Scope("prototype")//prototype scope then change hashcode we can also use by bean prototype scope
public class Student {
public static final Class Class = null;

@Value("Ziyaulhaq khan")
private String studentName;
@Value("Aligarh")
private String city;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + "]";
}

}
