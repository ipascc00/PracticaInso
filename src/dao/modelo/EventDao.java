package dao.modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import dao.modelo.entidades.EventDTO;
import dao.modelo.entidades.HostDTO;

public class EventDao implements InterfaceDao<EventDTO> {

	private Connection conexion;
	
	public EventDao() {
	}

	public EventDao(Connection conexion) {
		this.conexion = conexion;
	}

	@Override
	public List<EventDTO> select() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(EventDTO t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<EventDTO> get(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(EventDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(EventDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
