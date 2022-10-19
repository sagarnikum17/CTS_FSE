package com.digitalbook.reader.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.digitalbook.reader.entities.ReaderSubscribe;

//@FeignClient("BOOK-RECORDS")
@FeignClient("BOOK-SERVICE")
public interface BookRecordsClient {

	@GetMapping("/api/v1/digitalbooks/books/getBooks")
	ReaderSubscribe getBooks(@RequestParam(name = "id") int id);
}
