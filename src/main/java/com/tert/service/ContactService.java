package com.tert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tert.model.Contact;

@Component
public class ContactService {
	
	@Autowired
	ContactRepository contactRepo;
	
	public List<Contact> retrieveAll(){
		return contactRepo.findAll();
	}

}
