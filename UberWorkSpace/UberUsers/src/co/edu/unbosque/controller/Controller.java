package co.edu.unbosque.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.FourTravelers;
import co.edu.unbosque.view.MainWindow;
import co.edu.unbosque.view.OneTraveler;
import co.edu.unbosque.view.SignUpWindow;
import co.edu.unbosque.view.ThreeTravelers;
import co.edu.unbosque.view.TravelersNumber;
import co.edu.unbosque.view.TwoTravelers;
import co.edu.unbosque.view.Welcome;

public class Controller implements ActionListener {
	
	private MainWindow mw;
	private Welcome welcomeW;
	private SignUpWindow signUpw;
	private TravelersNumber travNumW;
	private OneTraveler oneTravW;
	private TwoTravelers twoTravW;
	private ThreeTravelers threeTravW;
	private FourTravelers fourTravW;
	
	public Controller() {
		mw = new MainWindow();
		welcomeW = new Welcome();
		signUpw = new SignUpWindow();
		travNumW = new TravelersNumber();
		oneTravW = new OneTraveler();
		twoTravW = new TwoTravelers();
		threeTravW = new ThreeTravelers();
		fourTravW = new FourTravelers();
		addLectors();
		
	}
	
	public void run() {
		mw.setVisible(true);
	}
	
	public void addLectors() {
		
		mw.getSignUpBtn().addActionListener(this);
		mw.getSignUpBtn().setActionCommand("botonIrCrearCuenta");
		
		mw.getLogInBtn().addActionListener(this);
		mw.getLogInBtn().setActionCommand("botonIniciarSesion");
		
		//BOTONES CREAR CUENTA
		
		signUpw.getCreateAccountBtn().addActionListener(this);
		signUpw.getCreateAccountBtn().setActionCommand("botonCrearCuenta");
		
		signUpw.getBackBtn().addActionListener(this);
		signUpw.getBackBtn().setActionCommand("botonVolverCrearCuenta");
		
		//BOTONES BIENVENIDO
		
		welcomeW.getTravelsBtn().addActionListener(this);
		welcomeW.getTravelsBtn().setActionCommand("botonHacerViaje");
		
		welcomeW.getVideoBtn().addActionListener(this);
		welcomeW.getVideoBtn().setActionCommand("botonVerVideo");
		
		welcomeW.getBackBtn().addActionListener(this);
		welcomeW.getBackBtn().setActionCommand("botonVolverBienvenido");
		
		//BOTONES CANTIDAD PASAJEROS
		
		travNumW.getContinueBtn().addActionListener(this);
		travNumW.getContinueBtn().setActionCommand("botonContinuarNumeroPasajeros");
		
		travNumW.getBackBtn().addActionListener(this);
		travNumW.getBackBtn().setActionCommand("botonVolverNumeroPasajeros");
		
	}
	
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "botonIrCrearCuenta": {
			signUpw.setVisible(true);
			mw.setVisible(false);			
			break;
		}
		case "botonIniciarSesion": {
			welcomeW.setVisible(true);
			mw.setVisible(false);
			break;
		}
		
		case "botonCrearCuenta": {
			mw.setVisible(true);
			signUpw.setVisible(false);
			break;
		}
		
		case "botonVolverCrearCuenta": {
			mw.setVisible(true);
			signUpw.setVisible(false);
			break;
		}
		
		case "botonHacerViaje": {
			travNumW.setVisible(true);
			welcomeW.setVisible(false);
			break;
		}
		
		case "botonVerVideo": {
			
			break;
		}
		
        case "botonVolverBienvenido": {
        	mw.setVisible(true);
        	welcomeW.setVisible(false);
			break;
		}
        
        case "botonContinuarNumeroPasajeros": {
        	int numpasajeros = Integer.parseInt(travNumW.getNumTravelers().getValue().toString());
        	if(numpasajeros==1) {
        		oneTravW.setVisible(true); 
        	}if(numpasajeros==2) {
        		twoTravW.setVisible(true);
        	}if(numpasajeros==3) {
        		threeTravW.setVisible(true);
        	}if(numpasajeros==4) {
        		fourTravW.setVisible(true);
        	}
        	travNumW.setVisible(false);
			break;
		}
        
        case "botonVolverNumeroPasajeros": {
        	welcomeW.setVisible(true);
        	travNumW.setVisible(false);       	
			break;
		}
		}}
	
	

}
