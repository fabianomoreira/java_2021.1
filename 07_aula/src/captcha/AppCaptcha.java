package captcha;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AppCaptcha {

	public static void main(String[] args) {
		String entrada;
		String captcha;
		boolean continua = true;
		
		Scanner teclado = new Scanner(System.in);
		AppCaptcha app = new AppCaptcha();
		
		do {
			captcha = app.gerarCaptcha();
			
			System.out.println("------");
			System.out.println(captcha);
			System.out.println("------");
			System.out.println("Digite o código acima:");
			entrada = teclado.next();
			
			if(captcha.equals(entrada)) {
				System.out.println("Parabéns! Você não é um robô!");
				continua = false;
			} else {
				System.out.println("Robôs não são permitidos");
			}
		} while (continua);
		
		teclado.close();
	}
	
	public String gerarCaptcha() {
		String captcha = "";
		int valor;
		
		List<String> urna = new ArrayList<String>();
		urna.add("A");
		urna.add("B");
		urna.add("C");
		urna.add("D");
		urna.add("E");
		urna.add("F");
		urna.add("G");
		urna.add("H");
		urna.add("I");
		urna.add("J");
		urna.add("K");
		urna.add("L");
		urna.add("M");
		urna.add("N");
		urna.add("O");
		urna.add("P");
		urna.add("Q");
		urna.add("R");
		urna.add("S");
		urna.add("T");
		urna.add("U");
		urna.add("V");
		urna.add("W");
		urna.add("X");
		urna.add("Y");
		urna.add("Z");
		urna.add("0");
		urna.add("1");
		urna.add("2");
		urna.add("3");
		urna.add("4");
		urna.add("5");
		urna.add("6");
		urna.add("7");
		urna.add("8");
		urna.add("9");
		
		Random sorteio = new Random();
		
		for(int i = 0; i < 6; i++) {
			valor = sorteio.nextInt(urna.size());
			
			captcha += urna.get(valor);
		}
		
		return captcha;
	}
}
