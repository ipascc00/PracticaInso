package dao.modelo.entidades;

public class RateDTO {
	private String idUser;
	private int starsRate;
	private int idEvent;
	private String commentRate;
	public RateDTO(String idUser, int starsRate, int idEvent, String commentRate) {
		this.idUser = idUser;
		this.starsRate = starsRate;
		this.idEvent = idEvent;
		this.commentRate = commentRate;
	}
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public int getStarsRate() {
		return starsRate;
	}
	public void setStarsRate(int starsRate) {
		this.starsRate = starsRate;
	}
	public int getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}
	public String getCommentRate() {
		return commentRate;
	}
	public void setCommentRate(String commentRate) {
		this.commentRate = commentRate;
	}

	
}
