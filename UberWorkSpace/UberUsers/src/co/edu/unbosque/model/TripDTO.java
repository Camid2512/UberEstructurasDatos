package co.edu.unbosque.model;

import co.edu.unbosque.util.stackqueue.QueueImpl;

public class TripDTO {
	
	QueueImpl<StopDTO> stops;
	
	public TripDTO() {
		// TODO Auto-generated constructor stub
	}

	public TripDTO(QueueImpl<StopDTO> stops) {
		super();
		this.stops = stops;
	}

	public QueueImpl<StopDTO> getStops() {
		return stops;
	}

	public void setStops(QueueImpl<StopDTO> stops) {
		this.stops = stops;
	}

	@Override
	public String toString() {
		return "TripDTO [stops=" + stops + "]";
	}
	
	
}
