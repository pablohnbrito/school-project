package com.school.vivi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ViviApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViviApplication.class, args);
	}

	@GetMapping("/")
	public String index() {return "Escola Vivi funcionando!!";}

}
