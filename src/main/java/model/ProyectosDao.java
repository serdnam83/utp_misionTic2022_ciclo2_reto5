
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
public class ProyectosDao {
    
    public void proyectosConsulta (DefaultTableModel modelo) throws ClassNotFoundException{
        
        ProyectosVo proyectos = new ProyectosVo();
        
        try {
            // establecer conexion con la base de datos
            Conexion conexion = new Conexion();
            Connection conn = conexion.conectar();
            
            // cadena de consulta
            String sql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad" 
                       + " FROM Proyecto"
                       + " WHERE Clasificacion = 'Casa Campestre'" 
                       + " AND Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla')";
            Statement query = conn.createStatement();
            ResultSet respuesta = query.executeQuery(sql);
            
            while (respuesta.next()) {
                proyectos.setID_proyecto(respuesta.getInt(1));
                proyectos.setConstructora(respuesta.getString(2));
                proyectos.setNumero_habitaciones(respuesta.getInt(3));
                proyectos.setCiudad(respuesta.getString(4));

                                
                // adicionar informacion traida de la base de datos a la tabla o grilla                
                modelo.addRow(new Object[]{proyectos.getID_proyecto(), proyectos.getConstructora(), proyectos.getNumero_habitaciones(), proyectos.getCiudad()});
            }         
            
            // cerrar conexiones
            respuesta.close();
            query.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }        
    
    }    
    
}
