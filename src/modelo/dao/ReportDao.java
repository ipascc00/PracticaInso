package modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import modelo.entidades.ReportDTO;

public class ReportDao implements InterfaceDao<ReportDTO> {

	private Connection conexion;
	
	public ReportDao() {
	}

	public ReportDao(Connection conexion) {
		this.conexion = conexion;
	}

	@Override
	public List<ReportDTO> select() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(ReportDTO t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<ReportDTO> get(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(ReportDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(ReportDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

}


