package com.ormSpring;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ormSpringDao.studentDao;
import com.ormSpringEntities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/ormSpring/config.xml");
    	studentDao studentdao= context.getBean("studentdao",studentDao.class);
    	/*
    	Student st=new Student(101,"Faiz Khan", "Aligarh");
    	int r=student.insert(st);
    System.out.println("record inserted.."+r);
    
    */
    	boolean go=true;
    	while(go)
    {
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("press 1 for add new student");
    	System.out.println("press 2 for display all student");
    	System.out.println("press 3 for detail of single student");
    	System.out.println("press 4 for delete students");
    	System.out.println("press 5 for update students");
    	System.out.println("press 6 for exit..");
   
    try {
    	int ch=Integer.parseInt(br.readLine());
    	switch(ch)
    	{
    	case 1:
    		System.out.println("Enter student Uid");
    		int uid=Integer.parseInt(br.readLine());
    		System.out.println("Enter student Name");
    		String name=br.readLine();
    		System.out.println("Enter student City");
    		String city=br.readLine();
    		Student st=new Student();
    		st.setId(uid);
    		st.setStudent(name);
    		st.setCity(city);
    		int r=studentdao.insert(st);
    		System.out.println(r+" "+"student Added..");
    		System.out.println("**************************************************");
    		System.out.println();
    		break;
    	case 2:
    		List<Student> allStudents=studentdao.getAllStudents();
    		for(Student s:allStudents)
    		{
    			System.out.println("Id:"+s.getId());
    			System.out.println("Name:"+s.getStudent());
    			System.out.println("City:"+s.getCity());
    			System.out.println("**************************************************");
        		System.out.println();
    			
    		}
    		break;
    		
    	case 3:
    		System.out.println("Enter student Uid");
    		int Uid=Integer.parseInt(br.readLine());
    		Student student=studentdao.getStudent(Uid);
    		System.out.println("Id:"+student.getId());
			System.out.println("Name:"+student.getStudent());
			System.out.println("City:"+student.getCity());
			System.out.println("**************************************************");
    		System.out.println();
    		
    		break;
    	case 4:
    		System.out.println("Enter student Uid");
    		int delete_id=Integer.parseInt(br.readLine());
    		studentdao.deleteStudent(delete_id);
    		System.out.println("Deleted student successfully...");
    		System.out.println("**************************************************");
    		System.out.println();
    		break;
    	case 5:
    		System.out.println("Enter student Uid");
    		int id=Integer.parseInt(br.readLine());
    		studentdao.updateStudent(id);
    		System.out.println("student update successfully...");
    		System.out.println("**************************************************");
    		System.out.println();
    		break;
    	case 6:
    		go=false;
    		break;
    	}
    }
    catch(Exception e)
    {
    	System.out.println("invalid input...");
    	System.out.println(e.getMessage());
    }
    }
    	System.out.println("thank you for using my Appliccation..");
    	System.out.println("we will meet soon..");
}
}
