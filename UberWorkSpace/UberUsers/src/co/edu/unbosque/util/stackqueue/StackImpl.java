package co.edu.unbosque.util.stackqueue;

import co.edu.unbosque.util.doublelinkedlist.MyDequeueList;

public class StackImpl<E> implements Stack<E> {
	private MyDequeueList<E> data;

	public StackImpl() {
		data = new MyDequeueList<>();
	}

	@Override
	public void push(E info) {
		data.insertFirst(info);

	}

	@Override
	public E pop() {
		return data.removeFirst();
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public String toString() {
		return data.toString();
	}
}
