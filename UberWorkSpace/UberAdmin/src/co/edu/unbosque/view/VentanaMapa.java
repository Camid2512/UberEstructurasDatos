package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaMapa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8240545399077580456L;

	private JLabel mainImage;

	public VentanaMapa() {
		// TODO Auto-generated constructor stub
		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Mapa");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/imgs/mapa.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
