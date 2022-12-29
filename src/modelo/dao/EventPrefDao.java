package modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import modelo.entidades.EventDTO;
import modelo.entidades.EventPrefDTO;

public class EventPrefDao implements InterfaceDao<EventPrefDTO> {

	private Connection conexion;
	
	public EventPrefDao() {
	}

	public EventPrefDao(Connection conexion) {
		this.conexion = conexion;
	}

	@Override
	public List<EventPrefDTO> select() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(EventPrefDTO t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<EventPrefDTO> get(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(EventPrefDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(EventPrefDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

}

