package br.com.paulomatheus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.paulomatheus.model.Veiculo;
import br.com.paulomatheus.services.VeiculoServices;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
	@Autowired
	private VeiculoServices services;
	
	@RequestMapping(value="/{id}", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Veiculo findById(@PathVariable("id") String id) {
		return services.findById(id);
		
	}
	
	@RequestMapping(method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Veiculo> findAll() {
		return services.findAll();		
	}

	@RequestMapping(method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Veiculo create(@RequestBody Veiculo veiculo) {
		return services.create(veiculo);
		
	}
	
	@RequestMapping(value="/{id}",
			method = RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Veiculo update(@RequestBody Veiculo veiculo) {
		return services.update(veiculo);
		
	}
	
	@RequestMapping(value="/{id}", 
			method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") String id) {
		services.delete(id);
		
	}
}
