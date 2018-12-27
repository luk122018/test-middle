package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.DemoDTO;
import com.fasterxml.jackson.annotation.JsonFormat;

@SpringBootApplication
@RestController
public class DemoMiddleApplication {
	
	@Autowired
	DemoDTO demo;
	 @CrossOrigin(origins = "http://localhost:8080")
	 @RequestMapping(value = "/")
	 @JsonFormat
	   public DemoDTO success() {
	      return demo;
	   }
	 
	public static void main(String[] args) {
		SpringApplication.run(DemoMiddleApplication.class, args);
	}

}

