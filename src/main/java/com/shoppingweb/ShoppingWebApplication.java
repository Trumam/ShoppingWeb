package com.shoppingweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shoppingweb.dao")
public class ShoppingWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingWebApplication.class, args);
	}

}
