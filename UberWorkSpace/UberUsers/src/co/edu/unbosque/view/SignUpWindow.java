package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SignUpWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 655976559544102794L;

	private JLabel mainImage;
	private JTextField userTxt, passwordTxt;
	private JButton createAccountBtn, backBtn;
	private TextPrompt placeholder;

	public SignUpWindow() {
		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Cree una cuenta");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		createAccountBtn = new JButton();
		createAccountBtn.setBounds(487, 505, 306, 62);
		createAccountBtn.setToolTipText("Oprime para crear cuenta");
		createAccountBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(createAccountBtn);
		
		userTxt = new JTextField();
		placeholder = new TextPrompt("Usuario", userTxt);
		userTxt.setBounds(376, 220, 729, 70);
		userTxt.setBackground(new Color(0, 0, 0, 0));
		userTxt.setOpaque(false);
		userTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		userTxt.setFont(new Font("Arial", 1, 25));
		userTxt.setForeground(Color.black);
		add(userTxt);
		
		backBtn = new JButton();
		backBtn.setBounds(17, 627, 137, 83);
		backBtn.setToolTipText("Oprime este boton para volver a la sección anterior");
//		signUpBtn.setBackground(new Color(0, 0, 0, 0));
//		signUpBtn.setOpaque(false);
//		signUpBtn.setContentAreaFilled(false);
//		signUpBtn.setBorderPainted(false);
		add(backBtn);

		passwordTxt = new JTextField();
		placeholder = new TextPrompt("Contraseña", passwordTxt);
		passwordTxt.setBounds(376, 407, 729, 70);
		passwordTxt.setBackground(new Color(0, 0, 0, 0));
		passwordTxt.setOpaque(false);
		passwordTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		passwordTxt.setFont(new Font("Arial", 1, 25));
		passwordTxt.setForeground(Color.black);
		add(passwordTxt);
		
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);
		Image temporal1;
		temporal1 = new ImageIcon("src/Images/registrarse.png").getImage();

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

	public JButton getCreateAccountBtn() {
		return createAccountBtn;
	}

	public void setCreateAccountBtn(JButton createAccountBtn) {
		this.createAccountBtn = createAccountBtn;
	}

	public TextPrompt getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(TextPrompt placeholder) {
		this.placeholder = placeholder;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getBackBtn() {
		return backBtn;
	}

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
	}
	
	

}
