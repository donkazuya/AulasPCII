package etec.pcii.projetopcii.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import etec.pcii.projetopcii.model.UsuarioSistema;

public class UsuarioSistemaDAO <T extends UsuarioSistema>implements IDAO<T> {
	
	Connection conn;
	
	public UsuarioSistemaDAO(Connection conn){
		this.conn = conn;
	}
	
	
	@Override
	public void inserir(T o) throws Exception{
		
	
		String sql = "insert into tbl_usuariosistema (nomeLogin,senha) values ('"+((UsuarioSistema)o).getLogin()+"','"+((UsuarioSistema)o).getSenha()+"')";
		// Preparando para salvar as informações pro banco
		PreparedStatement prepareStatement = conn.prepareStatement(sql);
		prepareStatement.execute();
		System.out.println(sql);
		
		
	}


	@Override
	public List listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

