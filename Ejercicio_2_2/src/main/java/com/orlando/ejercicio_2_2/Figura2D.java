
package com.orlando.ejercicio_2_2;

public abstract class Figura2D implements FiguraPlana{
    public Figura2D(){
        System.out.println("Se imprime una FiguraPlana...");
    }
    
    protected abstract String imprimeFigura();
}
