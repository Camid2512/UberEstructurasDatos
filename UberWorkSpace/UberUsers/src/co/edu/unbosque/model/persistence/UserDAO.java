package co.edu.unbosque.model.persistence;


import co.edu.unbosque.model.UserDTO;
import co.edu.unbosque.util.linkedlist.MyLinkedList;

public class UserDAO implements CRUDOperation{
	
	private MyLinkedList<UserDTO> list;
	
	public UserDAO() {
		list = new MyLinkedList<>();
	}

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		list.add((UserDTO) obj);
	}

	@Override
	public String read() {
		return list.print();
	}

	@Override
	public boolean updateByIndex(int index, String... args) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByIndex(int index) {
		if (index < 0 || index >= list.size()) {
			return false;
		} else if (index == 0) {
			list.extract();
			return true;
		} else {
			list.extract(list.get(index - 1));
			return true;
		}
	}

	public MyLinkedList<UserDTO> getList() {
		return list;
	}

	public void setList(MyLinkedList<UserDTO> list) {
		this.list = list;
	}

	

}
