package modelo.entidades;

public class UserPrefDTO {
	
	private int idUserPref;
	private String idUser;
	private int idPreference;
	
	public UserPrefDTO(int idUserPref, String idUser, int idPreference) {
		this.idUserPref = idUserPref;
		this.idUser = idUser;
		this.idPreference = idPreference;
	}
	
	public int getIdUserPref() {
		return idUserPref;
	}
	public void setIdUserPref(int idUserPref) {
		this.idUserPref = idUserPref;
	}
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public int getIdPreference() {
		return idPreference;
	}
	public void setIdPreference(int idPreference) {
		this.idPreference = idPreference;
	}
	
	
}
