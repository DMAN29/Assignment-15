package com.example.grocery;


import org.springframework.jdbc.core.JdbcTemplate;

public class Groceriesdao {
		
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getjdbcTemplate() {
		return jdbcTemplate;
	}

	public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public int saveGroceries(Grocery g)

	{
		String query = "insert into grocery(id,name,price,quantity) value(?,?,?,?)";
		return jdbcTemplate.update(query, g.getId(), g.getName() , g.getPrice(), g.getQuantity());
	}

	
	public int updateGroceries(Grocery a) {
		String query = "update grocery set name='" + a.getName() +"',price='" +a.getPrice() + "',quantity='" + a.getQuantity()
				+ "' where id='" + a.getId() + "' ";
		return jdbcTemplate.update(query);
	}

	
	public int deleteGroceries(Grocery a) {
		String query = "delete From grocery where id='" + a.getId() + "' ";
		return jdbcTemplate.update(query);
	}

}