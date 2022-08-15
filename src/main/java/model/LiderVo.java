/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author andres
 */
public class LiderVo {
    private Integer id_lider;
    private String nombre;
    private String primer_apellido;
    private String ciudad_residencia;

    
    public Integer getId_lider() {
        return id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public String getCiudad_residencia() {
        return ciudad_residencia;
    }

    public void setId_lider(Integer id_lider) {
        this.id_lider = id_lider;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public void setCiudad_residencia(String ciudad_residencia) {
        this.ciudad_residencia = ciudad_residencia;
    }

    @Override
    public String toString() {
        return "LiderDao{" + "id_lider=" + id_lider + ", nombre=" + nombre + ", primer_apellido=" + primer_apellido + ", ciudad_residencia=" + ciudad_residencia + '}';
    }
    
}
