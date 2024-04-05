package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TwoTravelers extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7465582832052548928L;
	
	private JLabel mainImage;
	private JButton nextBtn, backBtn;
	private JTextField travelerOneName,travelerOneDocument, travelerTwoName,travelerTwoDocument;
	private TextPrompt placeholder;
	private JComboBox<String> parada1, parada2;
	
	public TwoTravelers() {
		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Ingrese los datos de los pasajeros");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		travelerOneName = new JTextField();
		placeholder = new TextPrompt("Nombre", travelerOneName);
		travelerOneName.setBounds(230, 270, 300, 70);
		travelerOneName.setBackground(new Color(0, 0, 0, 0));
		travelerOneName.setOpaque(false);
		travelerOneName.setBorder(new EmptyBorder(15, 15, 15, 15));
		travelerOneName.setFont(new Font("Arial", 1, 25));
		travelerOneName.setForeground(Color.black);
		add(travelerOneName);
		
		travelerOneDocument = new JTextField();
		placeholder = new TextPrompt("Documento", travelerOneDocument);
		travelerOneDocument.setBounds(230, 337, 300, 70);
		travelerOneDocument.setBackground(new Color(0, 0, 0, 0));
		travelerOneDocument.setOpaque(false);
		travelerOneDocument.setBorder(new EmptyBorder(15, 15, 15, 15));
		travelerOneDocument.setFont(new Font("Arial", 1, 25));
		travelerOneDocument.setForeground(Color.black);
		add(travelerOneDocument);
		
		travelerTwoName = new JTextField();
		placeholder = new TextPrompt("Nombre", travelerTwoName);
		travelerTwoName.setBounds(750, 270, 300, 70);
		travelerTwoName.setBackground(new Color(0, 0, 0, 0));
		travelerTwoName.setOpaque(false);
		travelerTwoName.setBorder(new EmptyBorder(15, 15, 15, 15));
		travelerTwoName.setFont(new Font("Arial", 1, 25));
		travelerTwoName.setForeground(Color.black);
		add(travelerTwoName);
		
		travelerTwoDocument = new JTextField();
		placeholder = new TextPrompt("Documento", travelerTwoDocument);
		travelerTwoDocument.setBounds(750, 337, 300, 70);
		travelerTwoDocument.setBackground(new Color(0, 0, 0, 0));
		travelerTwoDocument.setOpaque(false);
		travelerTwoDocument.setBorder(new EmptyBorder(15, 15, 15, 15));
		travelerTwoDocument.setFont(new Font("Arial", 1, 25));
		travelerTwoDocument.setForeground(Color.black);
		add(travelerTwoDocument);
		
		parada1 = new JComboBox<>();
		parada1.setBounds(198, 418, 333, 46);
		parada1.setBackground(new Color(225, 223, 228));
		parada1.setForeground(Color.black);
		parada1.setFont(new Font("Arial", 1, 25));
		add(parada1);
		
		parada2 = new JComboBox<>();
		parada2.setBounds(714, 418, 333, 46);
		parada2.setBackground(new Color(225, 223, 228));
		parada2.setForeground(Color.black);
		parada2.setFont(new Font("Arial", 1, 25));
		add(parada2);
		
		
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
		temporal1 = new ImageIcon("src/Images/info2personas.png").getImage();

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

	public TextPrompt getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(TextPrompt placeholder) {
		this.placeholder = placeholder;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
