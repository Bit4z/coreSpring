package com.jdbcCoreSpringDao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbcCoreSpringEnttities.Student;

public class studentDaoImp implements studentDao{
private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		 String query="insert into student(Id,Name,City) values(?,?,?)";
		 int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int change(Student student) {
		// TODO update query..
		String query="update student set Name=?, City=? where Id=?";
		int rs=this.jdbcTemplate.update(query,student.getName(), student.getCity(), student.getId());
		return rs;
	}
	public int delete(Student student) {
		//
		String query="delete from student where Id=?";
		int rs=this.jdbcTemplate.update(query,student.getId());
		return rs;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	
}
