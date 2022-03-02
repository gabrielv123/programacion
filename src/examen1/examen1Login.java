package examen1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import windowsbuilder.ventana2;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class examen1Login extends JFrame implements ActionListener {

	private JLabel texto;
	private JLabel texto2;
	private JLabel listo;
	private JTextField fusuario;
	private JPanel contentPane;

	private JPasswordField passwordField;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1034830052301602435L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examen1Login frame = new examen1Login();
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
	public examen1Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		texto = new JLabel("usuario");
		texto.setBounds(10, 51, 77, 14);
		contentPane.add(texto);

		fusuario = new JTextField();
		fusuario.setBounds(83, 48, 134, 20);
		contentPane.add(fusuario);
		fusuario.setColumns(10);
		fusuario.addActionListener(this);

		texto2 = new JLabel("contrase\u00F1a");
		texto2.setBounds(227, 51, 63, 14);
		contentPane.add(texto2);

		passwordField = new JPasswordField();
		passwordField.setBounds(300, 48, 110, 17);
		contentPane.add(passwordField);
		passwordField.addActionListener(this);

		listo = new JLabel("listo");
		listo.setHorizontalAlignment(SwingConstants.CENTER);
		listo.setBounds(50, 101, 339, 14);
		contentPane.add(listo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object o = e.getSource();

		String contraseña = passwordField.getText();
		String usuario = fusuario.getText();

		if (o == passwordField || o == fusuario) {

			if (usuario.equals("gabriel") && contraseña.equals("vargas")) {

				Examen1botones vh = new Examen1botones();

				vh.setTitle("Bienvenido " + fusuario.getText());

				vh.setVisible(true);

				this.dispose();

			}

			else {

				
				while(!usuario.equals("gabriel") && !contraseña.equals("vargas")) {
					
					int x = 3;
					x--;
					
				

					listo.setText("error. los datos no son correctos. le quedan" + x + " intentos");

				
					if (x<0) {
						
						System.exit(0);
						
					}
						
						

				}
			}

		}
	}
}
