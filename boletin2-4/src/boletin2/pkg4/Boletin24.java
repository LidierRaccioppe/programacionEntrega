
package boletin2.pkg4;

import java.util.Scanner;

public class Boletin24 {

    public static void main(String[] args) {
        double num1, num2;
        Scanner obxScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1=obxScanner.nextDouble();
        System.out.println("Ingrese un numero");
        num2=obxScanner.nextDouble();
        System.out.println("resta = "+(num1-num2) + "\nsuma = "+(num1+num2) + "\nmultiplicacion = "+(num1*num2) + "\ndivision = "+(num1/num2));
        
    }
    
}
