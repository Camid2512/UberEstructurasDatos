package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaAristas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 354705673705955308L;

	private JLabel mainImage;
	private JButton connectBtn, desconectBtn;

	public VentanaAristas() {
		// TODO Auto-generated constructor stub
		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Aristas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		connectBtn = new JButton();
		connectBtn.setBounds(460, 350, 369, 95);
		connectBtn.setToolTipText("Oprima este boton para conectar las aristas");
		connectBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(connectBtn);

		desconectBtn = new JButton();
		desconectBtn.setBounds(460, 470, 369, 95);
		desconectBtn.setToolTipText("Oprima este boton para desconectar las aristas");
		desconectBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(desconectBtn);

		// Imagen
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/imgs/aristas.png").getImage();

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

	public JButton getConnectBtn() {
		return connectBtn;
	}

	public void setConnectBtn(JButton connectBtn) {
		this.connectBtn = connectBtn;
	}

	public JButton getDesconectBtn() {
		return desconectBtn;
	}

	public void setDesconectBtn(JButton desconectBtn) {
		this.desconectBtn = desconectBtn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
