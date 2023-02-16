package ejarraylistobjetos;
public class Jugador implements Comparable{
    private String nombre;
    private int dorsal;
    public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }
    public Jugador() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    @Override
    public String toString() {
        return "nombre= " + nombre + ", dorsal= " + dorsal;
    }
    
    
    /*
    
    
    @Override
    public int compareTo(Object o) {
        Jugador j = (Jugador) o ;
        if (this.dorsal>j.dorsal) return 1;
        else if(this.dorsal<j.dorsal) return -1;
        else return 0;
    }
    
    */
    
    @Override
    public int compareTo(Object o){
        Jugador j = (Jugador) o ; // casteo de un objeto mas general a uno mas especifico
        if(this.nombre.compareToIgnoreCase(j.nombre)>0) return 1;
        else if(this.nombre.compareToIgnoreCase(j.nombre)<0) return -1;
        else return 0;
    }
}