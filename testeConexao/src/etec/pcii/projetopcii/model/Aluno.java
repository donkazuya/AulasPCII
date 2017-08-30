package etec.pcii.projetopcii.model;

public class Aluno extends Pessoa {

	private String nomeAluno;
	
	public Aluno(String nomeCompleto, String nomeAluno){
		super(nomeCompleto);
		this.nomeAluno = nomeAluno;
		
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	
}
