package dao.modelo;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import dao.modelo.entidades.ActorDTO;

public interface InterfaceDao<T> {

	public List<T> select() throws SQLException, Exception;

	public int insert(T t) throws SQLException;

	Optional<T> get(String param);

	public int update(T t);

	public int delete(T t);

}
