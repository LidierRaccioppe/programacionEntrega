package boletin7_5;

import java.util.Scanner;

public class Boletin7_5 {
    public static void main(String[] args) {
        float num1, num2, num3;
        Cinco obj1 = new Cinco();
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1 = objScanner.nextFloat();
        System.out.println("Ingrese otro numero");
        num2 = objScanner.nextFloat();
        System.out.println("Ingrese aun otro numero");
        num3 = objScanner.nextFloat();
        obj1.Cinco(num1, num2, num3);
    }
}