package clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int opcao;
		
		String nome, telefone;
		int idade;
		
		Cliente cliente;

		App app = new App();
		
		List<Cliente> banco = new ArrayList<Cliente>();
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("----- M E N U ------");
			System.out.println("1 - Ler Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Média das idades");
			System.out.println("4 - Alterar Cliente");
			System.out.println("5 - Excluir Cliente");
			System.out.println("0 - Banco de Teste");
			System.out.println("6 - F I M");
			System.out.println("--------------------");
			System.out.println("Digite uma opção:");

			opcao = teclado.nextInt();
			
			if(opcao == 1) {
				// Inclusão do cliente
				cliente = new Cliente();
				
				System.out.println("--------------------------");
				System.out.println("Informe o nome do cliente:");
				teclado.nextLine();
				nome = teclado.nextLine();
				
				System.out.println("Informe o telefone:");
				telefone = teclado.next();
				
				System.out.println("Qual a idade do cliente?");
				idade = teclado.nextInt();

				cliente.setNome(nome);
				cliente.setTelefone(telefone);
				cliente.setIdade(idade);
				
				banco.add(cliente);
			} else if(opcao == 2) {
				for(Cliente c: banco) {
					System.out.println(c.getNome() + " - " + c.getTelefone() + " - " + c.getIdade());
				}
			} else if(opcao == 3) {
				System.out.println("A média das idades é : " + app.calcularMedia(banco));
			} else if(opcao == 0) {
				banco = app.carregarBanco();
			}
			
		} while (opcao < 6);

		teclado.close();
	}

	public double calcularMedia(List<Cliente> lista) {
		int somaIdade = 0;
		
		for(Cliente c: lista) {
			somaIdade += c.getIdade();
		}
		
		return (somaIdade / lista.size());
	}
	
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
}
