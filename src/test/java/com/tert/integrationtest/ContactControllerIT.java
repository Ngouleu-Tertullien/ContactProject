package com.tert.integrationtest;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ContactControllerIT {
	@Autowired
	private TestRestTemplate  restTemplate;
	
	@Test
	public void contextLoads() throws JSONException {
		
		String response = this.restTemplate.getForObject("/contact", String.class);
		
		JSONAssert.assertEquals("[{id=1}]",response,false);
		
	}


}
