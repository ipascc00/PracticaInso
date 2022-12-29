package modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import modelo.entidades.UserPrefDTO;

public class UserPrefDao implements InterfaceDao<UserPrefDTO> {

	private Connection conexion;
	
	public UserPrefDao() {
	}

	public UserPrefDao(Connection conexion) {
		this.conexion = conexion;
	}

	@Override
	public List<UserPrefDTO> select() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(UserPrefDTO t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<UserPrefDTO> get(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(UserPrefDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(UserPrefDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

}



