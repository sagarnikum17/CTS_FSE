package com.digitalbook.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.digitalbook.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	@Query("select b from Book b where b.b_name=?1")
	List<Book> findByName(String b_name);
	
	@Query("select b from Book b where b.b_category=?1")
	List<Book> findByCategory(String b_category);
	
	@Query("select b from Book b where b.b_price<=?1")
	List<Book> filterByPrice(double b_price);
	
	@Query(nativeQuery = false, value="select b from Book b where b.b_name=?1 AND b.b_category=?2 AND b.b_auther=?3 AND b.b_price=?4 AND b.b_publisher=?5")
	List<Book> findByNameAndCategoryAndAutherAndPriceAndPublisher(String b_name, String b_category, String b_auther, double b_price, String b_publisher);
	

}

