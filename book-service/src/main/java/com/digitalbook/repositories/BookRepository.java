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
	
	@Query("select b from Book b where b.b_price>?1")
	Optional<Book> filterByName(double b_price);
	
	@Query(nativeQuery = false, value="select b from Book b where b.b_name=?1 OR b_category=?2 OR b_auther=?3 OR b_price=?4 OR b_publisher=?5")
	List<Book> findByNameAndCategoryAndAutherAndPriceAndPublisher(String b_name, String b_category, String b_auther, double b_price, String b_publisher);
	

}

