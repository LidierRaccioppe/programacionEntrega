
package boletin.pkg2.pkg3;

import java.util.Scanner;

public class Boletin23 {

    public static void main(String[] args) {
        double euros, valorCambio;
        Scanner obxScanner = new Scanner(System.in);
        System.out.println("ingrese su euros a cambiar");
        euros=obxScanner.nextDouble();
        System.out.println("ingrese el valor de cambio actual");
        valorCambio=obxScanner.nextDouble();
        System.out.println("su cambio es de "+euros*valorCambio);
    }
}
