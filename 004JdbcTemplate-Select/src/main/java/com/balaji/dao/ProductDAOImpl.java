package com.balaji.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.balaji.model.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public Product findById(int pid) {
		String query = "SELECT * FROM PRODUCT WHERE PID = ?";
		return jdbcTemplate.queryForObject(query, new Object[] {pid},new BeanPropertyRowMapper<Product>(Product.class));
	}

//	public List<Product> findAll() {
//		String query = "SELECT * FROM PRODUCT";
//		return jdbcTemplate.query(query,new BeanPropertyRowMapper(Product.class));
//	}
	
	
	public List<Product> findAll() {
		String query = "SELECT * FROM PRODUCT";
		return jdbcTemplate.query(query,new ProductRowMapper());
	}
	
//	public List<Product> findAll() {
//		String query = "SELECT * FROM PRODUCT";
//		return jdbcTemplate.query(query,new RowMapper<Product>() {
//
//			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Product product = new Product();
//				product.setPid(rs.getInt(1));
//				product.setPname(rs.getString(2));
//				product.setPcost(rs.getDouble(3));
//				return product;
//			}
//		});
//	}
	
	
//	public List<Product> findAll() {
//		String query = "SELECT * FROM PRODUCT";
//		return jdbcTemplate.query(query,(rs,  rowNum)-> {
//				Product product = new Product();
//				product.setPid(rs.getInt(1));
//				product.setPname(rs.getString(2));
//				product.setPcost(rs.getDouble(3));
//				return product;
//		});
//	}

}
