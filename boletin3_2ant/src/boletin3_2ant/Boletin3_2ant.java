
package boletin3_2ant;

import java.util.Scanner;

public class Boletin3_2ant {

    public static void main(String[] args) {
        double celsius;
        System.out.println("Ingrese los celsius");
        Scanner obxScanner = new Scanner(System.in);
        celsius=obxScanner.nextDouble();
        System.out.println("sus kelvins son = "+(celsius+273.15)+ "\ny sus fahre son = "+ (celsius*1.8+32));
    }
    
}
