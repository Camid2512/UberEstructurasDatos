package co.edu.unbosque.model;

public class StopDTO {
	
	private String lugar;
	
	public StopDTO() {
		// TODO Auto-generated constructor stub
	}

	public StopDTO(String lugar) {
		super();
		this.lugar = lugar;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	@Override
	public String toString() {
		return "StopDTO [lugar=" + lugar + "]";
	}
	

}
