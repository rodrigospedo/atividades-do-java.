import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;

public class Calcular extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtImc;
	private JTextField txtClassificacao;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcular frame = new Calcular();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calcular() {
		setForeground(Color.BLUE);
		setTitle("Calculo IMC");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 255);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peso :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(25, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(25, 68, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(81, 30, 63, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(81, 67, 63, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("IMC :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(36, 107, 36, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Calcular.class.getResource("/icons/imc.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			calcular();
			}
		});
		btnNewButton.setBounds(205, 11, 100, 93);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			limpar();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Calcular.class.getResource("/icons/limpar.png")));
		btnNewButton_1.setBounds(219, 119, 91, 93);
		contentPane.add(btnNewButton_1);
		
		txtImc = new JTextField();
		txtImc.setBounds(82, 106, 46, 20);
		contentPane.add(txtImc);
		txtImc.setColumns(10);
		
		txtClassificacao = new JTextField();
		txtClassificacao.setBounds(10, 164, 199, 20);
		contentPane.add(txtClassificacao);
		txtClassificacao.setColumns(10);
		
		JLabel lblVocEst = new JLabel("");
		lblVocEst.setBounds(38, 226, 72, 14);
		contentPane.add(lblVocEst);
		
		//JLabel lblClassificacao = new JLabel(".");
		//lblClassificacao.setBounds(207, 31, 68, 16);
		//contentPane.add(lblClassificacao);
	}

	private void calcular() {
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner leia = new Scanner(System.in); //import scanner java until
		double peso, altura, imc;
		peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
		altura = Double.parseDouble(txtAltura.getText().replace(",", "."));		
		imc = peso / (altura * altura);
		txtImc.setText(formatador.format(imc));
		
		if (imc<18.5) {
			txtClassificacao.setText("ABAIXO DO PESO");		
		} else if (imc >= 18.5 && imc < 25) {
			txtClassificacao.setText("PESO NORMAL");		
		} else if(imc > 25 && imc <= 30) {
			txtClassificacao.setText("ACIMA DO PESO");		
		} else {
			txtClassificacao.setText("OBESO");
		}
	}
	
	private void limpar() {
		txtPeso.setText(null);
		txtAltura.setText(null);
		txtImc.setText(null);
	}
}

