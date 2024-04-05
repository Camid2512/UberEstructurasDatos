package co.edu.unbosque.model;

import co.edu.unbosque.util.doublelinkedlist.MyDoubleLinkedList;

public class UserDTO {

	private String user;
	private String password;
	private TripDTO viaje;
	private MyDoubleLinkedList<PassangerDTO> passangers;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(String user, String password, TripDTO viaje, MyDoubleLinkedList<PassangerDTO> passangers) {
		super();
		this.user = user;
		this.password = password;
		this.viaje = viaje;
		this.passangers = passangers;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TripDTO getViaje() {
		return viaje;
	}

	public void setViaje(TripDTO viaje) {
		this.viaje = viaje;
	}

	public MyDoubleLinkedList<PassangerDTO> getPassangers() {
		return passangers;
	}

	public void setPassangers(MyDoubleLinkedList<PassangerDTO> passangers) {
		this.passangers = passangers;
	}

	@Override
	public String toString() {
		return "UserDTO [user=" + user + ", password=" + password + ", viaje=" + viaje + ", passangers=" + passangers
				+ "]";
	}
	
}
