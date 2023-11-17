import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculadoraIMC extends JFrame implements ActionListener{


	JButton btnCalcularIMC = new JButton("CalcularIMC");
	JButton btnSair = new JButton("Sair");
	
	JLabel lblPeso = new JLabel("Peso");
	JLabel lblAltura = new JLabel("Altura");
	
	JTextField txtPeso = new JTextField();
	JTextField txtAltura = new JTextField();
	
	public CalculadoraIMC() {

		btnCalcularIMC.addActionListener(this);
		btnSair.addActionListener(this);
		
		setLayout(null);

		btnCalcularIMC.setBounds(100, 300, 120, 30);
		btnSair.setBounds(300, 300, 100, 30);

		add(btnCalcularIMC);
		add(btnSair);		
	
		
		lblPeso.setBounds(100, 50 , 100, 20);
		lblAltura.setBounds(100, 100, 110, 20);
		add(lblPeso);
		add(lblAltura);
		
		txtPeso.setBounds(220, 50, 200, 30);
		txtAltura.setBounds(220, 100, 100, 30);

		add(txtPeso);
		add(txtAltura);	
		
		setTitle("Calculadora IMC");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	
	}
	
	 public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnCalcularIMC) {
	            calcularIMC();
	        } else if (e.getSource() == btnSair) {
	            System.exit(0);
	        }
	    }

	    private void calcularIMC() {
	        try {
	            double peso = Double.parseDouble(txtPeso.getText());
	            double altura = Double.parseDouble(txtAltura.getText());

	            double imc = peso / (altura * altura);

	            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc);
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "Por favor, insira valores numéricos válidos.", "Erro",
	                    JOptionPane.ERROR_MESSAGE);
	        }
	    }
	
	
	
	public static void main(String[] args) {
		
		new CalculadoraIMC();
	}

		
		
	}
	
