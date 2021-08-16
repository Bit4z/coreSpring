package com.ormSpringDao;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.ormSpringEntities.Student;

public class studentDao {
	private HibernateTemplate hibernateTemplate;
	@Transactional  
	public int insert(Student student)
	{
		Integer i=(Integer) this.hibernateTemplate.save(student);
		
		return i;
	}
	public Student getStudent(int student_Id)
	{
		Student student=this.hibernateTemplate.get(Student.class,student_Id);
		return student;
	}
	public List<Student> getAllStudents()
	{
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
		
	}
	@Transactional
	public void deleteStudent(int studentId)
	{
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
		
	}
	@Transactional
	public void updateStudent(int studentId)
	{
		this.hibernateTemplate.update(studentId);
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
