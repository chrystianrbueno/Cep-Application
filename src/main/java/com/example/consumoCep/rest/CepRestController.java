
package com.example.consumoCep.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.consumoCep.model.CepModel;

@RestController
//localhost:8080/api/cep
@RequestMapping("/api/cep")
public class CepRestController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/{cep}", produces = "application/json")
	public CepModel getCep(@PathVariable String cep) {
		CepModel newCep = restTemplate.getForObject("https://viacep.com.br/ws/" + cep + "/json/", CepModel.class);
		return newCep;
	}

}
