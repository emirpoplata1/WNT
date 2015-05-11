import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Kreiranje_pravila {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kreiranje_pravila window = new Kreiranje_pravila();
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
	public Kreiranje_pravila() {
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
		
		TextArea textArea = new TextArea();
		textArea.setBounds(21, 48, 380, 160);
		frame.getContentPane().add(textArea);
		
		Label label = new Label("Zahtjev za kreiranje pravila:");
		label.setBounds(21, 20, 163, 22);
		frame.getContentPane().add(label);
		
		Button button = new Button("Posalji zahtjev za pravilom");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(31, 215, 138, 22);
		frame.getContentPane().add(button);
	}
}
