package etec.pcii.projetopcii.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Pessoa {
	private String nome;

	public Pessoa(String nome) {	
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
