
package boletin3_3ant;

import java.util.Scanner;

public class Boletin3_3ant {

    public static void main(String[] args) {
        int cien, veinte, cinco, uno;
        System.out.println("Ingrese la cantidad de sus billetes de cien");
        Scanner obxScanner = new Scanner(System.in);
        cien=obxScanner.nextInt();
        System.out.println("Ingrese la cantidad de sus billetes de veinte");
        veinte=obxScanner.nextInt();
        System.out.println("Ingrese la cantidad de sus billetes de cinco");
        cinco=obxScanner.nextInt();
        System.out.println("Ingrese la cantidad de sus monedas de uno");
        uno=obxScanner.nextInt();
        System.out.println("sus dinero es = "+ (cien*100+veinte*20+cinco*5+uno));
    }
    
}
