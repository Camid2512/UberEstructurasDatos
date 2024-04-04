package co.edu.unbosque.model;

public class PassangerDTO {

	private String name;
	private long documentId;
	private TripDTO viaje;
	
	public PassangerDTO() {
		// TODO Auto-generated constructor stub
	}

	public PassangerDTO(String name, long documentId, TripDTO viaje) {
		super();
		this.name = name;
		this.documentId = documentId;
		this.viaje = viaje;
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

	public TripDTO getViaje() {
		return viaje;
	}

	public void setViaje(TripDTO viaje) {
		this.viaje = viaje;
	}

	@Override
	public String toString() {
		return "PassangerDTO [name=" + name + ", documentId=" + documentId + ", viaje=" + viaje + "]";
	}
	
	

}
