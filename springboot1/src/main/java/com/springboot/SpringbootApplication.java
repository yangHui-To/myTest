package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@MapperScan(basePackages = {"com.springboot.mapper"})
public class SpringbootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootApplication.class, args);
		SpringApplication springApplication = new SpringApplication(SpringbootApplication.class);


		springApplication.setBannerMode(Banner.Mode.OFF);

		springApplication.run(args);


	}
}
