package com.payme.payme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.payme.payme.entity.Contact;
import com.payme.payme.repostory.ContactRepo;
import com.payme.payme.services.ContactService;
//import com.payme.payme.services.LibraryLoansService;
//import com.payme.payme.repostory.LibraryLoansRepo;

@SpringBootApplication

	//public class PaymeApplication implements CommandLineRunner {     
	
	public class PaymeApplication {
	
	//@Autowired
	//LibraryLoansService libraryLoansService;
	
	
	//@Autowired
	//LibraryLoansService libraryLoansService;
	
	//@Autowired
	//LibraryLoansRepo libraryLoansRepo;
	
	@Autowired
	ContactService contactService;
	
	@Autowired
	ContactRepo contactRepo;
	
	static final Logger logger =LoggerFactory.getLogger(PaymeApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PaymeApplication.class, args);
		
		Contact contact =new Contact ();
		contact.setStudid(1);
		contact.setStudFirstname("Jason");
		contact.setStudLastName("Mbikayi");
		contact.setEmailId("jason.mbikayi@gmail.com");
		contact.setPhone("6138933675");
		
		logger.debug("Object Contact a été crée est: "+contact);
		
		
		
		
		
	}

	
}
