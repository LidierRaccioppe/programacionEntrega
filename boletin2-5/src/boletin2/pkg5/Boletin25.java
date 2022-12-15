
package boletin2.pkg5;

import java.util.Scanner;

public class Boletin25 {

    public static void main(String[] args) {
        double metros;
        Scanner obxScanner = new Scanner(System.in);
        System.out.println("Ingrese su metros a cambiar");
        metros=obxScanner.nextDouble();
        System.out.println("sus millas son = "+metros*1852);
    }
    
}
