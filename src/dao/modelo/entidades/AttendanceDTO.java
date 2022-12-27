package dao.modelo.entidades;

public class AttendanceDTO {
	private int idEvent;
	private String idUser;

	public AttendanceDTO(int idEvent, String idUser) {
		this.idEvent = idEvent;
		this.idUser = idUser;
	}

	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	
}
