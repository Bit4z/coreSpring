package com.jdbcCoreSpringDao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbcCoreSpringEnttities.Student;

public interface studentDao {
	
	public int insert(Student student);
	public int change(Student student);
	public int delete(Student student);

}
