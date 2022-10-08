package com.digitalbook.reader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbook.reader.entities.ReaderBook;
import com.digitalbook.reader.entities.ReaderSubscribe;
import com.digitalbook.reader.exception.ReaderException;
import com.digitalbook.reader.services.ReaderService;

@RestController
@RequestMapping("/api/v1/digitalbooks/readers")
public class ReaderController {

	@Autowired
	private ReaderService rservice;

	
	
	// 3 get purchased books

	@GetMapping("/{readeremail}/books")
	public List<ReaderBook> getPurchasedBooks(@PathVariable String readeremail) throws ReaderException {
		return rservice.findAllPurchaseBook(readeremail);

	}
	
	//4 reader read purchased book
	
	@GetMapping("/{readeremail}/books/{bookid}")
	public  ReaderSubscribe getBookToRead(@PathVariable String readeremail,  @PathVariable  int bookid ) throws Exception
	{
		return rservice.getBookToRead(readeremail,  bookid);
	}
	
	// 5 reader can find purchased book by paymentid
	
	@PostMapping("/{readeremail}/books")  //5
	public ReaderSubscribe getBooksBySubscriptioId(@PathVariable String readeremail, @RequestParam int pid) throws Exception{
		return rservice.getBookBySubscriptionId(readeremail, pid);
	}
	
	//6 reader can ask for refund
	@PostMapping("/{readeremail}/books/{rbookid}/refund")   
	public boolean askForRefund(@PathVariable String readeremail, 
								@PathVariable int bookid) throws ReaderException{
		
		return rservice.getRefundAvailability(readeremail,bookid);
		
	}
}
