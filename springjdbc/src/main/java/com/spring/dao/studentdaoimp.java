package com.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entity.student;

public class studentdaoimp implements studentdao {

  private  JdbcTemplate jdbcTemplate;	

	public int insert(student student) {
		String querey="insert into student(id,name,city) value(?,?,?)";
		int r = this.jdbcTemplate.update(querey,student.getId(),student.getName(),student.getCity());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int change(student student) {
		
		String query="update student set name=? ,city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}

	public int delete(int studentID) {
		String query="delete from student where id=?";
		int r=this.jdbcTemplate.update(query,studentID);
		return r;
		
	}

	

}
