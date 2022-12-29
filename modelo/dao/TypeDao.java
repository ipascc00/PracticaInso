package modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import modelo.entidades.TypeDTO;

public class TypeDao implements InterfaceDao<TypeDTO> {

	private Connection conexion;
	
	public TypeDao() {
	}

	public TypeDao(Connection conexion) {
		this.conexion = conexion;
	}

	@Override
	public List<TypeDTO> select() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(TypeDTO t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<TypeDTO> get(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(TypeDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(TypeDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

}



