package co.edu.unbosque.util.stackqueue;

import co.edu.unbosque.util.doublelinkedlist.MyDequeueList;

public class QueueImpl<E> implements Queue<E> {

	private MyDequeueList<E> data;

	public QueueImpl() {
		data = new MyDequeueList<>();
	}

	@Override
	public void enqueue(E info) {
		data.insertFirst(info);

	}

	@Override
	public E dequeue() {

		return data.removeLast();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public String toString() {
		return data.toString();
	}

	public MyDequeueList<E> getData() {
		return data;
	}

	public void setData(MyDequeueList<E> data) {
		this.data = data;
	}

}
