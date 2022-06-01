package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import modelo.Cliente;

public class Util {
	public List<Cliente> carregarBanco(){
		List<Cliente> lista = new ArrayList<Cliente>();
		List<String> nomes = new ArrayList<String>();
		Cliente cliente;
		Random random = new Random();
		
		nomes.add("Beatriz");
		nomes.add("Arian Fernandes");
		nomes.add("Ana Clara");
		nomes.add("João Gomes");
		nomes.add("Jorge Jesus");
		nomes.add("Fabiano");
		nomes.add("Vinicius");
		nomes.add("Danilo");
		
		for(int i = 0; i < 5; i++) {
			cliente = new Cliente();
			
			cliente.setNome(nomes.get(random.nextInt(nomes.size())));
			cliente.setTelefone("xx-xxxx-xxx"+i);
			cliente.setIdade(random.nextInt(98) + 1);
			
			lista.add(cliente);
		}
		
		return lista;
	}
	
	public double calcularMedia(List<Cliente> lista) {
		int somaIdade = 0;
		
		for(Cliente c: lista) {
			somaIdade += c.getIdade();
		}
		
		return (somaIdade / lista.size());
	}
}
