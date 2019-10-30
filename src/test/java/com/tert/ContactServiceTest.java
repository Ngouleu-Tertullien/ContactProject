package com.tert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.tert.model.Contact;
import com.tert.service.ContactRepository;
import com.tert.service.ContactService;

@RunWith(value = MockitoJUnitRunner.class)
@SpringBootTest
public class ContactServiceTest {
	
	@InjectMocks
	ContactService contactService;
	
	@Mock
	ContactRepository contactRepo;
	
	@Test
	public void retreiveItemTest() {
		
		List<Contact> actualResponse = Arrays.asList(new Contact("lobe",(long)653678900));
		when(contactRepo.findAll()).thenReturn(actualResponse);
		List<Contact> expectedResponse = contactService.retrieveAll();
		
		
		assertEquals(expectedResponse,actualResponse);
	}

}
