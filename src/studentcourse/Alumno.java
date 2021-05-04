/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcourse;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Wi7o
 */
public class Alumno {
    public int legajo;
    public String apellido;
    public String nombre;
    
   Map<String, Integer> course = new HashMap<String, Integer>();
    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        course.put(m.getNombre(), this.legajo);
        System.out.println("Se añadió: "+ course.get(m.getNombre()));
    }
    
    public int cantidadMaterias(){
        System.out.println("Cantidad de materias: "+ course.size());
        return course.size();
    }
}
