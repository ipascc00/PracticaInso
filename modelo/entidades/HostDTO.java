package modelo.entidades;

public class HostDTO {
	
	private ActorDTO actor;
	
	public HostDTO(ActorDTO actor) {
		this.actor=actor;
	}

	public ActorDTO getActor() {
		return actor;
	}

	public void setActor(ActorDTO actor) {
		this.actor = actor;
	}

}
