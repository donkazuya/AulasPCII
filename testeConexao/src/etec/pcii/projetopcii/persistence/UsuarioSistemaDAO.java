package etec.pcii.projetopcii.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import etec.pcii.projetopcii.model.UsuarioSistema;

public class UsuarioSistemaDAO implements IDAO {
	
	Connection conn;
	
	public UsuarioSistemaDAO(Connection conn){
		this.conn = conn;
	}
	
	public void inserir(Object o) throws Exception{
		
	
		String sql = "insert into tbl_usuariosistema (nomeLogin,senha) values ('"+((UsuarioSistema)o).getLogin()+"','"+((UsuarioSistema)o).getSenha()+"')";
		
		
		// Preparando para salvar as informações pro banco
		PreparedStatement prepareStatement = conn.prepareStatement(sql);
		prepareStatement.execute();
		
//		String sqlLogin ="insert into login(nomelogin) values ('"+a.getLogin()+"')";
//		String sqlSenha = "insert into login(senha) values ('"+a.getSenha()+"')";
		System.out.println(sql);
		
		
	}

}

