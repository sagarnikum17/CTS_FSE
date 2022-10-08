package com.digitalbook.reader.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.digitalbook.reader.entities.ReaderBook;
import com.digitalbook.reader.entities.ReaderSubscribe;

public interface ReaderBookRepository extends JpaRepository<ReaderSubscribe, Integer>{
	// 3
	@Query(nativeQuery=false, value= "Select b from ReaderSubscribe b where b.readeremail = ?1")
	List<ReaderSubscribe> findByReaderEmailId(String readeremail);
	
	
//	@Query(nativeQuery = false, value = "select b from ReaderSubscribe b where b.readeremail=?1 AND b.bookid=?2")
//	List<ReaderSubscribe> findBookToRead(String readeremail, ReaderBook readerbook, int bookid);


	// 4 & 6
	@Query(nativeQuery=false, value=
			"Select b from ReaderSubscribe b where b.readeremail = ?1 and b.bookid = ?2")
	public ReaderSubscribe getValidBookToRead(String readeremail, int bookid);

	// 5
	@Query(nativeQuery=false, value=
			"Select b from ReaderSubscribe b where b.readeremail = ?1 and b.subid = ?2")
	public ReaderSubscribe findBookBySubscriptionId(String readeremail, int pid);
}
