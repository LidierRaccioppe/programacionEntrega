package boletin6_3;

public class Boletin6_3 {
    public static void main(String[] args) {
        Circulo obj1 = new Circulo ();
        obj1.setRadio(80);
        obj1.getRadio();
        obj1.calcularArea();
        obj1.calcularLongitud();
        System.out.println("tu radio = "+obj1.getRadio()+"area = "+obj1.calcularArea()+"\nlongitud = "+obj1.calcularLongitud());
    }
}
