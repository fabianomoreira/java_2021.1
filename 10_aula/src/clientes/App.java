package clientes;

import java.util.Scanner;

import controle.Controle;
import visao.Menu;

public class App {

	public static void main(String[] args) {
		int opcao;
						
		Scanner teclado = new Scanner(System.in);
		Menu menu = new Menu();
		Controle controle = new Controle();
		
		do {
			menu.desenharMenu();
			opcao = teclado.nextInt();
			
			controle.avaliarOpcao(opcao);
		} while (opcao < 6);

		teclado.close();
	}
}
