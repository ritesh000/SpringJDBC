package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.dao.studentdao;
import com.spring.jdbc.entity.student;

public class insertdata {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
		studentdao studentdao = (studentdao) context.getBean("studentdao");

		student stu = new student();
		stu.setId(234);
		stu.setName("kap");
		stu.setCity("mp");
		int result = studentdao.insert(stu);
		System.out.println("student added " + result);

	}

}
