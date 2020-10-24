package com.balaji.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.balaji.dao.ProductDAO;
import com.balaji.model.Product;

public class ProductDAOTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		ProductDAO productDAO = (ProductDAO) applicationContext.getBean("productDAO");
		Product product = new Product();
		product.setPid(1001);
		product.setPname("Mobile");
		product.setPcost(20000.00);
		productDAO.add(product);
		System.out.println("Inserted Successfully...");
	}

}
