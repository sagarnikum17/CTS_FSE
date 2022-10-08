package com.digitalbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.digitalbook.entities.Book;
import com.digitalbook.services.BookService;

@SpringBootApplication
public class BookServiceApplication //implements CommandLineRunner
{

//	@Autowired
//	private BookService bservice;
//	
//	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		bservice.saveBook(new Book("Ramayan", "Historical", "Valmiki", 500.00, "Rajgopal"));
//		bservice.saveBook(new Book("Mahabharat", "Historical", "Vyas", 750.00, "Narayan"));
//		bservice.saveBook(new Book("WingsOfFire", "Novel", "AbdulKalam", 900.00, "ArunTiwari"));
//		bservice.saveBook(new Book("HarryPotter", "Novel", "Rowling", 1200.00, "Bloomsbury"));
//		bservice.saveBook(new Book("ShivajiMaharaj", "Biography", "Ranjit", 1500.00, "GreatMaratha"));
//		
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
		
		
		System.out.println("Running BookService");
	}

}
