
package boletinextra1_2;

import java.util.Scanner;

public class Boletinextra1_2 {

    public static void main(String[] args) {
        double a, b, c, x;
        Scanner obxScanner= new Scanner( System.in);
        System.out.println("Ingrese el valor de a");
        a=obxScanner.nextDouble();
        System.out.println("Ingrese el valor de b");
        b=obxScanner.nextDouble();
        System.out.println("Ingrese el valor de c");
        c=obxScanner.nextDouble();
        System.out.println("Ingrese el valor de x");
        x=obxScanner.nextDouble();
        System.out.println("el resultado es = "+(a*Math.pow(x, 2)+b*x+c));
    }
    
}
