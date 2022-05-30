package amigo;

import java.util.Date;

public class Participante {
	private String nome;
	private String presente;
	private Date aniversario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPresente() {
		return presente;
	}
	public void setPresente(String presente) {
		this.presente = presente;
	}
	
	public Date getAniversario() {
		return aniversario;
	}
	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	
	@Override
	public String toString() {
		return "O sorteado foi " + nome + " e o presente é " + presente + " o aniversário é " + aniversario;
	}
	
}
