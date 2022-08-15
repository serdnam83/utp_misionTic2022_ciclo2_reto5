
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andres
 */
public class Conexion {
    
      Connection conectar = null;
    
    public Connection conectar() throws ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:ProyectosConstruccion.db");
        }catch (SQLException e) {
            System.out.println(e);
        }
        return conectar;
    } 
}
  