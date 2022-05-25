package captcha;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AppCaptchaEvolucao {

	public static void main(String[] args) {
		String entrada;
		String captcha;
		boolean continua = true;
		
		Scanner teclado = new Scanner(System.in);
		AppCaptchaEvolucao app = new AppCaptchaEvolucao();
		
		do {
			captcha = app.gerarCaptcha();
			
			System.out.println("------");
			System.out.println(captcha);
			System.out.println("------");
			System.out.println("Digite o c�digo acima:");
			entrada = teclado.next();
			
			if(captcha.equals(entrada)) {
				System.out.println("Parab�ns! Voc� n�o � um rob�!");
				continua = false;
			} else {
				System.out.println("Rob�s n�o s�o permitidos");
			}
		} while (continua);
		
		teclado.close();
	}
	
	public String gerarCaptcha() {
		String captcha = "";
		int valor;
		
		String urna = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		
		Random sorteio = new Random();
		
		for(int i = 0; i < 6; i++) {
			valor = sorteio.nextInt(urna.length());
			
			captcha += urna.substring(valor, valor+1);
		}
		
		return captcha;
	}
}
