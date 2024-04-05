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

public class OneTraveler extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1610328699245190246L;
	
	private JLabel mainImage;
	private JButton nextBtn, backBtn;
	private JTextField travelerOneName,travelerOneDocument;
	private TextPrompt placeholder;
	private JComboBox<String> parada;
	
public OneTraveler() {
	setSize(1296, 759);
	setResizable(false);
	setLocationRelativeTo(null);
	setTitle("Ingrese los datos del pasajero");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
	
	travelerOneName = new JTextField();
	placeholder = new TextPrompt("Nombre", travelerOneName);
	travelerOneName.setBounds(475, 305, 300, 70);
	travelerOneName.setBackground(new Color(0, 0, 0, 0));
	travelerOneName.setOpaque(false);
	travelerOneName.setBorder(new EmptyBorder(15, 15, 15, 15));
	travelerOneName.setFont(new Font("Arial", 1, 25));
	travelerOneName.setForeground(Color.black);
	add(travelerOneName);
	
	travelerOneDocument = new JTextField();
	placeholder = new TextPrompt("Documento", travelerOneDocument);
	travelerOneDocument.setBounds(475, 380, 300, 70);
	travelerOneDocument.setBackground(new Color(0, 0, 0, 0));
	travelerOneDocument.setOpaque(false);
	travelerOneDocument.setBorder(new EmptyBorder(15, 15, 15, 15));
	travelerOneDocument.setFont(new Font("Arial", 1, 25));
	travelerOneDocument.setForeground(Color.black);
	add(travelerOneDocument);
	
	parada = new JComboBox<>();
	parada.setBounds(472, 466, 333, 46);
	parada.setBackground(new Color(225, 223, 228));
	parada.setForeground(Color.black);
	parada.setFont(new Font("Arial", 1, 25));
	add(parada);
	
	
	backBtn = new JButton();
	backBtn.setBounds(12, 628, 137, 83);
	backBtn.setToolTipText("Oprime este boton para volver a la sección anterior");
//	signUpBtn.setBackground(new Color(0, 0, 0, 0));
//	signUpBtn.setOpaque(false);
//	signUpBtn.setContentAreaFilled(false);
//	signUpBtn.setBorderPainted(false);
	add(backBtn);
	
	nextBtn = new JButton();
	nextBtn.setBounds(1150, 628, 137, 83);
	nextBtn.setToolTipText("Oprime este boton para seguir");
//	signUpBtn.setBackground(new Color(0, 0, 0, 0));
//	signUpBtn.setOpaque(false);
//	signUpBtn.setContentAreaFilled(false);
//	signUpBtn.setBorderPainted(false);
	add(nextBtn);
	
	mainImage = new JLabel();
	mainImage.setBounds(0, 0, 1280, 720);

	Image temporal1;
	temporal1 = new ImageIcon("src/Images/info1persona.png").getImage();

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
