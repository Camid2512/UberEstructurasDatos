package co.edu.unbosque.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelImagenes extends JPanel {

	private BufferedImage imagen1;

	public PanelImagenes() {
		// TODO Auto-generated constructor stub
		try {
			imagen1 = ImageIO.read(new File("src/imgs/principal.png"));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int panelWidth = getWidth();
		int panelHeight = getHeight();

		Image imagenRedimension = imagen1.getScaledInstance(1296, 759, Image.SCALE_SMOOTH);

		g.drawImage(imagenRedimension, 0, 0, this);
	}

}
