package com.example.withoutweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
class WithoutwebApplicationTests {

	public static void main(String[] args){

		ApplicationContext context = SpringApplication.run(WithoutwebApplicationTests.class, args);

		Dev obj = context.getBean(Dev.class);

		obj.build();


	}

}
