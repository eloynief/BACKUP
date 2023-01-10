import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class test {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setBounds(84, 55, 89, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblContranea = new JLabel("Contraseña:");
		lblContranea.setBackground(Color.RED);
		lblContranea.setBounds(84, 81, 89, 23);
		frame.getContentPane().add(lblContranea);
		
		JButton btnNewButton = new JButton("GUARDAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(146, 209, 132, 23);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Teléfono");
		rdbtnNewRadioButton.setBounds(197, 140, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnEmail = new JRadioButton("e-mail");
		rdbtnEmail.setBounds(197, 166, 109, 23);
		frame.getContentPane().add(rdbtnEmail);
		
		textField = new JTextField();
		textField.setBounds(197, 56, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 82, 86, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBackground(Color.RED);
		lblIdioma.setBounds(84, 108, 89, 23);
		frame.getContentPane().add(lblIdioma);
		
		JLabel lblNewLabel_1 = new JLabel("NUEVO USUARIO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(108, 11, 178, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Español", "Inglés", "Francés"}));
		comboBox.setBounds(197, 113, 89, 22);
		frame.getContentPane().add(comboBox);
	}
}
