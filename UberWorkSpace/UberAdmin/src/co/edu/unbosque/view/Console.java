package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {

	private Scanner leer;

	public Console() {
		leer = new Scanner(System.in);
	}

	public int leerEntero() {
		return leer.nextInt();
	}

	public boolean leerBoolean() {
		return leer.nextBoolean();
	}

	public long leerLong() {
		return leer.nextLong();
	}

	public float leerFloat() {
		return leer.nextFloat();
	}

	public double leerDouble() {
		return leer.nextDouble();
	}

	public String leerLineaEntera() {
		return leer.nextLine();
	}

	public String leerPalabra() {
		return leer.next();
	}

	public char leerCaracter() {
		return leer.next().charAt(0);
	}

	public void quemarLinea() {
		leer.nextLine();
	}

	public void imprimirConSalto(String dato) {
		System.out.println(dato);
	}

	public void imprimirSinSalto(String dato) {
		System.out.print(dato);
	}

}
