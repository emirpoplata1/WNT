import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Pregled_mreze {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pregled_mreze window = new Pregled_mreze();
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
	public Pregled_mreze() {
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
		
		Label label = new Label("Pregled mreze(vremenski)");
		label.setFont(new Font("Dialog", Font.PLAIN, 15));
		label.setBounds(10, 10, 206, 31);
		frame.getContentPane().add(label);
		
		JSlider slider = new JSlider();
		slider.setBounds(177, 15, 247, 26);
		frame.getContentPane().add(slider);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(64, 47, 60, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblPin = new JLabel("PIN:");
		lblPin.setBounds(20, 50, 46, 14);
		frame.getContentPane().add(lblPin);
		
		JButton btnNewButton = new JButton("Provjera pina");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(134, 47, 132, 20);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DAJ PREGLED MREZE");
		btnNewButton_1.setBounds(10, 89, 147, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem mntmOpcije = new JMenuItem("Opcije1");
		menuBar.add(mntmOpcije);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
	}
}
