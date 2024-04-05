package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	private PanelImagenes p1;
	private PanelBotones p2;

	public MainWindow() {
		// TODO Auto-generated constructor stub
		setSize(1296, 759);
		setTitle("Bienvenidos a admin");
		setResizable(false);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		p1 = new PanelImagenes();
		add(p1, BorderLayout.CENTER); // Agregar p1 al centro del BorderLayout

		p2 = new PanelBotones();
		add(p2, BorderLayout.SOUTH); // Agregar p2 al sur del BorderLayout

		setVisible(true);
	}

	public PanelImagenes getP1() {
		return p1;
	}

	public void setP1(PanelImagenes p1) {
		this.p1 = p1;
	}

	public PanelBotones getP2() {
		return p2;
	}

	public void setP2(PanelBotones p2) {
		this.p2 = p2;
	}
}