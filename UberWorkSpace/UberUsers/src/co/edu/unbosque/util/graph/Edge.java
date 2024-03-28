package co.edu.unbosque.util.graph;

public class Edge {
	private Vertex<?> origen;
	private Vertex<?> destino;
	private double valor;

	public Edge() {
		// TODO Auto-generated constructor stub
	}

	public Edge(Vertex<?> origen, Vertex<?> destino, double valor) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.valor = valor;
	}

	public Vertex<?> getOrigen() {
		return origen;
	}

	public void setOrigen(Vertex<?> origen) {
		this.origen = origen;
	}

	public Vertex<?> getDestino() {
		return destino;
	}

	public void setDestino(Vertex<?> destino) {
		this.destino = destino;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Desde:" + origen.getInfo() + ", Hasta:" + destino.getInfo() + ", Peso: " + valor + "\n";
	}

}
