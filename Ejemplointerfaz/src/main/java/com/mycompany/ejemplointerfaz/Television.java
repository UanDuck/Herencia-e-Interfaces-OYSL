package com.mycompany.ejemplointerfaz;

public class Television extends Aparato{
    private String marca;
    private int tamanio;
    private String fabricante;

    public Television(String marca, int tamanio, String fabricante) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Television{" + "marca=" + marca + ", tamanio=" + tamanio + ", fabricante=" + fabricante + '}';
    }
}
