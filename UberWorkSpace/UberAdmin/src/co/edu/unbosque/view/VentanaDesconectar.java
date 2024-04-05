package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaDesconectar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6958348068230236984L;

	private JLabel mainImage;
	private JComboBox<String> nodoA;
	private JComboBox<String> nodoB;
	private JButton desconectBtn;

	public VentanaDesconectar() {
		// TODO Auto-generated constructor stub
		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Desconectar Aristas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);

		nodoA = new JComboBox<String>();
		nodoA.setToolTipText("Seleccione un nodo");
		nodoA.setName("Seleccione el primer nodo a desconectar");
		nodoA.setForeground(Color.black);
		nodoA.setBackground(Color.white);
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(new JLabel("Primer Nodo= "), gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(nodoA, gbc);

		nodoB = new JComboBox<String>();
		nodoB.setToolTipText("Seleccione un nodo");
		nodoB.setName("Seleccione el segundo nodo a desconectar");
		nodoB.setForeground(Color.black);
		nodoB.setBackground(Color.white);
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(new JLabel("Segundo Nodo= "), gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(nodoB, gbc);

		desconectBtn = new JButton();
		desconectBtn.setBounds(550, 500, 218, 40);
		desconectBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(desconectBtn);

		// Imagen
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/imgs/desconectar.png").getImage();

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

	public JComboBox<String> getNodoA() {
		return nodoA;
	}

	public void setNodoA(JComboBox<String> nodoA) {
		this.nodoA = nodoA;
	}

	public JComboBox<String> getNodoB() {
		return nodoB;
	}

	public void setNodoB(JComboBox<String> nodoB) {
		this.nodoB = nodoB;
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
