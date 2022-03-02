package examen1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Examen1botones extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8575812902849471495L;
	private JPanel contentPane;
	private JTextField numero;
	private JButton primo;
	private JButton boton;
	private JLabel texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1botones frame = new Examen1botones();
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
	public Examen1botones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		numero = new JTextField();
		numero.setHorizontalAlignment(SwingConstants.RIGHT);
		numero.setText("0");
		numero.setBounds(0, 0, 434, 29);
		contentPane.add(numero);
		numero.setColumns(10);

		primo = new JButton("Esprimo");
		primo.setBounds(0, 30, 434, 99);
		contentPane.add(primo);
		primo.addActionListener(this);

		boton = new JButton("par o impar");
		boton.setBounds(0, 128, 434, 105);
		contentPane.add(boton);
		boton.addActionListener(this);

		texto = new JLabel("listo");
		texto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		texto.setBounds(10, 236, 424, 25);
		contentPane.add(texto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		double n;
		Object o = e.getSource();

		n = Integer.parseInt(numero.getText());

		if (o == primo) {

			int r = 0, p;

			boolean esprimo;

			esprimo = true;
			p = 2;
			if (p < n) {
				r = (int) (n % p);
				if (r == 0) {
					esprimo = false;

				}

				p = p + 1;

				if (esprimo == true) {

					texto.setText("es primo");
				} else if (esprimo == false) {
					texto.setText("no es primo");
				}
			}
		}

			if (o == boton) {

				if (n % 2 == 0) {

					texto.setText("es par");
				}

				else {

					texto.setText("es impar");
				}

			}

		}

	}

