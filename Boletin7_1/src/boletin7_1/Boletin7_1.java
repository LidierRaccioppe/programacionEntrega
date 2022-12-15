package boletin7_1;
import java.util.Scanner;
public class Boletin7_1 {
    public static void main(String[] args) {
        double num;
        Scanner obxScanner = new Scanner(System.in);
        uno obj1 = new uno();
        System.out.println("Ingrese su número");
        num=obxScanner.nextDouble();
        obj1.uno(num);
    }
}