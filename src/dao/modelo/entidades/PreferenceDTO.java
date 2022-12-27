package dao.modelo.entidades;

public class PreferenceDTO {
	
	private int idPreferences;
	private String name;
	private String description;
	
	public PreferenceDTO(int idPreferences, String name, String description) {
		this.idPreferences = idPreferences;
		this.name = name;
		this.description = description;
	}

	public int getIdPreferences() {
		return idPreferences;
	}

	public void setIdPreferences(int idPreferences) {
		this.idPreferences = idPreferences;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
