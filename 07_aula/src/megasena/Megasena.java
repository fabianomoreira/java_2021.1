package megasena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Megasena {

	public static void main(String[] args) {
		Random numero = new Random();
		List<Integer> valores = new ArrayList<Integer>();
		
		int temp;
		
		for(int i=0; i < 6; i++) {
			temp = numero.nextInt(60) + 1;
			
			if(valores.contains(temp)) {
				i--;
			} else {
				valores.add(temp);
			}
		}
		
		for(int valor: valores) {
			System.out.println(valor);
		}
	}

}
