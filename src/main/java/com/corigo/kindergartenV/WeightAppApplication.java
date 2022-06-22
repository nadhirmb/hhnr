package com.corigo.kindergartenV;


import com.corigo.kindergartenV.ennumeration.Role;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class WeightAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeightAppApplication.class, args);



	}

}
