package etec.pcii.projetopcii;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

//import com.mysql.jdbc.Statement;

import etec.pcii.projetopcii.model.UsuarioSistema;
import etec.pcii.projetopcii.persistence.Conexao;
import etec.pcii.projetopcii.persistence.UsuarioSistemaDAO;
import etec.pcii.projetopcii.swing.view.AlunoPanel;
import etec.pcii.projetopcii.swing.view.LoginPanel;

public class App 
{
private static String versao = "v1";
	
	
	private List<UsuarioSistema> usuariosCadastrados = new ArrayList<UsuarioSistema>();
	private List<UsuarioSistema> usuariosLogados = new ArrayList<UsuarioSistema>();
	private UsuarioSistema usuarioLogado; //default e null 

	
	public App() throws Exception {
		this.usuariosCadastrados.add(new UsuarioSistema("Administrador", "admin", "123456"));
		//this.usuariosCadastrados.add(new UsuarioSistema("Danrley", "Donkazuya", "123456"));
		this.apresentarPainelDeLogin();
		
		//UsuarioSistema Danrley = new UsuarioSistema("Danrley Candido","Donkazuya","12345");
		//UsuarioSistema Dimas = new UsuarioSistema("Dimas Pierre","Peter","abcde");
		//JdbcDAO<Pessoa> jdbc_Pessoa_DAO = new JdbcDAO<Pessoa>();
		//jdbc_Pessoa_DAO.inserir(Danrley);
		//jdbc_Pessoa_DAO.inserir(Dimas);
		
		
		
	}
	
	public void apresentarPainelDeLogin() {
		JFrame jFrame =  new JFrame("Tela Principal");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		System.out.println(this);
		jFrame.add(new LoginPanel(this));
		jFrame.pack();
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
	}
	
	/*public void apresentarTelaAluno() {
		JFrame telaAluno = new JFrame("Cadastro Aluno");
		telaAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaAluno.add(new AlunoPanel());
		telaAluno.setLocationRelativeTo(null);
		telaAluno.setVisible(true);
		
		
	}*/

	public List<UsuarioSistema> getUsuariosCadastrados() {
		
		//define as variaveis para o acesso
		Connection conne;
		List listagemDeUsuarios = null;
		
		//Tratamento de erros
		try {
			conne = new Conexao().getMysqlConnection();
			UsuarioSistemaDAO listagem = new UsuarioSistemaDAO(conne);
			listagemDeUsuarios = listagem.listar();
		} catch (Exception e) {
			//informa dentro do bloco try onde ocorreu o erro
			e.printStackTrace();
		}
		
		System.out.println("public List<UsuarioSistema> getUsuariosCadastrados() {..." + this.usuariosCadastrados.size());
		return listagemDeUsuarios;
	}

	public UsuarioSistema getUsuarioLogado() {
		return usuarioLogado;
	}


	public void setUsuarioLogado(UsuarioSistema usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	public List<UsuarioSistema> getUsuariosLogados() {
		return usuariosLogados;
	}

	public void setUsuariosLogados(List<UsuarioSistema> usuariosLogados) {
		this.usuariosLogados = usuariosLogados;
	}
	
    public static void main( String[] args ) throws Exception
    {
    	//App program = new App();
    	
    	new App();
    	

    	Connection conn = new Conexao().getMysqlConnection();
    	
    	//update inserindo informaçoes no banco de dados
    	UsuarioSistemaDAO usuarioSistemaDAO = new UsuarioSistemaDAO(conn);
    	UsuarioSistema u = new UsuarioSistema("Danrley Candido", "Danrley", "123");
    	usuarioSistemaDAO.inserir(u);
//    	String sql = "insert into alunos (nome) values ('NomeAluno1')";
//    	
//    	PreparedStatement stm = conn.prepareStatement(sql);
//    	stm.executeUpdate();
    	
    	//select na tabela 
    	Statement stmz = conn.createStatement();
    	ResultSet rs=stmz.executeQuery("Select *from alunos");
    	while(rs.next()){
    		System.out.println(rs.getString("nome"));
    	}
    	
    	System.out.println(conn);
    	
    	
    }
}
