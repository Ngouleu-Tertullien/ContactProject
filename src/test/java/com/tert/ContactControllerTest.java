package com.tert;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.tert.controller.ContactController;
import com.tert.model.Contact;
import com.tert.service.ContactService;


@RunWith(SpringRunner.class)
@WebMvcTest(ContactController.class)
public class ContactControllerTest {
	
	@Autowired
	private MockMvc mockmvc;
	
	@MockBean
	ContactService contactService;
	
	@Test
	public void ContactController_getAllTest() throws Exception {
		when(contactService.retrieveAll()).thenReturn(
				Arrays.asList(new Contact("Lobe",(long)652930365)));
		RequestBuilder request = MockMvcRequestBuilders
				.get("/contact")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockmvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content()
						.json("[{name:Lobe, phone:652930365}]"))
				.andReturn();
	}
	

}
