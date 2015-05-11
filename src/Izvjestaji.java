import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import java.awt.Panel;
import java.awt.Canvas;
import java.awt.Label;
import java.awt.Choice;
import java.awt.TextField;
import java.awt.Font;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.Checkbox;
import javax.swing.JButton;


public class Izvjestaji {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Izvjestaji window = new Izvjestaji();
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
	public Izvjestaji() {
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
		
		Label label = new Label("Parametar1");
		label.setBounds(10, 84, 62, 22);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Parametar2");
		label_1.setBounds(10, 112, 62, 22);
		frame.getContentPane().add(label_1);
		
		Label label_2 = new Label("Parametar3");
		label_2.setBounds(10, 140, 62, 22);
		frame.getContentPane().add(label_2);
		
		Label label_3 = new Label("Parametar6");
		label_3.setBounds(10, 190, 62, 22);
		frame.getContentPane().add(label_3);
		
		Label label_4 = new Label("Parametar4");
		label_4.setBounds(10, 162, 62, 22);
		frame.getContentPane().add(label_4);
		
		Choice choice = new Choice();
		choice.setEnabled(false);
		choice.setBounds(10, 58, 90, 20);
		frame.getContentPane().add(choice);
		
		TextField textField = new TextField();
		textField.setBounds(88, 84, 60, 22);
		frame.getContentPane().add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(88, 122, 60, 22);
		frame.getContentPane().add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(86, 162, 62, 22);
		frame.getContentPane().add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(88, 190, 60, 22);
		frame.getContentPane().add(textField_3);
		
		Label label_5 = new Label("Izaberi postojeci izvjestaj");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_5.setBounds(10, 0, 206, 31);
		frame.getContentPane().add(label_5);
		
		Button button = new Button("Zahtjev za novim izvjestajem");
		button.setBounds(236, 10, 167, 22);
		frame.getContentPane().add(button);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(186, 53, 217, 186);
		frame.getContentPane().add(textArea);
		
		Checkbox checkbox = new Checkbox("Parametri izvjestaja");
		checkbox.setEnabled(false);
		checkbox.setBounds(20, 26, 150, 22);
		frame.getContentPane().add(checkbox);
		
		JButton btnNewButton = new JButton("DAJ IZVJESTAJ");
		btnNewButton.setBounds(10, 227, 150, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
