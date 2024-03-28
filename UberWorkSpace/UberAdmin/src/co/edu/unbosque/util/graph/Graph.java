package co.edu.unbosque.util.graph;



import co.edu.unbosque.util.linkedlist.MyLinkedList;

public class Graph {
	private MyLinkedList<Vertex<?>> listaDeNodos;
	public Graph() {
	listaDeNodos = new MyLinkedList<>();
		// TODO Auto-generated constructor stub
	}
	public MyLinkedList<Vertex<?>> getListaDeNodos() {
		return listaDeNodos;
	}
	public void setListaDeNodos(MyLinkedList<Vertex<?>> listaDeNodos) {
		this.listaDeNodos = listaDeNodos;
	}
	public void addVertex(Vertex<?> v) {
		listaDeNodos.add(v);
	}
	
	@Override
	public String toString() {
		return "Lista de nodos en el grafo" +"\n"+ listaDeNodos+ "\n";
		
	}
	
}
