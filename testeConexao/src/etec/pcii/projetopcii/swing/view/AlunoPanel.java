package etec.pcii.projetopcii.swing.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class AlunoPanel extends JFrame {
	
	private JLabel titulo = new JLabel("Cadastro de Alunos");
	private JLabel lblNomeAluno = new JLabel ("Nome do aluno: ");
	private JLabel lblRm = new JLabel("RM: ");
	private JTextField txtNomeAluno = new JTextField("",100);
	private JTextField txtRm = new JTextField(10);
	
	public AlunoPanel() {
		super ("Area Aluno");
		
		Container tela = getContentPane();
		getContentPane().setBackground(new Color (211,211,211));
		
		
		setLayout(null);
		
		setLocationRelativeTo(null);
		titulo.setBounds(230,20,130,20);
		
		
		
		
		
		
		tela.add(titulo);
		tela.add(lblNomeAluno);
		tela.add(lblRm);
		setSize(630,400);
		setVisible(true);
		
		
	}

}
