package co.edu.unbosque.model.persistence;


import co.edu.unbosque.model.TripDTO;

import co.edu.unbosque.util.linkedlist.MyLinkedList;


public class TripDAO implements CRUDOperation {
	
	private MyLinkedList<TripDTO> list;

	@Override
	public void create(Object obj) {
		list.add((TripDTO) obj);
		
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

	public MyLinkedList<TripDTO> getList() {
		return list;
	}

	public void setList(MyLinkedList<TripDTO> list) {
		this.list = list;
	}
	
}
