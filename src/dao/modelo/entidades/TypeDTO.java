package dao.modelo.entidades;

public class TypeDTO {

		private int idType;
		private String nameType;
		
		public TypeDTO(int idType, String nameType) {
			this.idType = idType;
			this.nameType = nameType;
		}

		public int getIdType() {
			return idType;
		}

		public void setIdType(int idType) {
			this.idType = idType;
		}

		public String getNameType() {
			return nameType;
		}

		public void setNameType(String nameType) {
			this.nameType = nameType;
		}
		
		
		
}
