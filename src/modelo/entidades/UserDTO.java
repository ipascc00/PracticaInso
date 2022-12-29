package modelo.entidades;

public class UserDTO {

	private ActorDTO actor;
	
	public UserDTO(ActorDTO actor) {
		this.actor=actor;
	}

	public ActorDTO getActor() {
		return actor;
	}

	public void setActor(ActorDTO actor) {
		this.actor = actor;
	}


}
