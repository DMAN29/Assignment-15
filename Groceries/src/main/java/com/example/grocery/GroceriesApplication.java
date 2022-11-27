package com.example.grocery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class GroceriesApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String query = "update grocery set name='D' where id=8";
		String SQL = "select * from grocery";
		Groceriesdao a1 = (Groceriesdao) context.getBean("a2");
		int st = a1.saveGroceries(new Grocery(3,"Rice" ,10, "8Kg"));
	    int st1= a1.updateGroceries(new Grocery(3,"Onion" ,15, "6Kg"));
		int st2=a1.deleteGroceries(new Grocery(3,"Garlic bread" ,10, "0.5Kg"));
		
	}

}