package ninaloquiso;

import java.util.Scanner;

public class Ninaloquiso {
    public static void main(String[] args) {
        //pide un numero y lo visualiza hasta que sea negativo
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = obj.nextInt();
        do {System.out.println("tu numero es "+ num); 
            num=num-1;
        } while (num >=0);
    }
}