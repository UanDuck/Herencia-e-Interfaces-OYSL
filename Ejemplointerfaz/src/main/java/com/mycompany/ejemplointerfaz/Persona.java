package com.mycompany.ejemplointerfaz;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public String presionaBoton(Television t) {
        return new ControlRemoto(){
            @Override
            public String encenderPresionado(Aparato a) {
            return a.encender();
            }    
        }.encenderPresionado(t);
    }
}
