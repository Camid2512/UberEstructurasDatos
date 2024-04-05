package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.NodoDAO;
import co.edu.unbosque.view.Console;
import co.edu.unbosque.view.MainWindow;
import co.edu.unbosque.view.VentanaActNodo;
import co.edu.unbosque.view.VentanaAdmin;
import co.edu.unbosque.view.VentanaAgNodo;
import co.edu.unbosque.view.VentanaAristas;
import co.edu.unbosque.view.VentanaConectar;
import co.edu.unbosque.view.VentanaCrud;
import co.edu.unbosque.view.VentanaDesconectar;
import co.edu.unbosque.view.VentanaMapa;
import co.edu.unbosque.view.VentanaMosNodo;
import co.edu.unbosque.view.VentanaSolicitudesRefresh;
import co.edu.unbosque.view.VentanaTutorial;
import co.edu.unbosque.view.VentanaViajes;

public class Controller implements ActionListener {

	private Console con;
	private MainWindow mw;
	private VentanaAdmin vA;
	private VentanaCrud vC;
	private VentanaAgNodo agNodo;
	private VentanaActNodo actNodo;
	private VentanaMosNodo mosNodo;
	private VentanaAristas vAristas;
	private VentanaViajes viajes;
	private VentanaMapa mapa;
	private VentanaTutorial tutorial;
	private NodoDAO  nDAO;
	private VentanaConectar vConectar;
	private VentanaDesconectar vDesconectar;
	private VentanaSolicitudesRefresh solicR;

	public Controller() {
		con = new Console();
		mw = new MainWindow();
		vA = new VentanaAdmin();
		vC = new VentanaCrud();
		agNodo = new VentanaAgNodo();
		actNodo = new VentanaActNodo();
		vAristas = new VentanaAristas();
		viajes = new VentanaViajes();
		mapa = new VentanaMapa();
		tutorial = new VentanaTutorial();
		nDAO = new NodoDAO();
		vConectar = new VentanaConectar();
		vDesconectar = new VentanaDesconectar();
		solicR = new VentanaSolicitudesRefresh();

		addLectors();

	}

	public void run() {
		mw.setVisible(true);
	}

	public void addLectors() {

		mw.getP2().getBtn().addActionListener((ActionListener) this);

		vA.getAdminNodosBtn().addActionListener((ActionListener) this);
		vA.getAdminNodosBtn().setActionCommand("botonCrudNodos");

		vA.getAdminAristasBtn().addActionListener((ActionListener) this);
		vA.getAdminAristasBtn().setActionCommand("botonAdminAristas");

		vA.getAcpViajesBtn().addActionListener((ActionListener) this);
		vA.getAcpViajesBtn().setActionCommand("botonViajes");

		vA.getVerMapaBtn().addActionListener((ActionListener) this);
		vA.getVerMapaBtn().setActionCommand("botonMapa");

		vA.getTutoBtn().addActionListener((ActionListener) this);
		vA.getTutoBtn().setActionCommand("botonTutotal");

		vC.getCrearBtn().addActionListener((ActionListener) this);
		vC.getCrearBtn().setActionCommand("botonAgregar");
		

		vC.getEliminarBtn().addActionListener((ActionListener) this);
		vC.getEliminarBtn().setActionCommand("botonEliminar");

		vC.getActNodo().addActionListener((ActionListener) this);
		vC.getActNodo().setActionCommand("botonActualizar");

		vC.getMostrarNodo().addActionListener((ActionListener) this);
		vC.getMostrarNodo().setActionCommand("botonMostrar");

		vAristas.getConnectBtn().addActionListener((ActionListener) this);
		vAristas.getConnectBtn().setActionCommand("botonConectarAristas");

		vAristas.getDesconectBtn().addActionListener((ActionListener) this);
		vAristas.getDesconectBtn().setActionCommand("botonDesconectarAristas");

		vConectar.getConectBtn().addActionListener((ActionListener) this);
		vConectar.getConectBtn().setActionCommand("botonConectar");

		vDesconectar.getDesconectBtn().addActionListener((ActionListener) this);
		vDesconectar.getDesconectBtn().setActionCommand("botonDesconectar");
		
		solicR.getAceptarBtn().addActionListener((ActionListener) this);
		solicR.getAceptarBtn().setActionCommand("botonAceptar");
		
		solicR.getDenegarBtn().addActionListener((ActionListener) this);
		solicR.getDenegarBtn().setActionCommand("botonDenegar");
		
		solicR.getRefreshBtn().addActionListener((ActionListener) this);
		solicR.getRefreshBtn().setActionCommand("botonRefrescar");
		
	}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		con.imprimirConSalto(comando);

		if (comando.equals("INGRESAR")) {
			vA.setVisible(true);
			mw.setVisible(false);
		}

		switch (e.getActionCommand()) {
		case "botonCrudNodos": {
			vC.setVisible(true);
			vA.setVisible(false);
			break;
		}
		case "botonAdminAristas": {
			vAristas.setVisible(true);
			vA.setVisible(false);
			break;
		}
		case "botonMapa": {
			mapa.setVisible(true);
			vA.setVisible(false);
			break;
		}
		case "botonViajes": {
			solicR.setVisible(true);
			vA.setVisible(false);
			break;
		}
		
		case "botonAgregar": {
			agNodo.setVisible(true);
			vC.setVisible(false);
			break;
		}

		case "botonActualizar": {
			actNodo.setVisible(true);
			vC.setVisible(false);
			break;
		}
		case "botonConectarAristas": {
			vConectar.setVisible(true);
			vAristas.setVisible(false);
			break;
		}
		case "botonDesconectarAristas": {
			vDesconectar.setVisible(true);
			vAristas.setVisible(false);
			break;
		}

		case "botonConectar": {
			vConectar.setVisible(true);
			vAristas.setVisible(false);
			break;
		}
		case "botonDesconectar": {
			vDesconectar.setVisible(true);
			vAristas.setVisible(false);
			break;
		}
		case "botonAceptar": {
			solicR.setVisible(true);
			vA.setVisible(false);
			break;
		}
		case "botonDenegar": {
			solicR.setVisible(true);
			vA.setVisible(false);
			break;
		}
		case "botonRefrescar": {
			solicR.setVisible(true);
			vA.setVisible(false);
			break;
		}

		}

	}
	
}