package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3179264569971090143L;

	private JLabel mainImage;
	private JButton travelsBtn, videoBtn, backBtn;
	
	public Welcome() {
		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Bienvenido a Uber");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		travelsBtn = new JButton();
		travelsBtn.setBounds(367, 323, 549, 74);
		travelsBtn.setToolTipText("Oprime este boton para empezar un viaje");
		travelsBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(travelsBtn);

		// Boton Militar
		videoBtn = new JButton();
		videoBtn.setBounds(367, 420, 550, 74);
		videoBtn.setToolTipText("Oprime este boton para ver un video tutorial");
//		signUpBtn.setBackground(new Color(0, 0, 0, 0));
//		signUpBtn.setOpaque(false);
//		signUpBtn.setContentAreaFilled(false);
//		signUpBtn.setBorderPainted(false);
		add(videoBtn);
		
		backBtn = new JButton();
		backBtn.setBounds(17, 627, 137, 83);
		backBtn.setToolTipText("Oprime este boton para volver a la sección anterior");
//		signUpBtn.setBackground(new Color(0, 0, 0, 0));
//		signUpBtn.setOpaque(false);
//		signUpBtn.setContentAreaFilled(false);
//		signUpBtn.setBorderPainted(false);
		add(backBtn);
		
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/bienvenido.png").getImage();

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

	public JButton getTravelsBtn() {
		return travelsBtn;
	}

	public void setTravelsBtn(JButton travelsBtn) {
		this.travelsBtn = travelsBtn;
	}

	public JButton getVideoBtn() {
		return videoBtn;
	}

	public void setVideoBtn(JButton videoBtn) {
		this.videoBtn = videoBtn;
	}

	public JButton getBackBtn() {
		return backBtn;
	}

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
