package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.StopDTO;
import co.edu.unbosque.util.linkedlist.MyLinkedList;

public class StopDAO implements CRUDOperation {
	
	private MyLinkedList<StopDTO> list;

	@Override
	public void create(Object obj) {
		list.add((StopDTO) obj);
		
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

	public MyLinkedList<StopDTO> getList() {
		return list;
	}

	public void setList(MyLinkedList<StopDTO> list) {
		this.list = list;
	}
	
	

}
