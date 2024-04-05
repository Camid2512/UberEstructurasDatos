package co.edu.unbosque.model;

public class NodoDTO {

	private String nameOfPlace;
	private String direction;

	public NodoDTO() {
		// TODO Auto-generated constructor stub
	}

	public NodoDTO(String nameOfPlace, String direction) {
		super();
		this.nameOfPlace = nameOfPlace;
		this.direction = direction;
	}

	public String getNameOfPlace() {
		return nameOfPlace;
	}

	public void setNameOfPlace(String nameOfPlace) {
		this.nameOfPlace = nameOfPlace;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "NodoDTO [nameOfPlace=" + nameOfPlace + ", direction=" + direction + "]";
	}

}
