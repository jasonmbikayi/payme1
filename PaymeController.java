package com.payme.payme.controller;

import java.sql.Date;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payme.payme.entity.Contact;
import com.payme.payme.model.ProductList;
import com.payme.payme.services.ContactService;

@RestController
public class PaymeController {
	
	@GetMapping("/welcome/id")
 	public String welcome() {
		return ("Welcome on payme webservice site");
 }
	@GetMapping("/thanks/id")
 	public String thanks() {
		return ("thank you for visiting us");
 }
 
	

	@GetMapping("/api/contact")
	public List<ContactService> getcontact() {
		return List.of(
				new ContactService(
								
					
						)
				);
		
	}

	@GetMapping("/api/v1/productlist")
	public List<ProductList> getProductlists() {
		return List.of(
				new ProductList(
								40005L, null, 0, 0, null, null, 0,null
					
						)
				);
		
	}
	
}
