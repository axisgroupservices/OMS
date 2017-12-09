package org.axisgroupservice.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.axisgroupservice.springboot.model.Book;
import org.axisgroupservice.springboot.model.User;
import org.axisgroupservice.springboot.repositories.BookRepository;
import org.axisgroupservice.springboot.service.UserService;
import org.axisgroupservice.springboot.util.CustomErrorType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/bookcontroller")
public class BookController {

	public static final Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	BookRepository bookRepository; //Service which will do all data retrieval/manipulation work

	// -------------------Retrieve All Users---------------------------------------------

	@RequestMapping(value = "/getName/", method = RequestMethod.GET)
	public List<String> listAllUsers() {
		Book bookWithanme =  bookRepository.findOne( 1L);
		if (bookWithanme==null) {
			return null;
			// You many decide to return HttpStatus.NOT_FOUND
		}
		
		List<String> names=new ArrayList<>();
		names.add(bookWithanme.getName());
		return names;
	}

	

}