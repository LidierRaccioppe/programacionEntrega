
package boletin_6_1;

public class Boletin_6_1 {

    public static void main(String[] args) {
        Coche obj1 = new Coche();
        obj1.acelerar(300);
        obj1.frenar(250);
        int muestrate = obj1.getVelocidad();
        System.out.println("prueba "+ muestrate);
    }
}
