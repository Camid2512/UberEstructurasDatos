package co.edu.unbosque.util;

public class NotValidPasswordException extends Exception {

	/**
	 * Identificador de serialización para la clase.
	 */
	private static final long serialVersionUID = -7722503494210032280L;

	/**
	 * Constructor vacio de excepcion con mensaje predeterminado
	 */
	public NotValidPasswordException() {
		// TODO Auto-generated constructor stub
		super("CONTRASEÑA NO VALIDA");

	}

	/**
	 * Constructor vacio de excepcion con mensaje
	 */
	public NotValidPasswordException(String message) {
		// TODO Auto-generated constructor stub
		super(message);

	}

}
