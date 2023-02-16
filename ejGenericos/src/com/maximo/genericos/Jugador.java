package com.maximo.genericos;
public class Jugador implements Comparable{
    private String nombre;
    private int dorsal;
    public Jugador(){}
    public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nome) {
        this.nombre = nome;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    @Override
    public String toString() {
        return  nombre + " tiene o dorsal  " + dorsal;
    }
    
    @Override
    public int compareTo(Object o){
        Jugador j = (Jugador) o ; // casteo de un objeto mas general a uno mas especifico
        if(this.nombre.compareToIgnoreCase(j.nombre)>0) return 1;
        else if(this.nombre.compareToIgnoreCase(j.nombre)<0) return -1;
        else return 0;
    }
}