package dao;

import java.sql.SQLException;
import java.util.List;

import dao.modelo.ActorDTO;

public interface ActorDao {
    
    public List<ActorDTO> select() throws SQLException, Exception;
    
    public int insert(ActorDTO actor) throws SQLException;
    
}
