package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaCrud extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5666459739843906235L;

	private JLabel mainImage;
	private JButton crearBtn, eliminarBtn, actNodo, mostrarNodo;

	public VentanaCrud() {
		// TODO Auto-generated constructor stub
		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Crud");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		crearBtn = new JButton();
		crearBtn.setBounds(360, 110, 498, 114);
		crearBtn.setToolTipText("Oprima este boton para agregar algun nodo");
		crearBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(crearBtn);

		eliminarBtn = new JButton();
		eliminarBtn.setBounds(360, 230, 498, 114);
		eliminarBtn.setToolTipText("Oprima este boton para eliminar algun nodo");
		eliminarBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(eliminarBtn);

		actNodo = new JButton();
		actNodo.setBounds(360, 350, 498, 114);
		actNodo.setToolTipText("Oprima este boton para actualizar algun nodo");
		actNodo.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(actNodo);

		mostrarNodo = new JButton();
		mostrarNodo.setBounds(360, 470, 498, 114);
		mostrarNodo.setToolTipText("Oprima este boton para ver los nodos");
		mostrarNodo.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(mostrarNodo);

		// Imagen
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/imgs/crudNodos.png").getImage();

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

	public JButton getCrearBtn() {
		return crearBtn;
	}

	public void setCrearBtn(JButton crearBtn) {
		this.crearBtn = crearBtn;
	}

	public JButton getEliminarBtn() {
		return eliminarBtn;
	}

	public void setEliminarBtn(JButton eliminarBtn) {
		this.eliminarBtn = eliminarBtn;
	}

	public JButton getActNodo() {
		return actNodo;
	}

	public void setActNodo(JButton actNodo) {
		this.actNodo = actNodo;
	}

	public JButton getMostrarNodo() {
		return mostrarNodo;
	}

	public void setMostrarNodo(JButton mostrarNodo) {
		this.mostrarNodo = mostrarNodo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
