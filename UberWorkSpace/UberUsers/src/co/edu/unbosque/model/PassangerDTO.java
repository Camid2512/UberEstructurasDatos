package co.edu.unbosque.model;

public class PassangerDTO {

	private String name;
	private long documentId;
	private String parada;
	
	public PassangerDTO() {
		// TODO Auto-generated constructor stub
	}

	public PassangerDTO(String name, long documentId, String parada) {
		super();
		this.name = name;
		this.documentId = documentId;
		this.parada = parada;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(long documentId) {
		this.documentId = documentId;
	}

	public String getParada() {
		return parada;
	}

	public void setParada(String parada) {
		this.parada = parada;
	}

	@Override
	public String toString() {
		return "PassangerDTO [name=" + name + ", documentId=" + documentId + ", parada=" + parada + "]";
	}
	
	

}
