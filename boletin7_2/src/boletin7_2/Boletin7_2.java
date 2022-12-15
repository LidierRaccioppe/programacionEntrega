package boletin7_2;

import java.util.Scanner;

public class Boletin7_2 {
    public static void main(String[] args) {
        Scanner obxScanner = new Scanner(System.in);
        Dos obj1 = new Dos();
        short a, b;
        System.out.println("Ingrese un número");
        a=obxScanner.nextShort();
        System.out.println("Ingrese otro número");
        b=obxScanner.nextShort();
        obj1.Dos(a, b);
    }
}
