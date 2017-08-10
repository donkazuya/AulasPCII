package etec.pcii.projetopcii;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

import etec.pcii.projetopcii.model.UsuarioSistema;
import etec.pcii.projetopcii.swing.view.LoginPanel;

public class App 
{
private static String versao = "v1";
	
	
	private List<UsuarioSistema> usuariosCadastrados = new ArrayList<UsuarioSistema>();
	private List<UsuarioSistema> usuariosLogados = new ArrayList<UsuarioSistema>();
	private UsuarioSistema usuarioLogado; //default e null 

	
	public App() throws Exception {
		//this.usuariosCadastrados.add(new UsuarioSistema("Administrador da Silva", "admin", "admin123"));
		//this.usuariosCadastrados.add(new UsuarioSistema("Danrley", "Donkazuya", "123456"));
		this.apresentarPainelDeLogin();
		
		UsuarioSistema Danrley = new UsuarioSistema("Danrley Candido","Donkazuya","12345");
		UsuarioSistema Dimas = new UsuarioSistema("Dimas Pierre","Peter","abcde");
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
		jFrame.setVisible(true);
	}

	public List<UsuarioSistema> getUsuariosCadastrados() {
		System.out.println("public List<UsuarioSistema> getUsuariosCadastrados() {..." + this.usuariosCadastrados.size());
		return usuariosCadastrados;
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
    }
}
