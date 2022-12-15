package boletin11_2nuevo;
public class Boletin11_2nuevo {
    public static void main(String[] args) {
        int suma=0;
        double factorial = 1;
    for (int i = 10; i <= 90; i++) {
        factorial = factorial * i;
        suma=suma+i;
    }
        System.out.println("producto es "+factorial+"\nsuma es "+suma);
    }
}