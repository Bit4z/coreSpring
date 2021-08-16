package com.jdbcCoreSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbcCoreSpringDao.studentDaoImp;
import com.jdbcCoreSpringEnttities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program started..." );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/jdbcCoreSpring/config.xml");
        /*JdbcTemplate temp=context.getBean("jdbcTemplate", JdbcTemplate.class);
        String query="insert into student(Id,Name,City) values(?,?,?)";
        int result=temp.update(query,102,"Ziyaulhaq Khan","Aligarh");
        System.out.println("number of record inserted.."+result);
        */
        studentDaoImp st=(studentDaoImp) context.getBean("student_data");
      /*  Student student=new Student();
        student.setId(103);
        student.setName("shivang gupta");
        student.setCity("Firozabad");
        int result=st.insert(student);
        System.out.println("student added.."+result);
        */
       /*
        Student student=new Student();
        student.setId(101);
        student.setName("Farman Khan");
        student.setCity("Delhi");
        int result=st.change(student);
        System.out.println("update data.."+result);
        */
        
        Student student=new Student();  
        student.setId(101);
        int result=st.delete(student);
        System.out.println("delete data.."+result);
        
    }
}
