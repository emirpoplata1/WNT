import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;


public class Pocetna {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pocetna window = new Pocetna();
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
	public Pocetna() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 468, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[147px][][grow]", "[23px][23px][23px,grow][1px][][grow]"));
		
		JButton btnNewButton = new JButton("Uposlenik_2");
		frame.getContentPane().add(btnNewButton, "cell 0 1,alignx left,aligny top");
		
		JButton btnUposlenik = new JButton("Uposlenik_1");
		frame.getContentPane().add(btnUposlenik, "cell 0 0,alignx left,aligny top");
		
		JButton btnUposlenik_1 = new JButton("Uposlenik_3");
		frame.getContentPane().add(btnUposlenik_1, "cell 0 2,alignx left,aligny top");
		
		table_2 = new JTable();
		frame.getContentPane().add(table_2, "cell 2 2,grow");
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		frame.getContentPane().add(horizontalStrut, "cell 0 3,grow");
		
		JProgressBar progressBar = new JProgressBar();
		frame.getContentPane().add(progressBar, "cell 0 4");
		
		table = new JTable();
		frame.getContentPane().add(table, "cell 2 4,grow");
		
		JButton btnIzvjestaji = new JButton("Izvjestaji");
		frame.getContentPane().add(btnIzvjestaji, "flowx,cell 0 5");
		
		table_1 = new JTable();
		frame.getContentPane().add(table_1, "cell 2 5,grow");
		
		JButton btnNewButton_1 = new JButton("Pregled prometa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnNewButton_1, "cell 0 5");
		
		Button button = new Button("Kreiranje pravila");
		frame.getContentPane().add(button, "cell 0 5");
		
		
	}
}
