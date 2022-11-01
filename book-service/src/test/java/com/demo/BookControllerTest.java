package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.google.common.net.MediaType;

public class BookControllerTest {

	
	 @Autowired
	    MockMvc mockMvc;
	    


//
//	   @Test
//	    public void test() throws Exception {
//	        RequestBuilder rq=MockMvcRequestBuilders.get("/api/v1/digitalbooks/books/find/b_id").contextPath("/api/v1/digitalbooks/books").
//	                accept(MediaType.APPLICATION_JSON);
//	        MvcResult mvc=mockMvc.perform(rq)
//	                .andExpect(status().is2xxSuccessful()).andReturn();
//	        assertEquals(200,mvc.getResponse());
//	        
//	    }
}
