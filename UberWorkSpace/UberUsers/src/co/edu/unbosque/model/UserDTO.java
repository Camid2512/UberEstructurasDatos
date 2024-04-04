package co.edu.unbosque.model;

import co.edu.unbosque.util.doublelinkedlist.MyDoubleLinkedList;

public class UserDTO {

	private String user;
	private String password;
	private MyDoubleLinkedList<PassangerDTO> passangers;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	
	public UserDTO(String user, String password, MyDoubleLinkedList<PassangerDTO> passangers) {
		super();
		this.user = user;
		this.password = password;
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

	public MyDoubleLinkedList<PassangerDTO> getPassangers() {
		return passangers;
	}

	public void setPassangers(MyDoubleLinkedList<PassangerDTO> passangers) {
		this.passangers = passangers;
	}


	@Override
	public String toString() {
		return "UserDTO [user=" + user + ", password=" + password + ", passangers=" + passangers + "]";
	}
	
	

}
