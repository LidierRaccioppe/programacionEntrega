
package boletinextra1_3;

import java.util.Scanner;

public class Boletinextra1_3 {

    public static void main(String[] args) {
        double a, b, c, delta;
        System.out.println("Ingresar el valor de a");
        Scanner obxScanner= new Scanner( System.in);
        a=obxScanner.nextDouble();
        System.out.println("Ingresar el valor de b");
        b=obxScanner.nextDouble();
        System.out.println("Ingresar el valor de c");
        c=obxScanner.nextDouble();
        //System.out.println("tu reslutado positivo es = "+ ((b+((Math.pow(Math.pow(b, 2)-4*a*c), 0.5)))/2*a) + "\ntu resultado negativo es = "+ (b-((Math.pow((Math.pow(b, 2)-4*a*c), 0.5)/2*a)));
    }
}