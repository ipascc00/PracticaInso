package dao.modelo.entidades;

public class EventPrefDTO {
	
	private int idEvent;
	private int idPreferences;
	public EventPrefDTO(int idEvent, int idPreferences) {
		
		this.idEvent = idEvent;
		this.idPreferences = idPreferences;
	}
	public int getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}
	public int getIdPreferences() {
		return idPreferences;
	}
	public void setIdPreferences(int idPreferences) {
		this.idPreferences = idPreferences;
	}
	
	
}
