package etec.pcii.projetopcii.swing.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class AlunoPanel extends JFrame {
	
	private JLabel titulo = new JLabel("Alunos: ");
	private JLabel lblNomeAluno = new JLabel ("Nome do aluno: ");
	private JLabel lblRm = new JLabel("RM: ");
	private JTextField txtNomeAluno = new JTextField("",100);
	private JTextField txtRm = new JTextField(10);
	
	public AlunoPanel() {
		super ("Area Aluno");
		Container tela = getContentPane();
		
		setSize(500,500);
		setVisible(true);
		
	}

}
