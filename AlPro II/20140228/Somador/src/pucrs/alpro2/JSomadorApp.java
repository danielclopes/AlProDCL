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
import java.awt.event.ActionListener;
import java.awt.Toolkit;

public class JSomadorApp extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtSoma;
	private final Action actionCalcular = new SwingAction();
	private JTextField txtC;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(JSomadorApp.class.getResource("/javax/swing/plaf/metal/icons/ocean/hardDrive.gif")));
		setTitle("Somador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 255);
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
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSoma.setAction(actionCalcular);
		btnSoma.setBounds(32, 120, 117, 25);
		contentPane.add(btnSoma);
		
		txtSoma = new JTextField();
		txtSoma.setBounds(117, 178, 114, 19);
		contentPane.add(txtSoma);
		txtSoma.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("A:");
		lblNewLabel.setBounds(22, 14, 70, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("B:");
		lblNewLabel_1.setBounds(22, 45, 70, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(22, 178, 87, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblC = new JLabel("C:");
		lblC.setBounds(22, 76, 70, 15);
		contentPane.add(lblC);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(117, 74, 114, 19);
		contentPane.add(txtC);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Calcular");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			NovoSomador s = new NovoSomador();
			s.setA(Integer.parseInt(txtA.getText()));
			s.setB(Integer.parseInt(txtB.getText()));
			s.setC(Integer.parseInt(txtC.getText()));
			txtSoma.setText("" + s.getSoma());
		}
	}
}
