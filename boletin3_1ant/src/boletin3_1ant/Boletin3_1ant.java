
package boletin3_1ant;

import java.util.Scanner;

public class Boletin3_1ant {

    public static void main(String[] args) {
        double total, pagado;
        System.out.println("Ingrese el precio total");
        Scanner obxScanner = new Scanner(System.in);
        total=obxScanner.nextDouble();
        System.out.println("Ingrese su precio pagado");
        pagado=obxScanner.nextDouble();
        System.out.println("tu porcentaje es = "+ (100-(pagado/total*100)));
    }
}    