package pedidonina;
import java.util.Scanner;
public class Pedidonina {
    public static void main(String[] args) {
        float num;
        Ninaped obj = new Ninaped();
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0 y 99999");
        num = objScanner.nextFloat();
        obj.Ninaped(num);
    }
}