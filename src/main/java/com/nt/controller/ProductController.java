package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Value("${dbuser}")
	private String user;
	@GetMapping("/show")
	public ResponseEntity<?> showProduct(){
		return new ResponseEntity<String>("Product list",HttpStatus.OK);
	}
	@GetMapping("/details")
	public ResponseEntity<?> showDetails(){
		return new ResponseEntity<String>(user +"Product Details",HttpStatus.OK);
	}
}
