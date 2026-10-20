
package com.orlando.ejercicio_2_1;

public class Alumno extends Persona{
    public Alumno(){
        super();
        System.out.println("Se crea ALumno...");
    }
    @Override
    public String toString(){
        return "Un alumno llamado: "+nombre;
    }
    
}
