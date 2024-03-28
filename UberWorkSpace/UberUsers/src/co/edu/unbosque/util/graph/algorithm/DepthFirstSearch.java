package co.edu.unbosque.util.graph.algorithm;

import java.util.HashSet;
import java.util.Set;

import co.edu.unbosque.util.graph.Edge;
import co.edu.unbosque.util.graph.Vertex;
import co.edu.unbosque.util.linkedlist.MyLinkedList;
import co.edu.unbosque.util.stackqueue.StackImpl;

public class DepthFirstSearch extends AbstractSearch {

	private StackImpl<Vertex<?>> stackOfNodes = new StackImpl<Vertex<?>>();
	private MyLinkedList<Vertex<?>> visitedNodes = new MyLinkedList<Vertex<?>>();
	private Set<Vertex<?>> lstUnique = new HashSet<>();
	static int cont;

	public DepthFirstSearch(Vertex<?> sourceVertex, Vertex<?> destinationVertex) {
		super(sourceVertex, destinationVertex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean runSearch() {
		cont = 0;
		if (this.sourceVertex.equals(destinationVertex)) {
			System.out.println("Nodo destino encontrado a 0 de profundidad");
			System.out.println(sourceVertex.getInfo());
			return true;
		}
		System.out.println("Ruta a seguir para ubicar el nodo");
		return searchRecursively(sourceVertex);
	}

	private boolean searchRecursively(Vertex<?> current) {
		if (current.equals(destinationVertex)) {
			System.out.println(destinationVertex.getInfo());
			System.out.println("nodo buscado encontrado \n");
			return true;
		} else {
			System.out.println(current.getInfo() + " -> ");
			visitedNodes.addLast(current);
			if (!lstUnique.contains(current)) {
				lstUnique.add(current);
				cont++;
			}
			return searchAdjacentVerticesRecursively(current.getCaminosAdyacentes());
		}
	}

	private boolean searchAdjacentVerticesRecursively(MyLinkedList<Edge> adyacents) {
		if (adyacents.isEmpty()) {
			return false;
		}
		Vertex<?> nextVertex = adyacents.extract().getDestino();
		if (!visitedNodes.contains(nextVertex)) {
			if (searchRecursively(nextVertex)) {
				return true;
			}
		}
		return searchAdjacentVerticesRecursively(adyacents);
	}

	public StackImpl<Vertex<?>> getStackOfNodes() {
		return stackOfNodes;
	}

	public void setStackOfNodes(StackImpl<Vertex<?>> stackOfNodes) {
		this.stackOfNodes = stackOfNodes;
	}

	public MyLinkedList<Vertex<?>> getVisitedNodes() {
		return visitedNodes;
	}

	public void setVisitedNodes(MyLinkedList<Vertex<?>> visitedNodes) {
		this.visitedNodes = visitedNodes;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		DepthFirstSearch.cont = cont;
	}

}
