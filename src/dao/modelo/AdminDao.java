package dao.modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import dao.modelo.entidades.ActorDTO;
import dao.modelo.entidades.AdminDTO;

public class AdminDao implements InterfaceDao<AdminDTO> {

	private Connection conexion;
	
	
	public AdminDao() {
	}
	
	public AdminDao(Connection conexion) {
		this.conexion = conexion;
	}

	@Override
	public List<AdminDTO> select() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(AdminDTO t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<AdminDTO> get(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(AdminDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(AdminDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
