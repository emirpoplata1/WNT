import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import java.awt.TextArea;


public class Login {

	private JFrame frame;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
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
		
		 final TextField user = new TextField();
		user.setBounds(153, 59, 83, 22);
		frame.getContentPane().add(user);
		
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(user.getText().toString()=="tarik")
			{
				Label label = new Label("New label");
				label.setBounds(76, 114, 62, 22);
				frame.getContentPane().add(label);
			}	

			
			
			}
		});
		btnNewButton.setBounds(10, 146, 103, 33);
		frame.getContentPane().add(btnNewButton);
		
		Button button = new Button("POMOC");
		button.setEnabled(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(186, 146, 83, 33);
		frame.getContentPane().add(button);
		
		JLabel lblKorisnickoIme = new JLabel("Korisnicko Ime:");
		lblKorisnickoIme.setBounds(10, 59, 120, 14);
		frame.getContentPane().add(lblKorisnickoIme);
		
		JLabel lblSifra = new JLabel("Sifra:");
		lblSifra.setBounds(10, 107, 120, 14);
		frame.getContentPane().add(lblSifra);
		
		Label label = new Label("Administrator Login");
		label.setFont(new Font("Dialog", Font.PLAIN, 19));
		label.setBounds(10, 10, 206, 31);
		frame.getContentPane().add(label);
		
		pass = new JPasswordField();
	pass.setBounds(154, 104, 82, 20);
	frame.getContentPane().add(pass);
		
	
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opcije");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Opcija_2");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Opcija_1");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmOpcije = new JMenuItem("Opcije2");
		menuBar.add(mntmOpcije);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		
	}
}
