package com.digitalbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReaderServiceApplication //implements CommandLineRunner
{
	

//	@Autowired
//	private ReaderService rservice;
//	
//	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		rservice.saveReaderBook(new ReaderBook("Ramayan", "Historical", "Valmiki", 500.00, "Rajgopal"));
//		rservice.saveReaderBook(new ReaderBook("Mahabharat", "Historical", "Vyas", 750.00, "Narayan"));
//		rservice.saveReaderBook(new ReaderBook("WingsOfFire", "Novel", "AbdulKalam", 900.00, "ArunTiwari"));
//		rservice.saveReaderBook(new ReaderBook("HarryPotter", "Novel", "Rowling", 1200.00, "Bloomsbury"));
//		rservice.saveReaderBook(new ReaderBook("ShivajiMaharaj", "Biography", "Ranjit", 1500.00, "GreatMaratha"));
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(ReaderServiceApplication.class, args);
		
		System.out.println("Running ReaderServiceApplication");
	}

	

}