
package boletinextra1;

import java.util.Scanner;

public class Boletinextra1 {

    public static void main(String[] args) {
        double iva, inic;
        System.out.println("Ingrese el IVA");
        Scanner obxScanner = new Scanner(System.in);
        iva=obxScanner.nextDouble();
        System.out.println("Ingrese el precio inicial");
        inic=obxScanner.nextDouble();
        System.out.println("tu iva es = "+iva*inic/100+ "\ntu precio total es = "+(iva*inic/100+inic));
    }
    
}
