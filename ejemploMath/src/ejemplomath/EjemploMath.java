
package ejemplomath;

import static java.lang.Math.PI;
import java.util.Scanner;

public class EjemploMath {

    public static void main(String[] args) {
        // programa que calcuala longitud y area de una circunferencia
        System.out.println("Ingrese el radio de tu cirfuneferencia");
        Scanner obxScanner = new Scanner(System.in);
        float radio =obxScanner.nextFloat() ;
        double longitud = 2*Math.PI*radio;
        /* tomamos la longitud como float
        float lon= (float) (2*Math.PI*raidio*/
        float area = (float) (Math.PI*Math.pow(radio,2));
        System.out.println("longitud = " +longitud+ " \n area = " +area);
 

    }
    
}
