package com.orlando.ejercicio_2_2;

public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int alto, int ancho) {
        this.alto=alto;
        this.ancho=ancho;
    }
    @Override
    public double calcularArea(){
        return (ancho*alto)/2.0;
    }
    
    @Override
    public String imprimeFigura() {
        return String.format("Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f",alto,ancho,calcularArea(),calcularPerimetro());
    }

    @Override
    public double calcularPerimetro() {
        double hp=Math.sqrt((Math.pow(ancho,2))+(Math.pow(alto, 2)));
        return (ancho+alto+hp);
    }
    
}
