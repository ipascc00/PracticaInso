package modelo.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import modelo.conexion.ConexionFinal;
import modelo.entidades.ActorDTO;

public class ActorDao implements InterfaceDao<ActorDTO>{

    private Connection conexion;

    private static final String SQL_SELECT = "SELECT idActor, actorName, actorSurname, email, password, type, phoneNumber FROM fiesteceamev3.Actors";
    private static final String SQL_INSERT = "INSERT INTO Actors(idActor, actorName, actorSurname, password, email, type, phoneNumber) VALUES(?, ?, ?, ?, ?, ?)";

    public ActorDao() {

    }

    public ActorDao(Connection conexion) {
        this.conexion = conexion;
    }

    public List<ActorDTO> select() throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ActorDTO usuario = null;
        List<ActorDTO> usuarios = new ArrayList<ActorDTO>();

        try {
            conn = this.conexion != null ? this.conexion : ConexionFinal.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
            	String idActor = rs.getString("idActor");
                String nombre = rs.getString("actorName");
                int type= rs.getInt("Type");
                String apellidos = rs.getString("actorSurname");
                String email = rs.getString("email");
                String password= rs.getString("password");
                String phoneNumber= rs.getString("phoneNumber");
               // usuario = new ActorDTO(idActor, type, nombre, apellidos, email, password, phoneNumber);
                
                usuarios.add(usuario);
            }
        } finally {
            ConexionFinal.close(rs);
            ConexionFinal.close(stmt);
            if (this.conexion == null) {
                ConexionFinal.close(conn);
            }

        }

        return usuarios;
    }

    public int insert(ActorDTO t) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexion != null ? this.conexion : ConexionFinal.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, "x001");
            stmt.setString(2, t.getNombre());
            stmt.setString(3, t.getApellidos());
            stmt.setString(4, "Ajajajajaj");
            stmt.setString(5, t.getEmail());
            stmt.setInt(6, 0);
            rows = stmt.executeUpdate();
            
            System.out.println("ejecutando query:" + SQL_INSERT);
         } finally {
            ConexionFinal.close(stmt);
            if (this.conexion == null) {
                ConexionFinal.close(conn);
            }
        }

        return rows;
    }

	@Override
	public Optional<ActorDTO> get(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(ActorDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(ActorDTO t) {
		// TODO Auto-generated method stub
		return 0;
	}




//   
}
