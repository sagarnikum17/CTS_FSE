package com.digitalbook.author.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalbook.author.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

	
}
