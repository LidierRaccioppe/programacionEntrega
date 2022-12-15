package boletin14;

import com.maximo.Partes.*;

public class Ordenador {
    private Monitor mo= new Monitor(45f);
    private Teclado te = new Teclado("Ansus");
    private Cpu pro = new Cpu(15);
    private float precio; 
    public Ordenador(){
    }
    public Ordenador(Monitor mo, Teclado te, Cpu pro, float precio) {
        this.mo = mo;
        this.te = te;
        this.pro = pro;
        this.precio = precio;
    }

    public Monitor getMo() {
        return mo;
    }

    public void setMo(Monitor mo) {
        this.mo = mo;
    }

    public Teclado getTe() {
        return te;
    }

    public void setTe(Teclado te) {
        this.te = te;
    }

    public Cpu getPro() {
        return pro;
    }

    public void setPro(Cpu pro) {
        this.pro = pro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "mo=" + mo + ", te=" + te + ", pro=" + pro + ", precio=" + precio;
    }
    
    
    
    
    
    
    
    
    
    
}