package dao.modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import dao.modelo.entidades.RateDTO;

public class RateDao implements InterfaceDao<RateDTO> {

	private Connection conexion;
	
	public RateDao() {
	}

	public RateDao(Connection conexion) {
		this.conexion = conexion;
	}

	@Override
	public List<RateDTO> select() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(RateDTO t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<RateDTO> get(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(RateDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(RateDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

}

