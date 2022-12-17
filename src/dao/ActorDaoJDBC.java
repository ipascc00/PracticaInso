package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import dao.modelo.ActorDTO;

public class ActorDaoJDBC implements ActorDao{

    private Connection conexion;

    private static final String SQL_SELECT = "SELECT idActor, actorName, actorSurname, email FROM fiesteceamev3.Actors";
    private static final String SQL_INSERT = "INSERT INTO Actors(idActor, actorName, actorSurname, password, email, type) VALUES(?, ?, ?, ?, ?, ?)";

    public ActorDaoJDBC() {

    }

    public ActorDaoJDBC(Connection conexion) {
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
                String apellidos = rs.getString("actorSurname");
                String email = rs.getString("email");
               
                usuario = new ActorDTO(idActor, nombre, apellidos, email);
                
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

    public int insert(ActorDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexion != null ? this.conexion : ConexionFinal.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, "x001");
            stmt.setString(2, usuario.getNombre());
            stmt.setString(3, usuario.getApellidos());
            stmt.setString(4, "Ajajajajaj");
            stmt.setString(5, usuario.getEmail());
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

//   
}
