package amigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AmigoOculto {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		Random posicao = new Random();
		
		nomes.add("Arian");
		nomes.add("Nicolas");
		nomes.add("Matheus");
		nomes.add("Marcus");
		nomes.add("Jo�o");
		nomes.add("Beatriz");
		nomes.add("Henrique");
		
		System.out.println("O nome � " + nomes.get(posicao.nextInt(nomes.size())));
	}

}
