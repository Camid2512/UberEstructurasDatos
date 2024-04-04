package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

public class StopsNumber extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 757006977718450794L;
	private JLabel mainImage;
	private JSpinner numStops;
	private SpinnerNumberModel n1;
	private JButton continueBtn, backBtn;
	
	public StopsNumber() {
		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Ingrese el numero de paradas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		continueBtn = new JButton();
		continueBtn.setBounds(487, 394, 306, 62);
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
		
		n1 = new SpinnerNumberModel();
		n1.setMinimum(1);
		n1.setMaximum(4);
		
		numStops = new JSpinner();
		numStops.setBounds(284, 300, 715, 73);
		numStops.setModel(n1);
		numStops.setValue(1);
		numStops.setEditor(new JSpinner.DefaultEditor(numStops));
		numStops.setBorder(new EmptyBorder(20, 10, 20, 20));
		numStops.setFont(new Font("Arial", 1, 25));
		numStops.setForeground(new Color(188, 186, 190));
		numStops.setBackground(new Color(188, 186, 190));
		numStops.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(numStops);
		
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);
		Image temporal1;
		temporal1 = new ImageIcon("src/Images/numparadas.png").getImage();

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

	public JSpinner getNumStops() {
		return numStops;
	}

	public void setNumStops(JSpinner numStops) {
		this.numStops = numStops;
	}

	public SpinnerNumberModel getN1() {
		return n1;
	}

	public void setN1(SpinnerNumberModel n1) {
		this.n1 = n1;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
