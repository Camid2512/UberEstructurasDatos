package co.edu.unbosque.util.graph;

import co.edu.unbosque.util.linkedlist.MyLinkedList;

public class Vertex <E>{
	private E info;
	private MyLinkedList<Edge> caminosAdyacentes;
	
	public Vertex() {
		// TODO Auto-generated constructor stub
	}
	
	public Vertex(E info) {
		 this.info= info;
		 caminosAdyacentes = new MyLinkedList<>();
	}

	public E getInfo() {
		return info;
	}

	public void setInfo(E info) {
		this.info = info;
	}

	public MyLinkedList<Edge> getCaminosAdyacentes() {
		return caminosAdyacentes;
	}

	public void setCaminosAdyacentes(MyLinkedList<Edge> caminosAdyacentes) {
		this.caminosAdyacentes = caminosAdyacentes;
	}
	public void addEdge(Edge e) {
		caminosAdyacentes.addLast(e);
	}

	@Override
	public String toString() {
		return "Vertice:"+ info +  "\n"  + caminosAdyacentes  +"\n";
	}
	
		

	

	

}
