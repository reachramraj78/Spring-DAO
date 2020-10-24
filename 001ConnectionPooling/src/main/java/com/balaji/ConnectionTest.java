package com.balaji;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionTest {
	
	public static void main(String[] args) throws SQLException {
		
//		BasicDataSource basicDataSource = new BasicDataSource();
//		basicDataSource.setUrl("jdbc:postgresql://localhost/vidvaan");
//		basicDataSource.setDriverClassName("org.postgresql.Driver");
//		basicDataSource.setUsername("postgres");
//		basicDataSource.setPassword("root");
//		
//		System.out.println(basicDataSource.getConnection());
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(applicationContext.getBean("dataSource"));
		
	}

}
