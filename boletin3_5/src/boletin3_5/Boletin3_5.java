
package boletin3_5;

import java.util.Scanner;

public class Boletin3_5 {

    public static void main(String[] args) {
        double km, pago, move, venta;
        System.out.println("Ingrese su quilometraje");
        Scanner obxScanner = new Scanner(System.in);
        km=obxScanner.nextDouble();
        System.out.println("Ingrese su sueldo fijo");
        pago=obxScanner.nextDouble();
        System.out.println("Ingrese su total de ventas");
        venta=obxScanner.nextDouble();
        System.out.println("Ingrese su dias de movimiento");
        move=obxScanner.nextDouble();
        System.out.println("tu sueldo bruto es ="+ (pago-2*km-30*move-0.05*venta)+"\ntu sueldo liquido es = "+ ((pago-2*km-30*move-0.05*venta)-(pago-2*km-30*move-0.05*venta)*0.18-36));
    }
}