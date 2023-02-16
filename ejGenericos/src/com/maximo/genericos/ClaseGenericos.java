package com.maximo.genericos;
public class ClaseGenericos <T>{
    //atributo
    private T dato;
    
    //constructor
    public ClaseGenericos(){};
    
    
    //setters & getters
    public void setDato(T valor){
        dato = valor;
    }
    
    public T getDato(){
        return dato;
    }
}