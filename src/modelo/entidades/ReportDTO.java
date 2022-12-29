package modelo.entidades;

public class ReportDTO {

	private int idReport;
	private int idEvent;
	private String idUser;
	private String annotation;
	
	public ReportDTO(int idReport, int idEvent, String idUser, String annotation) {
		this.idReport = idReport;
		this.idEvent = idEvent;
		this.idUser = idUser;
		this.annotation = annotation;
	}
	
	public int getIdReport() {
		return idReport;
	}
	public void setIdReport(int idReport) {
		this.idReport = idReport;
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
	public String getAnnotation() {
		return annotation;
	}
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	
	
}
