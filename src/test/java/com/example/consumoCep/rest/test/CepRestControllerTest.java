package com.example.consumoCep.rest.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class CepRestControllerTest {

	@Autowired
	MockMvc mvc;
	
	@Test
	public void shouldReturnCepFromJson() throws Exception {
		mvc.perform(get("/api/cep/9299000a0"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON))
			.andExpect(content().json("{\"cep\":\"92990-000\",\"logradoura\":null,\"complemento\":\"\",\"localidade\":\"Eldorado do Sul\",\"uf\":\"RS\"}"));
	}
	
}