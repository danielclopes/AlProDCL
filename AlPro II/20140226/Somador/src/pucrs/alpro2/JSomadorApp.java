package pucrs.alpro2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class JSomadorApp extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtSoma;
	private final Action actionCalcular = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSomadorApp frame = new JSomadorApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JSomadorApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtA = new JTextField();
		txtA.setBounds(117, 12, 114, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(117, 43, 114, 19);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnSoma = new JButton("Soma");
		btnSoma.setAction(actionCalcular);
		btnSoma.setBounds(32, 74, 117, 25);
		contentPane.add(btnSoma);
		
		txtSoma = new JTextField();
		txtSoma.setBounds(117, 132, 114, 19);
		contentPane.add(txtSoma);
		txtSoma.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("A:");
		lblNewLabel.setBounds(22, 14, 70, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("B:");
		lblNewLabel_1.setBounds(22, 45, 70, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(22, 132, 87, 19);
		contentPane.add(lblNewLabel_2);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Calcular");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Somador s = new Somador();
			s.setA(Integer.parseInt(txtA.getText()));
			s.setB(Integer.parseInt(txtB.getText()));
			txtSoma.setText("" + s.getSoma());
		}
	}
}
