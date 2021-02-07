import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Property {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void NewScreen1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Property window = new Property();
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
	public Property() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setBounds(100, 100, 754, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnAddAProperty = new JTextPane();
		txtpnAddAProperty.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtpnAddAProperty.setEditable(false);
		txtpnAddAProperty.setText("Add a Property");
		txtpnAddAProperty.setBounds(281, 26, 172, 37);
		frame.getContentPane().add(txtpnAddAProperty);
		
		JLabel lblNewLabel = new JLabel("Enter Property Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(191, 81, 199, 37);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(191, 128, 337, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterCivRate = new JLabel("Enter CIV Rate: ");
		lblEnterCivRate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterCivRate.setBounds(191, 175, 144, 37);
		frame.getContentPane().add(lblEnterCivRate);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(191, 214, 337, 37);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Add Services");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num;
				
				service sr = new service();
				sr.service1();
				
				
			}
		});
		btnNewButton.setBackground(new Color(255, 204, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(191, 302, 172, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frame1 nw = new Frame1();
				nw.main(null);
			}
		});
		btnBack.setBackground(Color.RED);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(373, 302, 172, 31);
		frame.getContentPane().add(btnBack);
	}

}
