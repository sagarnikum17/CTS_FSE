package com.digitalbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbook.entities.SubscribeBook;
import com.digitalbook.repositories.SubscribeBookRepository;

@Service
public class SubscribeBookService {

	@Autowired
	private SubscribeBookRepository sbookrepo;
	
	
	public SubscribeBook saveSubscribebook(SubscribeBook sbk)
	{
		return sbookrepo.save(sbk);
	}
	
	
	
	
//	public SubscribeBook findById(int bookid) throws Exception {
//		Optional<SubscribeBook> optional = sbookrepo.findById(bookid);
//		if (optional.isEmpty()) {
//			throw new Exception("SubscriptionBook with id(" + bookid + ") not found");
//		} else {
//			return optional.get();
//		}
//	}
	
}
