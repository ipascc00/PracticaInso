package dao.modelo.entidades;
 import dao.modelo.entidades.TypeDTO;
public class ActorDTO{
    
    private String idActor;
    private String nombre;
    private String apellidos;
    private String email;
    private String password;
    private String phoneNumber;
	private TypeDTO type;
  

    public ActorDTO(String idActor, TypeDTO type, String nombre, String apellidos, String email, String password,  String phoneNumber) {
		this.idActor=idActor;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.email=email;
		this.password= password;
		this.phoneNumber= phoneNumber;
		this.type= type;
		
	}
    
	public String getIdActor() {
        return idActor;
    }

    public void setIdActor(String idActor) {
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

    public String getPassword() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


	public TypeDTO getType() {
		return type;
	}

	public void setType(TypeDTO type) {
		this.type = type;
	}




    @Override
    public String toString() {
        return "Actor{" + "idActor=" + idActor + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", password="+ password + ", telefono=" + phoneNumber + '}';
    }
    
    
}
