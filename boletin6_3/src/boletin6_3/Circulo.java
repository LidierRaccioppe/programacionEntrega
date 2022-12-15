package boletin6_3;

public class Circulo {
    private double radio;
    final static double PI=3.14;
    
    public Circulo(){}
    public Circulo (double radi){
        radio = radi;
    }
    public void setRadio(double a){
        radio = a;
    }
    public double getRadio(){
        return radio;
    }
    public double calcularArea(){
        return Math.pow(radio, 2)*PI;
    }
    public double calcularLongitud(){
        return 2*PI*radio;
    }
}
