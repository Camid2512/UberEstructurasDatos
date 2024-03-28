package co.edu.unbosque.util.doublelinkedlist;

public interface Dequeue <E> {
	public void insertLast(E info);
	public E removeFirst();
	public void insertFirst(E info);
	public E removeLast();
	public int size();
	
}
