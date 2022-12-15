
package boletin3_4ant;

import java.util.Scanner;

public class Boletin3_4ant {

    public static void main(String[] args) {
        int dinero, cien, veinte, cinco, uno;
        System.out.println("Ingrese su dinero");
        Scanner obxScanner = new Scanner(System.in);
        dinero=obxScanner.nextInt();
        cien= dinero/100 ;
        veinte=(dinero-cien*100)/20 ;
        cinco=(dinero-cien*100-veinte*20)/5 ;
        uno=dinero-cien*100-veinte*20-cinco*5 ;
        System.out.println("sus billetes de 100 son = "+cien+"\nsus billetes de 20 son = "+veinte+"\nsus billetes de 5 son = "+cinco+"\nsus monedas de 1 son = "+uno);
    }
    
}
