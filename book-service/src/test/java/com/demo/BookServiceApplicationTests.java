package com.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.digitalbook.BookServiceApplication;
import com.digitalbook.entities.Book;
import com.digitalbook.exception.BookException;
import com.digitalbook.repositories.BookRepository;
import com.digitalbook.services.BookService;

@SpringBootTest(classes = BookServiceApplication.class)
class BookServiceApplicationTests {

	 @Test
	    void contextLoads() {
	    }
	
	@Autowired
	private BookService bservice;
	
	@Mock
	private BookRepository brepo;
	

	@Test
	public void testCreateBook() throws Exception
	{
		Book b = new Book();
		b.setB_id(5);
		b.setA_id(105);
		b.setB_name("testbook1");
		b.setB_category("testcategory1");
		b.setB_auther("testauthor1");
		b.setB_price(750.00);
		b.setB_publisher("testpublisher1");
		b.setB_publishdate("2022-10-25");
		b.setB_isblock(false);
		
		brepo.save(b);
		assertNotNull(brepo.findById(5).get());
	
	}
	
	@Test
	public void testGetAllBooks() throws Exception
	{
		List<Book> lb =  brepo.findAll();
		assertThat(lb).size().isGreaterThan(0);
		
	}
	
	@Test
	public void testBookFindById() throws BookException
	{
		Book bk = new Book();
		//assertEquals(500, bk.getB_price());
		
		Mockito.when(brepo.findById(bk.getA_id())).thenReturn(Optional.of(bk));
		assertThat(brepo.findById(101)).isEqualTo(bk);
	}
	
	
}
