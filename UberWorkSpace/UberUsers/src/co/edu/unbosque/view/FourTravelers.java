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

public class FourTravelers extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3998657267949849610L;
	private JLabel mainImage;
	private JButton nextBtn, backBtn;
	private JTextField travelerOneName,travelerOneDocument, travelerTwoName,travelerTwoDocument, travelerThreeName,travelerThreeDocument, travelerFourName,travelerFourDocument;
	private TextPrompt placeholder;
	
	public FourTravelers() {
		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Ingrese los datos de los pasajeros");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		travelerOneName = new JTextField();
		placeholder = new TextPrompt("Nombre", travelerOneName);
		travelerOneName.setBounds(250, 140, 300, 70);
		travelerOneName.setBackground(new Color(0, 0, 0, 0));
		travelerOneName.setOpaque(false);
		travelerOneName.setBorder(new EmptyBorder(15, 15, 15, 15));
		travelerOneName.setFont(new Font("Arial", 1, 25));
		travelerOneName.setForeground(Color.black);
		add(travelerOneName);
		
		travelerOneDocument = new JTextField();
		placeholder = new TextPrompt("Documento", travelerOneDocument);
		travelerOneDocument.setBounds(250, 210, 300, 70);
		travelerOneDocument.setBackground(new Color(0, 0, 0, 0));
		travelerOneDocument.setOpaque(false);
		travelerOneDocument.setBorder(new EmptyBorder(15, 15, 15, 15));
		travelerOneDocument.setFont(new Font("Arial", 1, 25));
		travelerOneDocument.setForeground(Color.black);
		add(travelerOneDocument);
		
		travelerTwoName = new JTextField();
		placeholder = new TextPrompt("Nombre", travelerTwoName);
		travelerTwoName.setBounds(875, 140, 300, 70);
		travelerTwoName.setBackground(new Color(0, 0, 0, 0));
		travelerTwoName.setOpaque(false);
		travelerTwoName.setBorder(new EmptyBorder(15, 15, 15, 15));
		travelerTwoName.setFont(new Font("Arial", 1, 25));
		travelerTwoName.setForeground(Color.black);
		add(travelerTwoName);
		
		travelerTwoDocument = new JTextField();
		placeholder = new TextPrompt("Documento", travelerTwoDocument);
		travelerTwoDocument.setBounds(875, 210, 300, 70);
		travelerTwoDocument.setBackground(new Color(0, 0, 0, 0));
		travelerTwoDocument.setOpaque(false);
		travelerTwoDocument.setBorder(new EmptyBorder(15, 15, 15, 15));
		travelerTwoDocument.setFont(new Font("Arial", 1, 25));
		travelerTwoDocument.setForeground(Color.black);
		add(travelerTwoDocument);
		
		travelerThreeName = new JTextField();
		placeholder = new TextPrompt("Nombre", travelerThreeName);
		travelerThreeName.setBounds(250, 430, 300, 70);
		travelerThreeName.setBackground(new Color(0, 0, 0, 0));
		travelerThreeName.setOpaque(false);
		travelerThreeName.setBorder(new EmptyBorder(15, 15, 15, 15));
		travelerThreeName.setFont(new Font("Arial", 1, 25));
		travelerThreeName.setForeground(Color.black);
		add(travelerThreeName);
		
		travelerThreeDocument = new JTextField();
		placeholder = new TextPrompt("Documento", travelerThreeDocument);
		travelerThreeDocument.setBounds(250, 500, 300, 70);
		travelerThreeDocument.setBackground(new Color(0, 0, 0, 0));
		travelerThreeDocument.setOpaque(false);
		travelerThreeDocument.setBorder(new EmptyBorder(15, 15, 15, 15));
		travelerThreeDocument.setFont(new Font("Arial", 1, 25));
		travelerThreeDocument.setForeground(Color.black);
		add(travelerThreeDocument);
		
		travelerFourName = new JTextField();
		placeholder = new TextPrompt("Nombre", travelerFourName);
		travelerFourName.setBounds(875, 430, 300, 70);
		travelerFourName.setBackground(new Color(0, 0, 0, 0));
		travelerFourName.setOpaque(false);
		travelerFourName.setBorder(new EmptyBorder(15, 15, 15, 15));
		travelerFourName.setFont(new Font("Arial", 1, 25));
		travelerFourName.setForeground(Color.black);
		add(travelerFourName);
		
		travelerFourDocument = new JTextField();
		placeholder = new TextPrompt("Documento", travelerFourDocument);
		travelerFourDocument.setBounds(875, 500, 300, 70);
		travelerFourDocument.setBackground(new Color(0, 0, 0, 0));
		travelerFourDocument.setOpaque(false);
		travelerFourDocument.setBorder(new EmptyBorder(15, 15, 15, 15));
		travelerFourDocument.setFont(new Font("Arial", 1, 25));
		travelerFourDocument.setForeground(Color.black);
		add(travelerFourDocument);
		
		
		backBtn = new JButton();
		backBtn.setBounds(12, 628, 137, 83);
		backBtn.setToolTipText("Oprime este boton para volver a la sección anterior");
//		signUpBtn.setBackground(new Color(0, 0, 0, 0));
//		signUpBtn.setOpaque(false);
//		signUpBtn.setContentAreaFilled(false);
//		signUpBtn.setBorderPainted(false);
		add(backBtn);
		
		nextBtn = new JButton();
		nextBtn.setBounds(1150, 628, 137, 83);
		nextBtn.setToolTipText("Oprime este boton para seguir");
//		signUpBtn.setBackground(new Color(0, 0, 0, 0));
//		signUpBtn.setOpaque(false);
//		signUpBtn.setContentAreaFilled(false);
//		signUpBtn.setBorderPainted(false);
		add(nextBtn);
		
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/info4personas.png").getImage();

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

	public JButton getNextBtn() {
		return nextBtn;
	}

	public void setNextBtn(JButton nextBtn) {
		this.nextBtn = nextBtn;
	}

	public JButton getBackBtn() {
		return backBtn;
	}

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
	}

	public JTextField getTravelerOneName() {
		return travelerOneName;
	}

	public void setTravelerOneName(JTextField travelerOneName) {
		this.travelerOneName = travelerOneName;
	}

	public JTextField getTravelerOneDocument() {
		return travelerOneDocument;
	}

	public void setTravelerOneDocument(JTextField travelerOneDocument) {
		this.travelerOneDocument = travelerOneDocument;
	}

	public JTextField getTravelerTwoName() {
		return travelerTwoName;
	}

	public void setTravelerTwoName(JTextField travelerTwoName) {
		this.travelerTwoName = travelerTwoName;
	}

	public JTextField getTravelerTwoDocument() {
		return travelerTwoDocument;
	}

	public void setTravelerTwoDocument(JTextField travelerTwoDocument) {
		this.travelerTwoDocument = travelerTwoDocument;
	}

	public JTextField getTravelerThreeName() {
		return travelerThreeName;
	}

	public void setTravelerThreeName(JTextField travelerThreeName) {
		this.travelerThreeName = travelerThreeName;
	}

	public JTextField getTravelerThreeDocument() {
		return travelerThreeDocument;
	}

	public void setTravelerThreeDocument(JTextField travelerThreeDocument) {
		this.travelerThreeDocument = travelerThreeDocument;
	}

	public JTextField getTravelerFourName() {
		return travelerFourName;
	}

	public void setTravelerFourName(JTextField travelerFourName) {
		this.travelerFourName = travelerFourName;
	}

	public JTextField getTravelerFourDocument() {
		return travelerFourDocument;
	}

	public void setTravelerFourDocument(JTextField travelerFourDocument) {
		this.travelerFourDocument = travelerFourDocument;
	}

	public TextPrompt getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(TextPrompt placeholder) {
		this.placeholder = placeholder;
	}

}
