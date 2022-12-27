package dao.modelo.entidades;


public class AdminDTO{

	private ActorDTO actor;

	public AdminDTO(ActorDTO actor) {
		this.actor=actor;
	}
	
	public ActorDTO getActor() {
		return actor;
	}

	public void setActor(ActorDTO actor) {
		this.actor = actor;
	}


		
}
