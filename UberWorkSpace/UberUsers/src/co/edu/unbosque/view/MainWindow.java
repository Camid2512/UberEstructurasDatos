package co.edu.unbosque.view;

/** 
 * Esta es la clase ventana de CRUD civil
 * @author Julian Garcia
 * @version 1.0
 * @since 26/09/2023*/

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainWindow extends JFrame {
	
	private static final long serialVersionUID = 1865397045744303071L;

	
	private JLabel mainImage;
	
	
	private JButton logInBtn, signUpBtn;
	private JTextField userTxt, passwordTxt;
	private TextPrompt placeholder;

	public MainWindow() {

		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Bienvenido a Uber");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		// Boton CIVIL
		logInBtn = new JButton();
		logInBtn.setBounds(345, 462, 278, 60);
		logInBtn.setToolTipText("Este boton nos lleva a ver el CRUD completo del mismo");
		logInBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(logInBtn);

		// Boton Militar
		signUpBtn = new JButton();
		signUpBtn.setBounds(654, 462, 278, 60);
		signUpBtn.setToolTipText("Este boton nos lleva al menu de militar");
//		signUpBtn.setBackground(new Color(0, 0, 0, 0));
//		signUpBtn.setOpaque(false);
//		signUpBtn.setContentAreaFilled(false);
//		signUpBtn.setBorderPainted(false);
		add(signUpBtn);


		userTxt = new JTextField();
		placeholder = new TextPrompt("Usuario", userTxt);
		userTxt.setBounds(276, 248, 729, 70);
		userTxt.setBackground(new Color(0, 0, 0, 0));
		userTxt.setOpaque(false);
		userTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		userTxt.setFont(new Font("Arial", 1, 25));
		userTxt.setForeground(Color.black);
		add(userTxt);

		passwordTxt = new JTextField();
		placeholder = new TextPrompt("Contraseña", passwordTxt);
		passwordTxt.setBounds(276, 342, 729, 70);
		passwordTxt.setBackground(new Color(0, 0, 0, 0));
		passwordTxt.setOpaque(false);
		passwordTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		passwordTxt.setFont(new Font("Arial", 1, 25));
		passwordTxt.setForeground(Color.black);
		add(passwordTxt);
	

		// Imagen
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/1.png").getImage();

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

	public JButton getLogInBtn() {
		return logInBtn;
	}

	public void setLogInBtn(JButton logInBtn) {
		this.logInBtn = logInBtn;
	}

	public JButton getSignUpBtn() {
		return signUpBtn;
	}

	public void setSignUpBtn(JButton signUpBtn) {
		this.signUpBtn = signUpBtn;
	}

	public JTextField getUserTxt() {
		return userTxt;
	}

	public void setUserTxt(JTextField userTxt) {
		this.userTxt = userTxt;
	}

	public JTextField getPasswordTxt() {
		return passwordTxt;
	}

	public void setPasswordTxt(JTextField passwordTxt) {
		this.passwordTxt = passwordTxt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public TextPrompt getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(TextPrompt placeholder) {
		this.placeholder = placeholder;
	}
	

}
