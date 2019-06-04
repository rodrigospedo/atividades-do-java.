import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculoImc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoImc frame = new CalculoImc();
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
	public CalculoImc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(10, 11, 30, 14);
		contentPane.add(lblPeso);
		
		textField = new JTextField();
		textField.setBounds(50, 8, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(10, 59, 48, 14);
		contentPane.add(lblAltura);
		
		textField_1 = new JTextField();
		textField_1.setBounds(50, 56, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setBounds(10, 113, 48, 14);
		contentPane.add(lblImc);
		
		textField_2 = new JTextField();
		textField_2.setBounds(50, 110, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnImc = new JButton("IMC");
		btnImc.setIcon(new ImageIcon(CalculoImc.class.getResource("/fotos/imc.png")));
		btnImc.setBounds(10, 167, 157, 83);
		contentPane.add(btnImc);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpar.setIcon(new ImageIcon(CalculoImc.class.getResource("/fotos/limpar.png")));
		btnLimpar.setBounds(189, 167, 157, 83);
		contentPane.add(btnLimpar);
	}
}
