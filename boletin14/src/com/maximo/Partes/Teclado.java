package com.maximo.Partes;
public class Teclado {
    private String marcas;
    public Teclado(){
    }
    public Teclado(String marcas) {
        this.marcas = marcas;
    }

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marcas=" + marcas + '}';
    }
    
    
    
    
}