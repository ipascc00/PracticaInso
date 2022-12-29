package modelo.dao;

public class ActorDTO {
    
    private String idActor;
    private String nombre;
    private String apellidos;
    private String email;

    public ActorDTO(String idActor, String nombre, String apellidos, String email) {
		this.idActor=idActor;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.email=email;
	}
    
    public ActorDTO(String nombre, String apellidos, String email) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.email=email;
	}

	public String getIdActor() {
        return idActor;
    }

    public void setId_persona(String idActor) {
        this.idActor = idActor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  

    @Override
    public String toString() {
        return "Actor{" + "idActor=" + idActor + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + '}';
    }
    
    
}
