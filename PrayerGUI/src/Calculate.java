import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculate {

	private JFrame frame;
	private JTextField textField;
	private JRadioButton True;
	private JRadioButton False;
	private JTextField total;
	
	private JComboBox comboBox;
	private JTextField member;
	private JTextField event;
	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate window = new Calculate();
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
	public Calculate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setBounds(100, 100, 869, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnCalculateAProperty = new JTextPane();
		txtpnCalculateAProperty.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtpnCalculateAProperty.setText("Calculate a Property Type");
		txtpnCalculateAProperty.setBounds(248, 37, 293, 37);
		frame.getContentPane().add(txtpnCalculateAProperty);
		
		comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 204, 153));
		comboBox.addItem("Residental");
		comboBox.addItem("Commercial");
		comboBox.addItem("Vacant Land");
		comboBox.addItem("Hospital");
		comboBox.addItem("Industrial");
		comboBox.addItem("School");
		comboBox.addItem("Community");
		comboBox.addItem("Other");
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setToolTipText("");
		comboBox.setBounds(129, 121, 125, 28);
		frame.getContentPane().add(comboBox);
		String value=(String)comboBox.getSelectedItem();
		
		JLabel lblNewLabel = new JLabel("What is the value of the property?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(192, 169, 280, 28);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(192, 207, 337, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDoesTheRate = new JLabel("Does the rate payer have a charity status?");
		lblDoesTheRate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDoesTheRate.setBounds(349, 84, 342, 28);
		frame.getContentPane().add(lblDoesTheRate);
		
		
		
		False = new JRadioButton("False");
		False.setBackground(new Color(255, 204, 153));
		False.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(False.isSelected()) {
					True.setSelected(false);
				}
			}
		});
		False.setFont(new Font("Tahoma", Font.PLAIN, 16));
		False.setBounds(511, 118, 73, 37);
		frame.getContentPane().add(False);
		
		True = new JRadioButton("True");
		True.setBackground(new Color(255, 204, 153));
		True.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(True.isSelected()) {
					False.setSelected(false);
					
				}
			}
		});
		True.setFont(new Font("Tahoma", Font.PLAIN, 16));
		True.setBounds(374, 118, 73, 37);
		frame.getContentPane().add(True);
		
		total = new JTextField();
		total.setBounds(349, 423, 192, 44);
		frame.getContentPane().add(total);
		total.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String value=(String)comboBox.getSelectedItem();
				float num,ans1,total2,total1,total3,mem,amt,eve,teve;
				num=Integer.parseInt(textField.getText());
				
				if(value=="Residental") {
					if(True.isSelected()) {
						 total1 = num * 0.40f /100;
		                    total2 = num * 0.007f / 100 +110 + 90 + 400 + total1 ;
		                	total3 = total2 * 80f /100;
		                	total.setText(Float.toString(total3));
		                	
					}
					else if(False.isSelected()) {
						total1 = num * 0.40f /100;
	                    total2 = num * 0.007f / 100 +110 + 90 + 400 + total1 ;
	                    total.setText(Float.toString(total2));
					}
					
					
				}
				else if(value=="Commercial") {
					if(True.isSelected()) {
						 total1 = num * 0.60f /100;
		                    total2 = num * 0.007f / 100 +200 + 800 + total1 ;
		                	total3 = total2 * 80f /100;
		                	total.setText(Float.toString(total3));
		                	
					}
					else if(False.isSelected()) {
						total1 = num * 0.60f /100;
	                    total2 = num * 0.007f / 100 +200 + 800 + total1 ;
	                    total.setText(Float.toString(total2));
					}
					
				}
				
				else if(value=="Vacant Land") {
					if(True.isSelected()) {
						 total1 = num * 0.10f /100;
		                    total2 = num * 0.007f / 100 + 50 + total1 ;
		                	total3 = total2 * 80f /100;
		                	total.setText(Float.toString(total3));
		                	
					}
					else if(False.isSelected()) {
						total1 = num * 0.10f /100;
	                    total2 = num * 0.007f / 100 + 50 + total1 ;
	                    total.setText(Float.toString(total2));
					}
					
				}
				
				else if(value=="Hospital") {
					if(True.isSelected()) {
						 total1 = num * 0.36f /100;
		                    total2 = num * 0.007f / 100 + 200 + 2400 + total1 ;
		                	total3 = total2 * 80f /100;
		                	total.setText(Float.toString(total3));
		                	
					}
					else if(False.isSelected()) {
						total1 = num * 0.36f /100;
	                    total2 = num * 0.007f / 100 + 200 + 2400 + total1 ;
	                    total.setText(Float.toString(total2));
					}
					
				}
				
				else if(value=="Industrial") {
				
					if(True.isSelected()) {
						 total1 = num * 0.65f /100;
		                    total2 = num * 0.007f / 100 + 200 + 2400 + total1 ;
		                	total3 = total2 * 80f /100;
		                	total.setText(Float.toString(total3));
		                	
					}
					else if(False.isSelected()) {
						total1 = num * 0.65f /100;
	                    total2 = num * 0.007f / 100 + 200 + 2400 + total1 ;
	                    total.setText(Float.toString(total2));
					}
					
				}
				
				else if(value=="School") {
					mem=Integer.parseInt(member.getText());
					
					if(mem>0 && mem<=50) {
						amt = 60;
						if(True.isSelected()) {
							 total1 = num * 0.30f /100;
			                    total2 = num * 0.007f / 100 + 200 + 1200 + total1 +amt ;
			                	total3 = total2 * 80f /100;
			                	total.setText(Float.toString(total3));
			                	
						}
						else if(False.isSelected()) {
							total1 = num * 0.30f /100;
		                    total2 = num * 0.007f / 100 + 200 + 1200 + total1 +amt;
		                    total.setText(Float.toString(total2));
						}	
					}
					else if(mem>50 && mem<=500){
						amt = 80;
						if(True.isSelected()) {
							 total1 = num * 0.30f /100;
			                    total2 = num * 0.007f / 100 + 200 + 1200 + total1 +amt ;
			                	total3 = total2 * 80f /100;
			                	total.setText(Float.toString(total3));
			                	
						}
						else if(False.isSelected()) {
							total1 = num * 0.30f /100;
		                    total2 = num * 0.007f / 100 + 200 + 1200 + total1 +amt;
		                    total.setText(Float.toString(total2));
						}
						
					}
					else if(mem>500) {
						amt = 100;
						if(True.isSelected()) {
							 total1 = num * 0.30f /100;
			                    total2 = num * 0.007f / 100 + 200 + 1200 + total1 +amt ;
			                	total3 = total2 * 80f /100;
			                	total.setText(Float.toString(total3));
			                	
						}
						else if(False.isSelected()) {
							total1 = num * 0.30f /100;
		                    total2 = num * 0.007f / 100 + 200 + 1200 + total1 +amt;
		                    total.setText(Float.toString(total2));
						}
					}
					
				}
				else if(value=="Community") {
					eve=Integer.parseInt(event.getText());
					teve=eve*200;
					if(True.isSelected()) {
						 total1 = num * 0.25f /100;
		                    total2 = num * 0.007f / 100 +100 + 90 + 400 + total1 +teve ;
		                	total3 = total2 * 80f /100;
		                	total.setText(Float.toString(total3));
		                
		                	
					}
					else if(False.isSelected()) {
						total1 = num * 0.25f /100;
	                    total2 = num * 0.007f / 100 +100 + 90 + 400 + total1 +teve;
	                    total.setText(Float.toString(total2));
					}
				}
				
				else if(value=="Other") {
					if(True.isSelected()) {
						 total1 = num * 0.25f /100;
		                    total2 = num * 0.007f / 100 + 150 + total1;
		                	total3 = total2 * 80f /100;
		                	total.setText(Float.toString(total3));
		                	
					}
					else if(False.isSelected()) {
						total1 = num * 0.25f /100;
	                    total2 = num * 0.007f / 100 + 150 + total1 ;
	                    total.setText(Float.toString(total2));
					}
					
				}
				
			}
		});
		btnNewButton.setBackground(new Color(255, 204, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(313, 343, 133, 44);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Council Rate Payer ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(191, 424, 138, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frame1 nw = new Frame1();
				nw.main(null);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBackground(Color.RED);
		btnBack.setBounds(314, 553, 133, 44);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Members:(Only for school type)");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(395, 267, 280, 37);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		member = new JTextField();
		member.setToolTipText("");
		member.setFont(new Font("Tahoma", Font.PLAIN, 16));
		member.setColumns(10);
		member.setBounds(687, 263, 59, 44);
		frame.getContentPane().add(member);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Enter Events:(Only for community type)");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(10, 267, 293, 37);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		event = new JTextField();
		event.setFont(new Font("Tahoma", Font.PLAIN, 16));
		event.setToolTipText("");
		event.setColumns(10);
		event.setBounds(313, 263, 59, 44);
		frame.getContentPane().add(event);
		
		JLabel lblChoosePropertyType = new JLabel("Choose property type");
		lblChoosePropertyType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblChoosePropertyType.setBounds(105, 84, 183, 28);
		frame.getContentPane().add(lblChoosePropertyType);
		
		
	}
}
