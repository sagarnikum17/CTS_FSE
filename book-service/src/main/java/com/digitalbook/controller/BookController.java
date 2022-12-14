package com.digitalbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbook.entities.Book;
import com.digitalbook.entities.SubscribeBook;
import com.digitalbook.exception.BookException;
import com.digitalbook.services.BookService;
import com.digitalbook.services.SubscribeBookService;

@RestController
@RequestMapping("/api/v1/digitalbooks/books")
@CrossOrigin(origins = {"http://localhost:4200/"})
public class BookController {

	@Autowired
	private BookService bservice;

	@Autowired
	private SubscribeBookService sbookservice;

	@GetMapping()
	public List<Book> getAllBooks() {
		return bservice.fetchAllBooks();
	}

	@PostMapping()
	public Book createBook(@RequestBody Book bk) {
		return bservice.saveBook(bk);
	}

	// findByBookId
	@GetMapping("/find/b_id")
	public Book getBook(@RequestParam int b_id) throws BookException {
		return bservice.findById(b_id); 
	}
	// findByName
	@GetMapping("/find/b_name")
	public List<Book> fetchByName(@RequestParam String b_name) throws BookException{
		return bservice.findBooksByName(b_name);
	}

	// findByCategory
	@GetMapping("/find/{b_category}")
	public List<Book> fetchByCategory(@PathVariable String b_category) throws BookException{
		return bservice.findBooksByCategory(b_category);
	}
	
	// filterByPrice
	@GetMapping("/filter/b_price") 
	public  List<Book>  filter(@RequestParam double b_price) throws BookException{
		return bservice.filterByPrice(b_price);
	}

	// searchall
	@GetMapping("/search")
	public List<Book> searchBooksBy_Name_Category_auther_price_publisher(@RequestParam String b_name,
			@RequestParam String b_category, @RequestParam String b_auther, @RequestParam double b_price,
			@RequestParam String b_publisher) throws BookException {
		return bservice.searchby_Name_Category_auther_price_publisher(b_name, b_category, b_auther, b_price,
				b_publisher);

	}

	// buy book
	@PostMapping("/buy")
	public SubscribeBook createSubscribeBook(@RequestBody SubscribeBook sbk) {
		return sbookservice.saveSubscribebook(sbk);

	}

}
