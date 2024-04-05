package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaAdmin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5922343309782919023L;

	private JLabel mainImage;
	private JButton adminNodosBtn, adminAristasBtn, acpViajesBtn, verMapaBtn, tutoBtn;

	public VentanaAdmin() {
		// TODO Auto-generated constructor stub
		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Admin");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		adminNodosBtn = new JButton();
		adminNodosBtn.setBounds(173, 90, 459, 93);
		adminNodosBtn.setToolTipText("Oprima este boton para administrar los nodos");
		adminNodosBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(adminNodosBtn);

		adminAristasBtn = new JButton();
		adminAristasBtn.setBounds(173, 190, 459, 93);
		adminAristasBtn.setToolTipText("Oprima este boton para administrar las aristas");
		adminAristasBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(adminAristasBtn);

		acpViajesBtn = new JButton();
		acpViajesBtn.setBounds(173, 290, 459, 93);
		acpViajesBtn.setToolTipText("Oprima este boton para ver los viajes");
		acpViajesBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(acpViajesBtn);

		verMapaBtn = new JButton();
		verMapaBtn.setBounds(173, 390, 459, 93);
		verMapaBtn.setToolTipText("Oprima este boton para ver el mapa");
		verMapaBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(verMapaBtn);

		tutoBtn = new JButton();
		tutoBtn.setBounds(173, 490, 459, 93);
		tutoBtn.setToolTipText("Oprima este boton para ver un tutorial");
		tutoBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(tutoBtn);

		// Imagen
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/imgs/admin.png").getImage();

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

	public JButton getAdminNodosBtn() {
		return adminNodosBtn;
	}

	public void setAdminNodosBtn(JButton adminNodosBtn) {
		this.adminNodosBtn = adminNodosBtn;
	}

	public JButton getAdminAristasBtn() {
		return adminAristasBtn;
	}

	public void setAdminAristasBtn(JButton adminAristasBtn) {
		this.adminAristasBtn = adminAristasBtn;
	}

	public JButton getAcpViajesBtn() {
		return acpViajesBtn;
	}

	public void setAcpViajesBtn(JButton acpViajesBtn) {
		this.acpViajesBtn = acpViajesBtn;
	}

	public JButton getVerMapaBtn() {
		return verMapaBtn;
	}

	public void setVerMapaBtn(JButton verMapaBtn) {
		this.verMapaBtn = verMapaBtn;
	}

	public JButton getTutoBtn() {
		return tutoBtn;
	}

	public void setTutoBtn(JButton tutoBtn) {
		this.tutoBtn = tutoBtn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
