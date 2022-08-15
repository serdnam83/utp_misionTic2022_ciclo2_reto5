
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import util.Conexion;

/**
 *
 * @author andres
 */
public class LiderDao {
    
    public void liderConsulta (DefaultTableModel modelo) throws ClassNotFoundException {
        
        LiderVo lider = new LiderVo();
        
        try {
            // establecer conexion con la base de datos
            Conexion conexion = new Conexion();
            Connection conn = conexion.conectar();
            
            // cadena de consulta
            String sql = "SELECT ID_lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia";
            Statement query = conn.createStatement();
            ResultSet respuesta = query.executeQuery(sql);
            
            while (respuesta.next()) {
                lider.setId_lider(respuesta.getInt(1));
                lider.setNombre(respuesta.getString(2));
                lider.setPrimer_apellido(respuesta.getString(3));
                lider.setCiudad_residencia(respuesta.getString(4));
                
                // adicionar informacion traida de la base de datos a la tabla o grilla                
                modelo.addRow(new Object[]{lider.getId_lider(), lider.getNombre(), lider.getPrimer_apellido(), lider.getCiudad_residencia()});
            }
            
            
            
            
            // cerrar conexiones
            respuesta.close();
            query.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }        
    
    }    
    
}
