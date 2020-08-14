package br.com.paulomatheus.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.paulomatheus.model.Veiculo;

@Service
public class VeiculoServices {
private final AtomicLong counter = new AtomicLong();
	
	public Veiculo create(Veiculo veiculo) {
		return veiculo;
	}
	
	public Veiculo update(Veiculo veiculo) {
		return veiculo;
	}
	
	public void delete(String id) {
	}
	
	public Veiculo findById(String id) {
		Veiculo veiculo = new Veiculo();
		veiculo.setId(counter.incrementAndGet());
		veiculo.setVeiculo("Veiculo");
		veiculo.setMarca("Marca");
		veiculo.setAno(2000);
		veiculo.setDescricao("Descricao");
		veiculo.setVeiculo(null);
		veiculo.setCreated(null);
		veiculo.setUpdate(null);
		return veiculo ;
	}
	
	public List<Veiculo> findAll() {
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		for (int i = 0; i < 8; i++) {
			Veiculo veiculo = mockVeiculo(i);
			veiculos.add(veiculo);
		}
		return veiculos;
	}

	private Veiculo mockVeiculo(int i) {
		Veiculo veiculo = new Veiculo();
		veiculo.setId(counter.incrementAndGet());
		veiculo.setVeiculo("Veiculo");
		veiculo.setMarca("Marca");
		veiculo.setAno(2000);
		veiculo.setDescricao("Descricao");
		veiculo.setVeiculo(null);
		veiculo.setCreated(null);
		veiculo.setUpdate(null);
		return veiculo ;
	}
}
