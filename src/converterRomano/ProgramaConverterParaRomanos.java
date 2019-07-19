package converterRomano;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ProgramaConverterParaRomanos extends JFrame{
	
	private JLabel labelRomano1;
	private JLabel labelRomano2;
	private JLabel labelRomano3;
	private JTextField romanoTextField;
	private JTextField romanoResultadoTextField;
	private JButton botaoLimpar;
	private JButton botaoSair;
	private JButton botaoConverterRomano;
	
	ConverterRomanos converter = new ConverterRomanos();
	
	public ProgramaConverterParaRomanos(){
		
		this.setTitle("Calculadora números romanos");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.setBounds(450, 250, 200, 150);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

//Adicionando botão sair
		botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Evento) {
				System.exit(0);
				
			}
		});
		
//Adicionando botão limpar		
		botaoLimpar = new JButton("Limpar");
		botaoLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Evento) {
				romanoTextField.setText("");
				romanoResultadoTextField.setText("");
			}
		});
		
				
//Botão para converter para numeros Romano.		
		
		botaoConverterRomano = new JButton("Converter");
		botaoConverterRomano.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Evento) {
				String resul;  
		    	   try{
		    		   int num = Integer.parseInt(romanoTextField.getText());   
		    		   resul = converter.numero(num);
		    		   romanoResultadoTextField.setText(String.valueOf(resul));	   
		    	   }
		    	   catch (Exception e) {
		    		   JOptionPane.showMessageDialog(null,"Caracter Invalido.");
		    	   }    
				
			}
		});
		
		
// Instanciar os objetos Label, TextField 		
		  labelRomano1 = new JLabel("      Converter p/  Nº. ROMANO       ");   
		  labelRomano2 = new JLabel("Nº.:");
		  romanoTextField = new JTextField (3);
		  labelRomano3 = new JLabel("Resultado");
		  romanoResultadoTextField = new JTextField(10);
		  romanoResultadoTextField.setEditable(false);	
		
		  
// Adicionar os elementos ao container		  
		c.add(labelRomano1);  
		c.add(labelRomano2);
		c.add(romanoTextField);  
		c.add (botaoConverterRomano);
		c.add (labelRomano3);
		c.add (romanoResultadoTextField);  
		c.add (botaoLimpar);
		c.add(botaoSair);
		
		this.setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		
		ProgramaConverterParaRomanos ConverterR = new ProgramaConverterParaRomanos();
		

	}

}
