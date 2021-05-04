/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcourse;

/**
 *
 * @author Wi7o
 */
public class Materia {
    public int idMateria;
    public String nombre;
    public int anio;
    
    public Materia(int name, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }
    
    public int getIdMateria() {
        return idMateria;
    }
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
