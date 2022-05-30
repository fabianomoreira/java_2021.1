package amigo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AmigoOculto {

	public static void main(String[] args) throws ParseException {
		int numeroParticipantes;
		String nome, presente, aniversario, continua;
		Participante participante;
		
		List<Participante> nomes = new ArrayList<Participante>();
		Random posicao = new Random();

		Scanner teclado = new Scanner(System.in);

		System.out.println("Quantas pessoas no sorteio?");
		numeroParticipantes = teclado.nextInt();

		for (int i = 0; i < numeroParticipantes; i++) {
			participante = new Participante();
			
			System.out.println("Digite o nome do participante " + (i + 1));
			nome = teclado.next();

			System.out.println("Digite o presente");
			presente = teclado.next();
			
			System.out.println("Digite a data de aniversário");
			aniversario = teclado.next();
			
			participante.setNome(nome);
			participante.setPresente(presente);
			
			// Criando e convertendo uma data
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			
			participante.setAniversario(formato.parse(aniversario));
			
			nomes.add(participante);
		}

		System.out.println("Deseja fazer o sorteio agora? (S/N)");
		continua = teclado.next();
		
		if(continua.equals("S")) {
			/*
			System.out.println("O nome sorteado é " + nomes.get(posicao.nextInt(nomes.size())).getNome() + " Presente: " +
                    nomes.get(posicao.nextInt(nomes.size())).getPresente());
			*/
			System.out.println(nomes.get(posicao.nextInt(nomes.size())));
		} else {
			System.out.println("O sorteio foi cancelado");
		}
	}
}
