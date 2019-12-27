package interfazGrafica;

import estructuras.*;
import estructuras.Carta.Pinta;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 100, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Carta22 = new JLabel("");
		Carta22.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta22.setHorizontalAlignment(SwingConstants.CENTER);
		Carta22.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta22.setBackground(Color.RED);
		Carta22.setBounds(139, 256, 60, 80);
		contentPane.add(Carta22);
		
		JLabel Carta24 = new JLabel("");
		Carta24.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta24.setHorizontalAlignment(SwingConstants.CENTER);
		Carta24.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta24.setBackground(Color.RED);
		Carta24.setBounds(293, 256, 60, 80);
		contentPane.add(Carta24);
		
		JLabel Carta26 = new JLabel("");
		Carta26.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta26.setHorizontalAlignment(SwingConstants.CENTER);
		Carta26.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta26.setBackground(Color.RED);
		Carta26.setBounds(460, 256, 60, 80);
		contentPane.add(Carta26);
		
		JLabel Carta28 = new JLabel("");
		Carta28.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta28.setHorizontalAlignment(SwingConstants.CENTER);
		Carta28.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta28.setBackground(Color.RED);
		Carta28.setBounds(619, 256, 60, 80);
		contentPane.add(Carta28);
		
		JLabel Carta23 = new JLabel("");
		Carta23.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta23.setHorizontalAlignment(SwingConstants.CENTER);
		Carta23.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta23.setBackground(Color.RED);
		Carta23.setBounds(214, 256, 60, 80);
		contentPane.add(Carta23);
		
		JLabel Carta25 = new JLabel("");
		Carta25.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta25.setHorizontalAlignment(SwingConstants.CENTER);
		Carta25.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta25.setBackground(Color.RED);
		Carta25.setBounds(378, 256, 60, 80);
		contentPane.add(Carta25);
		
		JLabel Carta27 = new JLabel("");
		Carta27.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta27.setHorizontalAlignment(SwingConstants.CENTER);
		Carta27.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta27.setBackground(Color.RED);
		Carta27.setBounds(541, 256, 60, 80);
		contentPane.add(Carta27);
		
		JLabel Carta17 = new JLabel("");
		Carta17.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092634.jpg"));
		Carta17.setHorizontalAlignment(SwingConstants.CENTER);
		Carta17.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta17.setBackground(Color.RED);
		Carta17.setBounds(257, 225, 60, 80);
		contentPane.add(Carta17);
		
		JLabel Carta18 = new JLabel("");
		Carta18.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092634.jpg"));
		Carta18.setHorizontalAlignment(SwingConstants.CENTER);
		Carta18.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta18.setBackground(Color.RED);
		Carta18.setBounds(336, 225, 60, 80);
		contentPane.add(Carta18);
		
		JLabel Carta21 = new JLabel("");
		Carta21.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092634.jpg"));
		Carta21.setHorizontalAlignment(SwingConstants.CENTER);
		Carta21.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta21.setBackground(Color.RED);
		Carta21.setBounds(582, 225, 60, 80);
		contentPane.add(Carta21);
		
		JLabel Carta20 = new JLabel("");
		Carta20.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092634.jpg"));
		Carta20.setHorizontalAlignment(SwingConstants.CENTER);
		Carta20.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta20.setBackground(Color.RED);
		Carta20.setBounds(501, 225, 60, 80);
		contentPane.add(Carta20);
		
		JLabel Carta19 = new JLabel("");
		Carta19.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092634.jpg"));
		Carta19.setHorizontalAlignment(SwingConstants.CENTER);
		Carta19.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta19.setBackground(Color.RED);
		Carta19.setBounds(419, 225, 60, 80);
		contentPane.add(Carta19);
		
		JLabel Carta16 = new JLabel("");
		Carta16.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092634.jpg"));
		Carta16.setHorizontalAlignment(SwingConstants.CENTER);
		Carta16.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta16.setBackground(Color.RED);
		Carta16.setBounds(175, 225, 60, 80);
		contentPane.add(Carta16);
		
		JLabel Carta12 = new JLabel("");
		Carta12.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta12.setHorizontalAlignment(SwingConstants.CENTER);
		Carta12.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta12.setBackground(Color.RED);
		Carta12.setBounds(293, 186, 60, 80);
		contentPane.add(Carta12);
		
		JLabel Carta15 = new JLabel("");
		Carta15.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta15.setHorizontalAlignment(SwingConstants.CENTER);
		Carta15.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta15.setBackground(Color.RED);
		Carta15.setBounds(541, 186, 60, 80);
		contentPane.add(Carta15);
		
		JLabel Carta11 = new JLabel("");
		Carta11.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta11.setHorizontalAlignment(SwingConstants.CENTER);
		Carta11.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta11.setBackground(Color.RED);
		Carta11.setBounds(214, 186, 60, 80);
		contentPane.add(Carta11);
		
		JLabel Carta13 = new JLabel("");
		Carta13.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta13.setHorizontalAlignment(SwingConstants.CENTER);
		Carta13.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta13.setBackground(Color.RED);
		Carta13.setBounds(378, 186, 60, 80);
		contentPane.add(Carta13);
		
		JLabel Carta14 = new JLabel("");
		Carta14.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta14.setHorizontalAlignment(SwingConstants.CENTER);
		Carta14.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta14.setBackground(Color.RED);
		Carta14.setBounds(460, 186, 60, 80);
		contentPane.add(Carta14);
		
		JLabel Carta8 = new JLabel("");
		Carta8.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092634.jpg"));
		Carta8.setHorizontalAlignment(SwingConstants.CENTER);
		Carta8.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta8.setBackground(Color.RED);
		Carta8.setBounds(336, 149, 60, 80);
		contentPane.add(Carta8);
		
		JLabel Carta10 = new JLabel("");
		Carta10.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092634.jpg"));
		Carta10.setHorizontalAlignment(SwingConstants.CENTER);
		Carta10.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta10.setBackground(Color.RED);
		Carta10.setBounds(501, 149, 60, 80);
		contentPane.add(Carta10);
		
		JLabel Carta9 = new JLabel("");
		Carta9.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092634.jpg"));
		Carta9.setHorizontalAlignment(SwingConstants.CENTER);
		Carta9.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta9.setBackground(Color.RED);
		Carta9.setBounds(419, 149, 60, 80);
		contentPane.add(Carta9);
		
		JLabel Carta7 = new JLabel("");
		Carta7.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092634.jpg"));
		Carta7.setHorizontalAlignment(SwingConstants.CENTER);
		Carta7.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta7.setBackground(Color.RED);
		Carta7.setBounds(257, 149, 60, 80);
		contentPane.add(Carta7);
		
		JLabel Carta5 = new JLabel("");
		Carta5.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta5.setHorizontalAlignment(SwingConstants.CENTER);
		Carta5.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta5.setBackground(Color.RED);
		Carta5.setBounds(378, 112, 60, 80);
		contentPane.add(Carta5);
		
		JLabel Carta4 = new JLabel("");
		Carta4.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta4.setHorizontalAlignment(SwingConstants.CENTER);
		Carta4.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta4.setBackground(Color.RED);
		Carta4.setBounds(293, 112, 60, 80);
		contentPane.add(Carta4);
		
		JLabel Carta6 = new JLabel("");
		Carta6.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta6.setHorizontalAlignment(SwingConstants.CENTER);
		Carta6.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta6.setBackground(Color.RED);
		Carta6.setBounds(460, 112, 60, 80);
		contentPane.add(Carta6);
		
		JLabel Carta3 = new JLabel("");
		Carta3.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092634.jpg"));
		Carta3.setHorizontalAlignment(SwingConstants.CENTER);
		Carta3.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta3.setBackground(Color.RED);
		Carta3.setBounds(419, 75, 60, 80);
		contentPane.add(Carta3);
		
		JLabel Carta2 = new JLabel("");
		Carta2.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092634.jpg"));
		Carta2.setHorizontalAlignment(SwingConstants.CENTER);
		Carta2.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta2.setBackground(Color.RED);
		Carta2.setBounds(336, 75, 60, 80);
		contentPane.add(Carta2);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setBounds(31, 24, 157, 40);
		contentPane.add(lblScore);
		
		JLabel lblTiempo = new JLabel("Tiempo");
		lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiempo.setBounds(189, 24, 148, 40);
		contentPane.add(lblTiempo);
		
		JLabel Carta1 = new JLabel("");
		Carta1.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\20190729_092544.jpg"));
		Carta1.setFont(new Font("Algerian", Font.PLAIN, 11));
		Carta1.setBackground(Color.RED);
		Carta1.setHorizontalAlignment(SwingConstants.CENTER);
		Carta1.setBounds(378, 37, 60, 80);
		contentPane.add(Carta1);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\0f3f276acd6cb1049e32afb5d61f245b74a00d7e_hq.jpg"));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Algerian", Font.PLAIN, 11));
		label_7.setBackground(Color.RED);
		label_7.setBounds(336, 375, 60, 80);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("D:\\Documentos\\Carlos E\\SD\\Download\\3cf7e3bb93d79eb28a7c8f339a8614c590b68950_hq.jpg"));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Algerian", Font.PLAIN, 11));
		label_8.setBackground(Color.RED);
		label_8.setBounds(419, 375, 60, 80);
		contentPane.add(label_8);
		
		JButton btnDraw = new JButton("Draw");
		btnDraw.setBounds(336, 476, 148, 23);
		contentPane.add(btnDraw);
		
		JButton btnNewGame = new JButton("New game");
		btnNewGame.setBounds(31, 574, 212, 76);
		contentPane.add(btnNewGame);
		
		JButton btnNoC = new JButton("No c");
		btnNoC.setBounds(293, 574, 206, 76);
		contentPane.add(btnNoC);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(553, 573, 221, 77);
		contentPane.add(btnSalir);
		
		JLabel lblHighScore = new JLabel("High Score");
		lblHighScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighScore.setBounds(574, 24, 157, 47);
		contentPane.add(lblHighScore);
	}
}
