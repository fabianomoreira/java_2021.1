package visao;

import java.util.List;
import java.util.Scanner;

import modelo.Cliente;
import util.Util;

public class Tela {
	public Cliente desenharIncluir() {
		Scanner teclado = new Scanner(System.in);
		String nome, telefone;
		int idade;
		Cliente cliente = new Cliente();

		System.out.println("--------------------------");
		System.out.println("Informe o nome do cliente:");

		nome = teclado.nextLine();

		System.out.println("Informe o telefone:");
		telefone = teclado.next();

		System.out.println("Qual a idade do cliente?");
		idade = teclado.nextInt();

		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setIdade(idade);
				
		return cliente;
	}
	
	public void listarCliente(List<Cliente> banco) {
		for (Cliente c : banco) {
			System.out.println(banco.indexOf(c) + " - " + c.getNome() + " - " + c.getTelefone() + " - " + c.getIdade());
		}		
	}
	
	public void exibirMedia(List<Cliente> banco) {
		Util util = new Util();
		
		System.out.println("A média das idades é : " + util.calcularMedia(banco));
	}
}
