package dao.modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import dao.modelo.entidades.HostDTO;
import dao.modelo.entidades.UserDTO;

public class HostDao implements InterfaceDao<HostDTO>{

private Connection conexion;
	
	
	public HostDao() {
	}
	
	public HostDao(Connection conexion) {
		this.conexion = conexion;
	}
	@Override
	public List<HostDTO> select() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(HostDTO t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<HostDTO> get(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(HostDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(HostDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
