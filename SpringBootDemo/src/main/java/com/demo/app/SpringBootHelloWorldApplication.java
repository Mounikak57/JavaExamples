package com.demo.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.test.Sample;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		Sample sample=new Sample();
		sample.test();
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

}

