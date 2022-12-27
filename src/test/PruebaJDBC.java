package test;

import java.sql.*;
import java.util.List;

import dao.modelo.ActorDao;
import dao.modelo.ActorDao;
import dao.modelo.ConexionFinal;
import dao.modelo.entidades.ActorDTO;

public class PruebaJDBC {

    public static void main(String[] args) throws Exception {

     System.out.println("LISTADO de actores: ");	     
     	Connection conexion =null;
        try {
            conexion = ConexionFinal.getConnection();

            ActorDao actorDAO = new ActorDao(conexion);
            
            List<ActorDTO> actores = actorDAO.select();
            
            for(ActorDTO actor: actores){
                System.out.println("Usuario DTO:" + actor);
            }
            
         
        
        System.out.println("\n\nINSERCIÓN de actores: ");
        System.out.println("Nuevo actor: Antonio López antonio@gmail.com");
        	        
        
           // ActorDTO nuevoActor= new ActorDTO("Antonio","López","antonio@gmail.com");
            //actorDAO.insert(nuevoActor);
            
            System.out.println("\n\nLISTADO ACTUALIZADO de actores: ");
             
            
           actores=actorDAO.select();
            
            for(ActorDTO actor: actores){
                System.out.println("Usuario DTO:" + actor);
            }
            
         } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        }
         

    }
}
