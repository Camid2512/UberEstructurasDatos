package co.edu.unbosque.util;


/**
 * Encargada de verificar que no haya datos vacios
 */
public class EmptyDataException extends Exception {

	/**
	 * Identificador de serializaciÃ³n para la clase.
	 */
	private static final long serialVersionUID = 4358355654793907189L;

	/**
	 * Constructor vacio de excepcion con mensaje predeterminado
	 */
	public EmptyDataException() {
		// TODO Auto-generated constructor stub
		super("NO PUEDEN HABER DATOS VACIOS");

	}

	/**
	 * Constructor vacio de excepcion con mensaje
	 */
	public EmptyDataException(String message) {
		// TODO Auto-generated constructor stub
		super(message);

	}

}
