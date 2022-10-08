package com.digitalbook.author.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.digitalbook.author.entities.AuthorBook;

public interface AuthorBookRepository extends JpaRepository<AuthorBook, Integer>{

	@Query("select b from AuthorBook b where b.a_bookid=?1")
	AuthorBook findByBookIdAndAuthorId(int bookId);

	
}
