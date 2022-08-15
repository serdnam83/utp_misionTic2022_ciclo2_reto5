
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
public class ComprasDao {
    
    public void comprasConsulta (DefaultTableModel modelo) throws ClassNotFoundException{
        
        ComprasVo compras = new ComprasVo();
        
        try {
            // establecer conexion con la base de datos
            Conexion conexion = new Conexion();
            Connection conn = conexion.conectar();
            
            // cadena de consulta
            String sql = "SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado" 
                       + " FROM Compra c" 
                       + " JOIN Proyecto p ON(c.ID_Proyecto = p.ID_Proyecto)" 
                       + " WHERE c.Proveedor = 'Homecenter'" 
                       + " AND p.ciudad = 'Salento'";
            Statement query = conn.createStatement();
            ResultSet respuesta = query.executeQuery(sql);
            
            while (respuesta.next()) {
                compras.setID_compra(respuesta.getInt(1));
                compras.setConstructora(respuesta.getString(2));
                compras.setBanco_vinculado(respuesta.getString(3));
                
                // adicionar informacion traida de la base de datos a la tabla o grilla                
                modelo.addRow(new Object[]{compras.getID_compra(), compras.getConstructora(), compras.getBanco_vinculado()});
            }         
            
            // cerrar conexiones
            respuesta.close();
            query.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }        
    
    }    
}
