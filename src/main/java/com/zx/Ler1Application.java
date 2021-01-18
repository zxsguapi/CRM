package com.zx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zx.dao")
@SpringBootApplication()
public class Ler1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ler1Application.class, args);
	}

}
