package etec.pcii.projetopcii.persistence;

import java.sql.Connection;
import etec.pcii.projetopcii.model.UsuarioSistema;

public class UsuarioSistemaDAO implements IDAO {
	
	Connection conn;
	
	public UsuarioSistemaDAO(Connection conn){
		this.conn = conn;
	}
	
	public void inserir(Object o){
		
		
		
		
		String sql = "insert into Tbl_UsuariosDoSistema (nomelogin) values ('"+((UsuarioSistema)o).getLogin()+"')";
//		String sqlLogin ="insert into login(nomelogin) values ('"+a.getLogin()+"')";
//		String sqlSenha = "insert into login(senha) values ('"+a.getSenha()+"')";
		//System.out.println(sql);
		
		
	}

}

