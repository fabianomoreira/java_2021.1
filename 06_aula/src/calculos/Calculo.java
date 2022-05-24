package calculos;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		double primeiroNumero, segundoNumero;
		String operacao, escolha;
		
		Calculo calculo = new Calculo();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor : ");
		primeiroNumero = teclado.nextDouble();
		
		System.out.println("Digite o segundo valor : ");
		segundoNumero = teclado.nextDouble();
		
		do{
			System.out.println("Escolha uma das operações (+, -, *, /)");
			operacao = teclado.next();
			
			System.out.println("O resultado é : " + calculo.calcular(primeiroNumero, segundoNumero, operacao));
			
			System.out.println("Deseja realizar outra operação (S/N)");
			escolha = teclado.next();
			
		} while(escolha.equals("S"));
		
		teclado.close();
	}
	
	public double calcular(double primeiroNumero, double segundoNumero, String operacao) {
		Calculadora calculadora = new Calculadora();
		double resultado;

		if(operacao.equals("+")) {
			resultado = calculadora.somar(primeiroNumero, segundoNumero);
		} else if(operacao.equals("-")) {
			resultado = calculadora.subtrair(primeiroNumero, segundoNumero);
		} else if(operacao.equals("*")) {
			resultado = calculadora.multiplicar(primeiroNumero, segundoNumero);
		} else {
			resultado = calculadora.dividir(primeiroNumero, segundoNumero);
		}
		
		return resultado;
	}

}
