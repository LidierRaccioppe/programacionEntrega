
package boletin_6_1;

public class Coche {
    private int velocidad ;

    public Coche(){
    velocidad =0 ;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public void acelerar (int valor){
        velocidad=velocidad+valor;
    }
    public void frenar (int menos){
        velocidad=velocidad-menos;
    }
}
