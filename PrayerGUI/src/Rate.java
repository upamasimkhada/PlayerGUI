import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rate {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblEnterPostalAddress;
	private JTextField textField_1;
	private JLabel lblEnterPostal;
	private JTextField textField_2;
	private JLabel lblTelephoneNumber;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rate window = new Rate();
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
	public Rate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setBounds(100, 100, 755, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnAddARate = new JTextPane();
		txtpnAddARate.setEditable(false);
		txtpnAddARate.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtpnAddARate.setText("Add a Rate Payer");
		txtpnAddARate.setBounds(258, 26, 204, 37);
		frame.getContentPane().add(txtpnAddARate);
		
		JLabel lblNewLabel = new JLabel("Enter Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(195, 84, 123, 37);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(195, 126, 310, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblEnterPostalAddress = new JLabel("Enter Postal Address: ");
		lblEnterPostalAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterPostalAddress.setBounds(195, 178, 195, 37);
		frame.getContentPane().add(lblEnterPostalAddress);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(195, 225, 310, 42);
		frame.getContentPane().add(textField_1);
		
		lblEnterPostal = new JLabel("Enter Postal:");
		lblEnterPostal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterPostal.setBounds(195, 277, 123, 37);
		frame.getContentPane().add(lblEnterPostal);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(195, 314, 310, 42);
		frame.getContentPane().add(textField_2);
		
		lblTelephoneNumber = new JLabel("Telephone Number:");
		lblTelephoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelephoneNumber.setBounds(195, 366, 195, 37);
		frame.getContentPane().add(lblTelephoneNumber);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(195, 402, 310, 42);
		frame.getContentPane().add(textField_3);
		
		btnNewButton = new JButton("Added");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=Integer.parseInt(textField.getText());
				JOptionPane.showMessageDialog(btnNewButton, "New Rate Payer is Added: ");
				Frame1 nw = new Frame1();
				nw.main(null);
				
			}
		});
		btnNewButton.setBackground(new Color(255, 204, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(130, 454, 207, 37);
		frame.getContentPane().add(btnNewButton);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame1 nw = new Frame1();
				nw.main(null);
			}
		});
		btnBack.setBackground(Color.RED);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(351, 454, 207, 37);
		frame.getContentPane().add(btnBack);
	}
}
