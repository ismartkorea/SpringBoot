package com.ismartkorea.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@WebMvcTest(HelloControllerTest.class)
public class HelloControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void hello_GET() throws Exception {
		String hello = "hello";
		
		mockMvc.perform(get("/hello"))
		.andExpect(status().isOk())
		.andExpect(content().string(hello));
		
	}
}
