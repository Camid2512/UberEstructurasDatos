package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.PassangerDTO;
import co.edu.unbosque.util.linkedlist.MyLinkedList;

public class PassangerDAO implements CRUDOperation {

private MyLinkedList<PassangerDTO> list;

@Override
public void create(Object obj) {
	list.add((PassangerDTO) obj);
	
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

public MyLinkedList<PassangerDTO> getList() {
	return list;
}

public void setList(MyLinkedList<PassangerDTO> list) {
	this.list = list;
}



}
