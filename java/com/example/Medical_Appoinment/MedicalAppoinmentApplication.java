package com.example.Medical_Appoinment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.Medical_Appoinment"})
public class MedicalAppoinmentApplication { 

	public static void main(String[] args) {
		SpringApplication.run(MedicalAppoinmentApplication.class, args);
	}

}
