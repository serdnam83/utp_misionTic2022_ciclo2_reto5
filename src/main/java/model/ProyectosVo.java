
package model;

/**
 *
 * @author andres
 */
public class ProyectosVo {
    private Integer ID_proyecto;
    private String constructora;
    private Integer numero_habitaciones;
    private String ciudad;
 
    public Integer getID_proyecto() {
        return ID_proyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public Integer getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setID_proyecto(Integer ID_proyecto) {
        this.ID_proyecto = ID_proyecto;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public void setNumero_habitaciones(Integer numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "ProyectosVo{" + "ID_proyecto=" + ID_proyecto + ", constructora=" + constructora + ", numero_habitaciones=" + numero_habitaciones + ", ciudad=" + ciudad + '}';
    }    
    
}
