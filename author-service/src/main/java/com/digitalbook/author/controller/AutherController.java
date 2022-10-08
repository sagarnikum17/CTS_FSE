package com.digitalbook.author.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbook.author.entities.Author;
import com.digitalbook.author.entities.AuthorBook;
import com.digitalbook.author.service.AuthorService;

@RestController
@RequestMapping("/api/v1/digitalbooks/author")
public class AutherController {

	@Autowired
	private AuthorService aservice;

	@GetMapping("/{aid}")
	public Author getAuthor(@PathVariable int aid) throws Exception{
		return aservice.findById(aid);
		
	}
	
	// 7
	@PostMapping("/signup")
	public Author autherSignup(@RequestBody Author auther) throws Exception {
		return aservice.authorSignUp(auther);
	}
	// 9
	@PostMapping("/{authorId}/books")
	public AuthorBook saveBook(@RequestBody AuthorBook authorbook) throws Exception {
		
		return aservice.saveBook(authorbook);
	}
	// 9
//	@PostMapping("/{a_id}/books")
//	public AuthorBook createBook(@RequestBody AuthorBook authorbook, @PathVariable int a_id) throws Exception {
//		
//		
//		return aservice.createBook(authorbook);
//		
//	}

	// 10

	@PutMapping("/{authorId}/books/{bookId}") 
	public AuthorBook editBlockUnblokBook(  @PathVariable int authorId, 
			  				@PathVariable int bookId, 
			  				@RequestBody AuthorBook authorBook) throws Exception {
								
		return aservice.blockUnblockBook(authorId, bookId, authorBook);
		
	  
	  }

}
