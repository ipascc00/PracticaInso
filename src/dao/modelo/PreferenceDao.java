package dao.modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import dao.modelo.entidades.PreferenceDTO;

public class PreferenceDao implements InterfaceDao<PreferenceDTO> {

	private Connection conexion;
	
	public PreferenceDao() {
	}

	public PreferenceDao(Connection conexion) {
		this.conexion = conexion;
	}

	@Override
	public List<PreferenceDTO> select() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(PreferenceDTO t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<PreferenceDTO> get(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(PreferenceDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(PreferenceDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

}

