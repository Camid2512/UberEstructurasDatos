package co.edu.unbosque.util.doublelinkedlist;

public class MyDequeueList<E> extends MyDoubleLinkedList<E> implements Dequeue<E> {
	private DNode<E> tail;
	private int size;

	public MyDequeueList() {
		head = new DNode<>();
		tail = new DNode<>();
		size = 0;
		head.setNext(tail);
		tail.setPrevious(head);
	}

	@Override
	public void insertLast(E info) {
		DNode<E> t = this.tail;
		DNode<E> newNode = new DNode<>();
		newNode.setInfo(info);
		newNode.setPrevious(t);
		t.setNext(newNode);
		this.tail = newNode;
		if (size == 0) {
			this.head = newNode;
		}
		size++;

	}

	@Override
	public E removeFirst() {
		if (this.head == null) {
			return null;
		} else {
			E info = this.head.getInfo();
			this.head = this.head.getNext();
			size--;
			return info;
		}

	}

	@Override
	public void insertFirst(E info) {
		DNode<E> h = this.head;
		DNode<E> newNode = new DNode<>();
		newNode.setInfo(info);
		newNode.setNext(h);
		h.setPrevious(newNode);
		this.head = newNode;
		if (size == 0) {
			tail = newNode;
		}
		size++;

	}

	@Override
	public E removeLast() {
		if (this.tail == null) {
			return null;
		} else {
			E info = this.tail.getInfo();
			this.tail = this.tail.getPrevious();
			size--;
			return info;
		}
	}

	@Override
	public int size() {
		return size;
	}

	public DNode<E> getTail() {
		return tail;
	}

	public void setTail(DNode<E> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("head[");
		DNode<E> aux = this.head;
		for (int i = 0; i < size; i++) {
			sb.append(aux.getInfo());
			if (aux == this.tail) {
				break;
			}
			sb.append("<->");
			aux = aux.getNext();
			
		}
		return sb.append("]tail").toString();
	}
}
