package com.ismartkorea.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloControllTest {

	@Autowired
	private MockMvc mvc;
	
	public void hello가_리턴된다() throws Exception {
		String hello = "hello";
		
		mvc.perform(get("/hello"))
		.andExpect(status().isOk())
		.andExpect(content().string(hello));
	}
}
