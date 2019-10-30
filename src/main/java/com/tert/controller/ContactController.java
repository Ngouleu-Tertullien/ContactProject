package com.tert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tert.model.Contact;
import com.tert.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	@GetMapping("/contact")
	public List<Contact> getALLContacts(){
		return contactService.retrieveAll();
	}

}
