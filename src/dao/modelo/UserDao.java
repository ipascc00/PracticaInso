package dao.modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import dao.modelo.entidades.ActorDTO;
import dao.modelo.entidades.AdminDTO;
import dao.modelo.entidades.UserDTO;

public class UserDao implements InterfaceDao<UserDTO> {

	private Connection conexion;
	
	
	public UserDao() {
	}
	
	public UserDao(Connection conexion) {
		this.conexion = conexion;
	}

	@Override
	public List<UserDTO> select() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(UserDTO t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<UserDTO> get(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(UserDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(UserDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
