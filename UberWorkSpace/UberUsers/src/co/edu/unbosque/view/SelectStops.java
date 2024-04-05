package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelectStops extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3967974649815278975L;
	private JLabel mainImage;
	private JButton continueBtn, backBtn;
	private JComboBox<String> parada1, parada2;
	
	public SelectStops() {
		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Seleccione sus paradas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		continueBtn = new JButton();
		continueBtn.setBounds(466, 533, 346, 52);
		continueBtn.setToolTipText("Oprime para continuar");
		continueBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(continueBtn);
		
		backBtn = new JButton();
		backBtn.setBounds(17, 627, 137, 83);
		backBtn.setToolTipText("Oprime este boton para volver a la sección anterior");
//		signUpBtn.setBackground(new Color(0, 0, 0, 0));
//		signUpBtn.setOpaque(false);
//		signUpBtn.setContentAreaFilled(false);
//		signUpBtn.setBorderPainted(false);
		add(backBtn);
		
		parada1 = new JComboBox<>();
		parada1.setBounds(115, 347, 429, 68);
		parada1.setBackground(new Color(225, 223, 228));
		parada1.setForeground(Color.black);
		parada1.setFont(new Font("Arial", 1, 25));
		add(parada1);
		
		parada2 = new JComboBox<>();
		parada2.setBounds(755, 347, 429, 68);
		parada2.setBackground(new Color(225, 223, 228));
		parada2.setForeground(Color.black);
		parada2.setFont(new Font("Arial", 1, 25));
		add(parada2);
		
		
		
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);
		Image temporal1;
		temporal1 = new ImageIcon("src/Images/infoparadas.png").getImage();

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

	public JButton getContinueBtn() {
		return continueBtn;
	}

	public void setContinueBtn(JButton continueBtn) {
		this.continueBtn = continueBtn;
	}

	public JButton getBackBtn() {
		return backBtn;
	}

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
	}

	public JComboBox<String> getParada1() {
		return parada1;
	}

	public void setParada1(JComboBox<String> parada1) {
		this.parada1 = parada1;
	}

	public JComboBox<String> getParada2() {
		return parada2;
	}

	public void setParada2(JComboBox<String> parada2) {
		this.parada2 = parada2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
