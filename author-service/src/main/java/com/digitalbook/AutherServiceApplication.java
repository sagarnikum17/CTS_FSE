package com.digitalbook;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.digitalbook.author.entities.AuthorBook;
import com.digitalbook.author.service.AuthorService;



@SpringBootApplication
public class AutherServiceApplication {

	/*
	 * @Autowired private AuthorService aservice;
	 * 
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * aservice.saveBook(new AuthorBook(101, "Geeta", "Historical", "Rajprakash",
	 * 1450.00, "GeetaPublications", "2022-04-10"));
	 * 
	 * }
	 */
	public static void main(String[] args) {
		SpringApplication.run(AutherServiceApplication.class, args);
		
		System.out.println("AutherService running");
		
		LocalDate ld = LocalDate.now();
		System.out.println("localdate :"+ld);
	}

	

}
