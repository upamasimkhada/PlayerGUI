import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class service {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void service1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					service window = new service();
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
	public service() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setBounds(100, 100, 748, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1st Service Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 10, 137, 54);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(167, 20, 137, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAddServiceRate = new JLabel("1st Service Rate");
		lblAddServiceRate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddServiceRate.setBounds(374, 9, 137, 56);
		frame.getContentPane().add(lblAddServiceRate);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(541, 20, 137, 40);
		frame.getContentPane().add(textField_1);
		
		JLabel lblndServiceName = new JLabel("2nd Service Name");
		lblndServiceName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblndServiceName.setBounds(20, 74, 137, 54);
		frame.getContentPane().add(lblndServiceName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(167, 84, 137, 40);
		frame.getContentPane().add(textField_2);
		
		JLabel lblndServiceRate = new JLabel("2nd Service Rate");
		lblndServiceRate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblndServiceRate.setBounds(374, 72, 137, 56);
		frame.getContentPane().add(lblndServiceRate);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(541, 84, 137, 40);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("3rd Service Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(20, 138, 137, 54);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(167, 152, 137, 40);
		frame.getContentPane().add(textField_4);
		
		JLabel lblAddServiceRate_1_1 = new JLabel("3rd Service Rate");
		lblAddServiceRate_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddServiceRate_1_1.setBounds(374, 136, 137, 56);
		frame.getContentPane().add(lblAddServiceRate_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(541, 152, 137, 40);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("4th Service Name");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(20, 202, 137, 54);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(167, 212, 137, 40);
		frame.getContentPane().add(textField_6);
		
		JLabel lblAddServiceRate_1_1_1 = new JLabel("4th Service Rate");
		lblAddServiceRate_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddServiceRate_1_1_1.setBounds(374, 200, 137, 56);
		frame.getContentPane().add(lblAddServiceRate_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(541, 212, 137, 40);
		frame.getContentPane().add(textField_7);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("5th Service Name");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(20, 266, 137, 54);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(167, 280, 137, 40);
		frame.getContentPane().add(textField_8);
		
		JLabel lblAddServiceRate_1_1_1_1 = new JLabel("5th Service Rate");
		lblAddServiceRate_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddServiceRate_1_1_1_1.setBounds(374, 266, 137, 56);
		frame.getContentPane().add(lblAddServiceRate_1_1_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(541, 280, 137, 40);
		frame.getContentPane().add(textField_9);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "New Property is Added: ");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(255, 204, 153));
		btnNewButton.setBounds(272, 361, 124, 40);
		frame.getContentPane().add(btnNewButton);
	}
}
