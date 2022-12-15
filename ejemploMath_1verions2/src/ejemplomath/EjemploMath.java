
package ejemplomath;

import static java.lang.Math.PI;
import java.util.Scanner;

public class EjemploMath {
    public static final double PI= 3.14 ;

    public static void main(String[] args) {
        // programa que calcuala longitud y area de una circunferencia
        System.out.println("Ingrese el radio de tu cirfuneferencia");
        //declaracion de una constante
        Scanner obxScanner = new Scanner(System.in);
        float radio =obxScanner.nextFloat() ;
        double longitud = 2*PI*radio;
        float area = (float) (PI*Math.pow(radio,2));
        System.out.println("longitud = " +longitud+ " \n area = " +area);
 

    }
    
}
