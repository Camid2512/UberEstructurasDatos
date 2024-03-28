package co.edu.unbosque.util.stackqueue;

public interface Queue <E>{
	public void enqueue(E info);
	public E dequeue();
	public int size();
	
}
