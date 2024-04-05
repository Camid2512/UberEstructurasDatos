package co.edu.unbosque.util.doublelinkedlist;



public class MyDoubleLinkedList<E> {

	protected DNode<E> head;
	protected DNode<E> currentPosition;

	public MyDoubleLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public void forward(int numPositions) {
		if (numPositions > 0 && head != null) {
			int positionForward = numPositions;
			if (currentPosition == null) {
				currentPosition = head;
				positionForward--;
			}
			while (currentPosition.getNext() != null && positionForward > 0) {
				currentPosition = currentPosition.getNext();
				positionForward--;
			}
		}
	}

	public void back(int numPositions) {
		if (numPositions <= 0 || head == null || currentPosition == null) {
			return;
		}
		int positionsBack = numPositions;
		while (currentPosition != null && positionsBack > 0) {
			currentPosition = currentPosition.getPrevious();
			positionsBack--;
		}
	}

	public void insert(E info) {
		DNode<E> newNode = new DNode<>(info);
		if (currentPosition == null) {
			newNode.setNext(head);
			if (head != null) {
				head.setPrevious(newNode);
			}
			head = newNode;
		} else {
			newNode.setNext(currentPosition.getNext());
			newNode.setPrevious(currentPosition);
			if (currentPosition.getNext() != null) {
				currentPosition.getNext().setPrevious(newNode);
			}
			currentPosition.setNext(newNode);

		}
		currentPosition = newNode;
	}

	public E extract() {
		E info = null;
		if (currentPosition != null) {
			info = currentPosition.getInfo();
			if (head == currentPosition) {
				head = currentPosition.getNext();
			} else {
				currentPosition.getPrevious().setNext(currentPosition.getNext());
			}
			if (currentPosition.getNext() != null) {
				currentPosition.getNext().setPrevious(currentPosition.getPrevious());
			}
			currentPosition = currentPosition.getNext();
		}
		return info;
	}

	@Override
	public String toString() {
		DNode<E> aux = head;
		StringBuilder sb = new StringBuilder();
		while (aux != null) {
			sb.append(aux.getInfo().toString());
			if (aux.getNext() != null) {
				sb.append("<->");
			}
			aux = aux.getNext();
		}
		return sb.toString();
	}

	public DNode<E> getHead() {
		return head;
	}

	public void setHead(DNode<E> head) {
		this.head = head;
	}

	public DNode<E> getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(DNode<E> currentPosition) {
		this.currentPosition = currentPosition;
	}

}
