package etec.pcii.projetopcii.model;

public class Aluno extends Pessoa {

	private String nomeAluno;
	private int rm;
	
	public Aluno(String nomeCompleto, String nomeAluno,int rm){
		super(nomeCompleto);
		this.nomeAluno = nomeAluno;
		this.rm = rm;
		
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	
}
