package dao.modelo;

import java.sql.*;

public class ConexionFinal {
    private static  String JDBC_URL = "jdbc:mysql://localhost:3306/fiesteceamev3";
    private static  String JDBC_USER = "root";
    private static String JDBC_PASS = "Ivan2000.";
   
    public static Connection getConnection() {
     try {    	 
    	return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    	}
     catch (SQLException e){
    		e.printStackTrace(System.out);
    	}
	 return null;
    }
    
    
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }



	public static void close(ResultSet rs) {
		 try {
	            rs.close();
	        } catch (SQLException ex) {
	           ex.printStackTrace(System.out);
	        }
		
	}



	public static void close(PreparedStatement stmt) {
		try {
            stmt.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }		
	}
    
}
