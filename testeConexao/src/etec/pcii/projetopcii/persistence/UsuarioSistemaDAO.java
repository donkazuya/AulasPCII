package etec.pcii.projetopcii.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		List<UsuarioSistema> listaDeUsuarios = new ArrayList<>();
		PreparedStatement prepareStatement = conn.prepareStatement("select  p.nome as nomeDapessoa from tbl_usuariosistema as u join tblPess as p ");
		ResultSet rs = prepareStatement.executeQuery();
		while (rs.next()){
			String login = rs.getString("usuarioLogin");
			String nomeDaPessoa = rs.getString("nomeDaPessoa");
			String senhaLogin = rs.getString("senhaLogin");
			UsuarioSistema usu = new UsuarioSistema(nomeDaPessoa,login,senhaLogin);
			
		}
		return listaDeUsuarios;
	}
	
	

}

