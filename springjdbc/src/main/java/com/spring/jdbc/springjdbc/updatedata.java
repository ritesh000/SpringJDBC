package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.studentdao;
import com.spring.jdbc.entity.student;

public class updatedata {


	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
	studentdao studentdao = (studentdao) context.getBean("studentdao");
	student stu1 = new student();
	
	
	
}
