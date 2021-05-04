/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcourse;

import java.util.ArrayList;

/**
 *
 * @author Wi7o
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Materia i = new Materia(1, "Ingles I", 1);
        Materia m = new Materia(2, "Matemáticas", 1);
        Materia l = new Materia(3, "Laboratorio I", 1);
        
        Alumno lopez = new Alumno(1001, "López", "Martin");
        Alumno martinez = new Alumno(1002, "Martínez", "Brenda");
        
        lopez.agregarMateria(i);
        lopez.agregarMateria(m);
        lopez.agregarMateria(l);
        
        martinez.agregarMateria(i);
        martinez.agregarMateria(m);
        martinez.agregarMateria(l);
        martinez.agregarMateria(l);
        
        lopez.cantidadMaterias();
        martinez.cantidadMaterias();
        
    }
    
}
