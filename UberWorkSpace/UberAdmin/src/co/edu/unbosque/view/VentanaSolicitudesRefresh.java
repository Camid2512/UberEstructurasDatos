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

public class VentanaSolicitudesRefresh extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7676189942734241545L;

	private JLabel mainImage;
	private JComboBox<String> solicitudes;
	private JButton aceptarBtn, denegarBtn, refreshBtn;

	public VentanaSolicitudesRefresh() {
		// TODO Auto-generated constructor stub
		setSize(1296, 759);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Viajes");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);

		solicitudes = new JComboBox<String>();
		solicitudes.setToolTipText("Seleccione una solicitud");
		solicitudes.setName("Seleccione su solicitud");
		solicitudes.setForeground(Color.black);
		solicitudes.setBackground(Color.white);
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(new JLabel("Solicitudes= "), gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(solicitudes, gbc);

		aceptarBtn = new JButton();
		aceptarBtn.setBounds(119, 360, 299, 86);
		aceptarBtn.setToolTipText("Oprima este boton para aceptar la solicitud");
		aceptarBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(aceptarBtn);

		denegarBtn = new JButton();
		denegarBtn.setBounds(119, 460, 299, 86);
		denegarBtn.setToolTipText("Oprima este boton para denegar la solicitud");
		denegarBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(denegarBtn);

		refreshBtn = new JButton();
		refreshBtn.setBounds(819, 410, 299, 86);
		refreshBtn.setToolTipText("Oprima este boton para refrescar");
		refreshBtn.setBackground(new Color(0, 0, 0, 0));
//		logInBtn.setOpaque(false);
//		logInBtn.setContentAreaFilled(false);
//		logInBtn.setBorderPainted(false);
		add(refreshBtn);

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

	public JComboBox<String> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(JComboBox<String> solicitudes) {
		this.solicitudes = solicitudes;
	}

	public JButton getAceptarBtn() {
		return aceptarBtn;
	}

	public void setAceptarBtn(JButton aceptarBtn) {
		this.aceptarBtn = aceptarBtn;
	}

	public JButton getDenegarBtn() {
		return denegarBtn;
	}

	public void setDenegarBtn(JButton denegarBtn) {
		this.denegarBtn = denegarBtn;
	}

	public JButton getRefreshBtn() {
		return refreshBtn;
	}

	public void setRefreshBtn(JButton refreshBtn) {
		this.refreshBtn = refreshBtn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
