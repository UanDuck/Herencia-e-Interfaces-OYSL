package com.mycompany.ejemplointerfaz;

public class Consola extends Aparato{
    private String nombre;
    private String marca;

    public Consola(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Consola{" + "nombre=" + nombre + ", marca=" + marca + '}';
    }
}
