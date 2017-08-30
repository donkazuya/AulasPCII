package etec.pcii.projetopcii.persistence;

import java.sql.Connection;
import etec.pcii.projetopcii.model.Aluno;

public class AlunoDAO {
	
	Connection conn;
	
	public AlunoDAO(Connection conn){
		this.conn=conn;
	}
	
	public void inserir(Aluno a){
		
		String sql = "insert into alunos(nome)values ('"+a.getNomeAluno()+"')";
		System.out.println(sql);
	}

}
