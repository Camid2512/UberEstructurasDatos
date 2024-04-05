package co.edu.unbosque.view;

import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaActNodo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9122233536411577234L;

	private JLabel lbNameOfPlace, lbDirection;
	private JTextField txtNameOfPlace, txtDirection;
	private JButton btnActualizar; // Agregar botón
	private Image backgroundImage;

	public VentanaActNodo() {
		setLayout(new GridLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);

		lbNameOfPlace = new JLabel("Nombre del lugar:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(lbNameOfPlace, gbc);
		txtNameOfPlace = new JTextField(20);
		txtNameOfPlace.setToolTipText("Ingrese el nombre del lugar a donde se dirige");
		txtNameOfPlace.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txtNameOfPlace.setToolTipText("Ingrese el nombre del lugar a donde se dirige");
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(txtNameOfPlace, gbc);

		lbDirection = new JLabel("Dirección:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(lbDirection, gbc);
		txtDirection = new JTextField(20);
		txtDirection.setToolTipText("Ingrese la dirección del lugar a donde se dirige");
		txtDirection.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txtDirection.setToolTipText("Ingrese la dirección del lugar a donde se dirige");
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(txtDirection, gbc);

		// Agregar botón "Agregar"
		btnActualizar = new JButton("Actualizar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2; // Para que ocupe dos columnas
		gbc.anchor = GridBagConstraints.CENTER; // Para centrar el botón
		add(btnActualizar, gbc);

		backgroundImage = new ImageIcon("src/imgs/seleccionActualizar.png").getImage();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (backgroundImage != null) {
			g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JLabel getLbNameOfPlace() {
		return lbNameOfPlace;
	}

	public void setLbNameOfPlace(JLabel lbNameOfPlace) {
		this.lbNameOfPlace = lbNameOfPlace;
	}

	public JLabel getLbDirection() {
		return lbDirection;
	}

	public void setLbDirection(JLabel lbDirection) {
		this.lbDirection = lbDirection;
	}

	public JTextField getTxtNameOfPlace() {
		return txtNameOfPlace;
	}

	public void setTxtNameOfPlace(JTextField txtNameOfPlace) {
		this.txtNameOfPlace = txtNameOfPlace;
	}

	public JTextField getTxtDirection() {
		return txtDirection;
	}

	public void setTxtDirection(JTextField txtDirection) {
		this.txtDirection = txtDirection;
	}

	public Image getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(Image backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

}
