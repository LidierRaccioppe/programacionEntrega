package boletin7_4;
import java.util.Scanner;
public class Boletin7_4 {
    public static void main(String[] args) {
        String nom1;
        
        float pes1;
        float pes2;
        cuatro obj1 = new cuatro();
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la primera pesona");
        nom1 = objScanner.nextLine();
        System.out.println("Ingrese el peso de la primera pesona");
        pes1 = objScanner.nextFloat();
        System.out.println("Ingrese el nombre de la segunda pesona");
        String nom3 = objScanner.nextLine();
        String nom4 = objScanner.nextLine();
        System.out.println("Ingrese el peso de la segunda pesona");
        pes2 = objScanner.nextFloat();
        obj1.peso(nom1, pes1, nom4, pes2);
    }
}