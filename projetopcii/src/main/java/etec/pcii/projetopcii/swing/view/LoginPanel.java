package etec.pcii.projetopcii.swing.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import etec.pcii.projetopcii.App;
import etec.pcii.projetopcii.model.UsuarioSistema;

public class LoginPanel extends JPanel {
	
	private App app;
	private JLabel tituloDaTelaLabel = new JLabel("Painel de Login");
	private JLabel loginLabel =  new JLabel("Login");		
	private JTextField loginTxtField  =  new JTextField("",50);
	private JLabel senhaLabel = new JLabel("Senha");
	private JPasswordField senhaPasswdField = new JPasswordField("",50);
	private JButton btnLogin = new JButton("OK");
		
	public LoginPanel(App app) {
		//Layout padroa é o border layout
		//https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html
		this.app = app;
		this.setBackground(Color.RED);
		this.add(this.tituloDaTelaLabel);
		this.setLayout(new GridLayout(0, 1));
		
		JPanel jPnLogin = new JPanel(new FlowLayout());
		//jPnLogin.setPreferredSize(new Dimension(200, 200));
		jPnLogin.setBackground(Color.GREEN);		
		jPnLogin.add(loginLabel);		
		jPnLogin.add(loginTxtField);
		
		JPanel jPnSenha = new JPanel(new FlowLayout());
		//jPnSenha.setPreferredSize(new Dimension(200, 200));
		jPnSenha.setBackground(Color.YELLOW);
		jPnSenha.add(senhaLabel);
		jPnSenha.add(senhaPasswdField);
		
		this.btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {			

				String nomeDoUsuarioQueQuerLogar = LoginPanel.this.loginTxtField.getText(); 
				String senhaDoUsuarioQueQuerLogar = LoginPanel.this.senhaPasswdField.getText();
				System.out.println();
				App app2 = LoginPanel.this.app;
				List<UsuarioSistema> usuariosCadastrados = LoginPanel.this.app.getUsuariosCadastrados();
				
				for (UsuarioSistema u : LoginPanel.this.app.getUsuariosCadastrados()) {
					if(u.getLogin().equals(nomeDoUsuarioQueQuerLogar) && u.getSenha().equals(senhaDoUsuarioQueQuerLogar)) {
						LoginPanel.this.app.getUsuariosLogados().add(u);
						System.out.println("Usuario logado com sucesso");
						System.out.println(u.getNome());
						System.out.println(u.getLogin());
						break;
					}//if
				}//for
				System.out.println("Usuario ou Senha nao conferem!!!");
			}
		});
		
		
		this.add(tituloDaTelaLabel);
		this.add(jPnSenha);
		this.add(jPnLogin);
		this.add(btnLogin);		
	}

}
