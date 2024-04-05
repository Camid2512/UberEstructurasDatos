package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.PassangerDTO;
import co.edu.unbosque.model.TripDTO;
import co.edu.unbosque.model.UserDTO;
import co.edu.unbosque.model.persistence.PassangerDAO;
import co.edu.unbosque.model.persistence.StopDAO;
import co.edu.unbosque.model.persistence.TripDAO;
import co.edu.unbosque.model.persistence.UserDAO;
import co.edu.unbosque.util.EmptyDataException;
import co.edu.unbosque.util.NotValidPasswordException;
import co.edu.unbosque.util.SameUserException;
import co.edu.unbosque.util.doublelinkedlist.MyDoubleLinkedList;
import co.edu.unbosque.view.FourTravelers;
import co.edu.unbosque.view.MainWindow;
import co.edu.unbosque.view.OneTraveler;
import co.edu.unbosque.view.Receipt;
import co.edu.unbosque.view.SelectStops;
import co.edu.unbosque.view.SignUpWindow;
import co.edu.unbosque.view.StopsNumber;
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
	private StopsNumber stopsNumW;
	private SelectStops selectStopsW;
	private Receipt receipt;
	private StopDAO stopDAO;
	private TripDAO tripDAO;
	private PassangerDAO passangerDAO;
	private UserDAO uDAO;
	private int contRep = 0;

	public Controller() {
		mw = new MainWindow();
		welcomeW = new Welcome();
		signUpw = new SignUpWindow();
		travNumW = new TravelersNumber();
		oneTravW = new OneTraveler();
		twoTravW = new TwoTravelers();
		threeTravW = new ThreeTravelers();
		fourTravW = new FourTravelers();
		stopsNumW = new StopsNumber();
		selectStopsW = new SelectStops();
		receipt = new Receipt();
		uDAO = new UserDAO();
		passangerDAO = new PassangerDAO();
		tripDAO = new TripDAO();
		stopDAO = new StopDAO();
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

		// BOTONES CREAR CUENTA

		signUpw.getCreateAccountBtn().addActionListener(this);
		signUpw.getCreateAccountBtn().setActionCommand("botonCrearCuenta");

		signUpw.getBackBtn().addActionListener(this);
		signUpw.getBackBtn().setActionCommand("botonVolverCrearCuenta");

		// BOTONES BIENVENIDO

		welcomeW.getTravelsBtn().addActionListener(this);
		welcomeW.getTravelsBtn().setActionCommand("botonHacerViaje");

		welcomeW.getVideoBtn().addActionListener(this);
		welcomeW.getVideoBtn().setActionCommand("botonVerVideo");

		welcomeW.getBackBtn().addActionListener(this);
		welcomeW.getBackBtn().setActionCommand("botonVolverBienvenido");

		// BOTONES CANTIDAD PASAJEROS

		travNumW.getContinueBtn().addActionListener(this);
		travNumW.getContinueBtn().setActionCommand("botonContinuarNumeroPasajeros");

		travNumW.getBackBtn().addActionListener(this);
		travNumW.getBackBtn().setActionCommand("botonVolverNumeroPasajeros");

		// BOTON ATRAS DATOS PASAJEROS

		oneTravW.getBackBtn().addActionListener(this);
		oneTravW.getBackBtn().setActionCommand("botonVolverInfoPasajeros");

		twoTravW.getBackBtn().addActionListener(this);
		twoTravW.getBackBtn().setActionCommand("botonVolverInfoPasajeros");

		threeTravW.getBackBtn().addActionListener(this);
		threeTravW.getBackBtn().setActionCommand("botonVolverInfoPasajeros");

		fourTravW.getBackBtn().addActionListener(this);
		fourTravW.getBackBtn().setActionCommand("botonVolverInfoPasajeros");

		// BOTON ADELANTE DATOS PASAJEROS

		oneTravW.getNextBtn().addActionListener(this);
		oneTravW.getNextBtn().setActionCommand("botonContinuarInfoPasajeros");

		twoTravW.getNextBtn().addActionListener(this);
		twoTravW.getNextBtn().setActionCommand("botonContinuarInfoPasajeros");

		threeTravW.getNextBtn().addActionListener(this);
		threeTravW.getNextBtn().setActionCommand("botonContinuarInfoPasajeros");

		fourTravW.getNextBtn().addActionListener(this);
		fourTravW.getNextBtn().setActionCommand("botonContinuarInfoPasajeros");

		// BOTONES NUMERO DE PARADAS

		stopsNumW.getBackBtn().addActionListener(this);
		stopsNumW.getBackBtn().setActionCommand("botonAtrasNumeroParadas");

		stopsNumW.getContinueBtn().addActionListener(this);
		stopsNumW.getContinueBtn().setActionCommand("botonContinuarNumeroParadas");

		// BOTONES INFO PARADAS

		selectStopsW.getBackBtn().addActionListener(this);
		selectStopsW.getBackBtn().setActionCommand("botonAtrasSeleccionarParadas");

		selectStopsW.getContinueBtn().addActionListener(this);
		selectStopsW.getContinueBtn().setActionCommand("botonContinuarSeleccionarParadas");
	}

	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "botonIrCrearCuenta": {
			signUpw.setVisible(true);
			mw.setVisible(false);
			break;
		}
		case "botonIniciarSesion": {
			checkLogin();
			break;
		}

		case "botonCrearCuenta": {
			createAccount();
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
			if (numpasajeros == 1) {
				oneTravW.setVisible(true);
			}
			if (numpasajeros == 2) {
				twoTravW.setVisible(true);
			}
			if (numpasajeros == 3) {
				threeTravW.setVisible(true);
			}
			if (numpasajeros == 4) {
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

		case "botonContinuarInfoPasajeros": {
			stopsNumW.setVisible(true);
			int numpasajeros = Integer.parseInt(travNumW.getNumTravelers().getValue().toString());
			if (numpasajeros == 1) {
				oneTravW.setVisible(false);
			}
			if (numpasajeros == 2) {
				twoTravW.setVisible(false);
			}
			if (numpasajeros == 3) {
				threeTravW.setVisible(false);
			}
			if (numpasajeros == 4) {
				fourTravW.setVisible(false);
			}

			break;
		}

		case "botonVolverInfoPasajeros": {
			travNumW.setVisible(true);
			int numpasajeros = Integer.parseInt(travNumW.getNumTravelers().getValue().toString());
			if (numpasajeros == 1) {
				oneTravW.setVisible(false);
			}
			if (numpasajeros == 2) {
				twoTravW.setVisible(false);
			}
			if (numpasajeros == 3) {
				threeTravW.setVisible(false);
			}
			if (numpasajeros == 4) {
				fourTravW.setVisible(false);
			}

			break;
		}

		case "botonAtrasNumeroParadas": {
			int numpasajeros = Integer.parseInt(travNumW.getNumTravelers().getValue().toString());
			if (numpasajeros == 1) {
				oneTravW.setVisible(true);
			}
			if (numpasajeros == 2) {
				twoTravW.setVisible(true);
			}
			if (numpasajeros == 3) {
				threeTravW.setVisible(true);
			}
			if (numpasajeros == 4) {
				fourTravW.setVisible(true);
			}
			stopsNumW.setVisible(false);
			break;
		}

		case "botonContinuarNumeroParadas": {
			selectStopsW.setVisible(true);
			stopsNumW.setVisible(false);
			break;
		}

		case "botonAtrasSeleccionarParadas": {
			stopsNumW.setVisible(true);
			selectStopsW.setVisible(false);
			break;
		}

		case "botonContinuarSeleccionarParadas": {
			// crear array con info para guardar cuantas veces sea necesario
			int numparadas = Integer.parseInt(stopsNumW.getNumStops().getValue().toString());
			// funcion recursiva que vacie los textfields y que sume a un contador
			// if que compare el contador con el numero de paradas que cuando este completo
			// mande el recibo
			stopsNumW.setVisible(true);
			selectStopsW.setVisible(false);
			break;
		}
		}

	}

	public void repetirVentana(int cont, int numParadas) {
		if (cont >= numParadas) {
			return;
		}
		if (cont < numParadas) {

		}

	}

	public void fillBoxSelectParada1(int cont) {

		if (cont < stopDAO.getList().size()) {

			selectStopsW.getParada1().addItem(stopDAO.getList().get(cont).getInfo().getLugar());
			fillBoxSelectParada1(cont + 1);
		}

		if (cont >= stopDAO.getList().size()) {
			return;
		}
	}

	public void updateBoxSelectUpdatePackage() {

		selectStopsW.getParada1().removeAllItems();

	}

	public void checkLogin() {

		String nameToCheck = signUpw.getUserTxt().getText();
		String passToCheck = signUpw.getPasswordTxt().getText();

		int cont = 0;

		for (int i = 0; i < uDAO.getList().size(); i++) {

			if (nameToCheck.equals(uDAO.getList().get(i).getInfo().getUser())
					&& passToCheck.equals(uDAO.getList().get(i).getInfo().getPassword())) {
				cont = 1;

			}

		}

		if (cont == 1) {
			JOptionPane.showMessageDialog(signUpw, "----INGRESANDO----");
			welcomeW.setVisible(true);
			mw.setVisible(false);

		}
		if (cont == 0) {
			JOptionPane.showMessageDialog(signUpw, "Usuario y/o Contraseña ERRADOS", "NO EXIST", 0);
			mw.setVisible(true);
			
		}
	}

	public void createAccount() {

		String user = "";
		String pass = "";
		while (true) {

			try {
				user = signUpw.getUserTxt().getText();
				sameUserException(user);
				emptyData(user);
				pass = signUpw.getPasswordTxt().getText();
				validPassword(pass);
				emptyData(pass);

				int response = JOptionPane.showOptionDialog(signUpw, "¿ESTA SEGURO DE LOS DATOS INGRESADOS?",
						"CONFIRMAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "SI", "NO" }, "SI");

				if (JOptionPane.NO_OPTION == response) {

					signUpw.getUserTxt().setText(null);
					signUpw.getPasswordTxt().setText(null);

				} else if (JOptionPane.OK_OPTION == response) {
					String usuario = signUpw.getUserTxt().getText();
					String contrasena = signUpw.getPasswordTxt().getText();
					TripDTO viaje = null;
					MyDoubleLinkedList<PassangerDTO> passangers = null;

					UserDTO aux = new UserDTO(usuario, contrasena, viaje, passangers);
					uDAO.create(aux);
					JOptionPane.showMessageDialog(mw, "CUENTA CREADA CON EXITO");

					mw.setVisible(true);
					signUpw.setVisible(false);

				}

			} catch (NotValidPasswordException e) {
				// TODO Auto-generated catch block
				signUpw.getUserTxt().setText(null);
				signUpw.getPasswordTxt().setText(null);
			} catch (EmptyDataException e) {
				// TODO Auto-generated catch block
				signUpw.getUserTxt().setText(null);
				signUpw.getPasswordTxt().setText(null);
			} catch (SameUserException e) {
				// TODO Auto-generated catch block
				signUpw.getUserTxt().setText(null);
				signUpw.getPasswordTxt().setText(null);
			}
			break;
		}

	}

	public boolean emptyData(String data) throws EmptyDataException {

		boolean check = true;
		if (data.isBlank() || data.isEmpty()) {
			JOptionPane.showMessageDialog(welcomeW, "HAY DATOS VACIOS, VERIFIQUE", "EXCEPTION", 0);
			check = false;
			throw new EmptyDataException();
		} else {
			check = true;
		}
		return check;

	}

	public boolean sameUserException(String user) throws SameUserException {

		boolean check = true;

		String userToCheck = user;
		int cont = 0;

		for (int i = 0; i < uDAO.getList().size(); i++) {

			if (userToCheck.equals(uDAO.getList().get(i).getInfo().getUser())) {

				cont++;

			}

		}

		if (cont > 0) {
			JOptionPane.showMessageDialog(mw, "USUARIO YA EXISTENTE, INTENTELO DE NUEVO", "EXCEPTION", 0);
			check = false;
			throw new SameUserException();
		} else if (cont == 0) {

			check = true;

		}

		return check;

	}

	public boolean validPassword(String pass) throws NotValidPasswordException {

		boolean check = true;

		int cont = 0;

		if (pass.length() < 8) {
			cont++;
		}
		if (!pass.matches(".*[A-Z].*")) {

			cont++;
		}
		if (!pass.matches(".*[a-z].*")) {
			cont++;
		}
		if (!pass.matches(".*\\d.*")) {
			cont++;
		}
		if (!pass.matches(".*[!@#$%^&()_+\\-=\\[\\]{};':\",.<>/?].*")) {
			cont++;
		}

		if (cont > 0) {

			JOptionPane.showMessageDialog(signUpw,
					"LA CONTRASEÑA NO ES LO SUFICIENTEMENTE SEGURA \n(LA CONTRASEÑA DEBE TENER: MINIMO 8 CARACTERES, UNA MAYUSCULA, UN NUMERO Y UN CARACTER ESPECIAL)",
					"EXCEPTION", 0);
			check = false;
			throw new NotValidPasswordException();
		} else if (cont == 0) {
			check = true;
		}

		return check;
	}

}
