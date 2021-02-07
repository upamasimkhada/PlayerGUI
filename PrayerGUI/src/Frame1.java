import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setBounds(100, 100, 659, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton user = new JButton("Add a Rate Payer");
		user.setFont(new Font("Tahoma", Font.PLAIN, 16));
		user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Rate nw = new Rate();
				nw.NewScreen();
			}
		});
		user.setBackground(new Color(255, 204, 153));
		user.setBounds(225, 101, 179, 40);
		frame.getContentPane().add(user);
		
		JTextPane txtpnCouncilRatePayer = new JTextPane();
		txtpnCouncilRatePayer.setEditable(false);
		txtpnCouncilRatePayer.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtpnCouncilRatePayer.setText("Council Rate Payer System");
		txtpnCouncilRatePayer.setBounds(170, 28, 304, 40);
		frame.getContentPane().add(txtpnCouncilRatePayer);
		
		JButton btnNewButton = new JButton("Add a Property");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Property nw1 = new Property();
				nw1.NewScreen1();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(255, 204, 153));
		btnNewButton.setBounds(225, 163, 179, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton calculate = new JButton("Calculate a Property Type");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Calculate nw2 = new Calculate();
				nw2.NewScreen2();
			}
		});
		calculate.setBackground(new Color(255, 204, 153));
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		calculate.setBounds(203, 229, 223, 40);
		frame.getContentPane().add(calculate);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExit.setBackground(new Color(204, 0, 51));
		btnExit.setBounds(225, 311, 179, 40);
		frame.getContentPane().add(btnExit);
	}
}
