
package boletin3_4ant;

import java.util.Scanner;

public class Boletin3_4ant {

    public static void main(String[] args) {
        int dinero;
        System.out.println("Ingrese su dinero");
        Scanner obxScanner = new Scanner(System.in);
        dinero=obxScanner.nextInt();
        System.out.println("sus billetes de 100 son = "+(dinero/100)+"\nsus billetes de 20 son = "+((dinero-(dinero/100)*100)/20)+"\nsus billetes de 5 son = "+((dinero-dinero/100*100-(dinero-(dinero/100)*100)/20*20)/5)+"\nsus monedas de 1 son = "+(dinero-dinero/100*100-(dinero-(dinero/100)*100)/20*20-(dinero-dinero/100*100-(dinero-(dinero/100)*100)/20*20)/5*5));
    }
    
}
