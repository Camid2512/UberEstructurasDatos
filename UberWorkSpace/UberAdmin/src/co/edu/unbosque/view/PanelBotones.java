package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {

	private JButton btn;

	public PanelBotones() {
		// TODO Auto-generated constructor stub
		btn = new JButton("");
		btn.setActionCommand("INGRESAR");
		ImageIcon temporal1 = new ImageIcon("src/imgs/botonIngresar.png");
		Image imtemporal1 = temporal1.getImage();
		int anchoD = 172;
		int altoD = 60;
		Image imagenRed = imtemporal1.getScaledInstance(anchoD, altoD, Image.SCALE_SMOOTH);
		btn.setIcon(new ImageIcon(imagenRed));
		btn.setPreferredSize(new Dimension(172, 60));
		add(btn);

	}

	public JButton getBtn() {
		return btn;
	}

	public void setBtn(JButton btn) {
		this.btn = btn;
	}

}
