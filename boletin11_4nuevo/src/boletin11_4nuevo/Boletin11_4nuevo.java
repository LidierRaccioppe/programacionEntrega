package boletin11_4nuevo;
import java.util.Scanner;
public class Boletin11_4nuevo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num, mult=0, seguir=1;
        while(seguir!=0){
        System.out.println("Quieres seguir?, presiona 0 sino quieres seguir");
        seguir=sc.nextFloat();
        while(seguir!=0){
        System.out.println("Ingrese su numero");
        num=sc.nextFloat();
        for(int i=1;i<=10;i++){
            mult=num*i;
            System.out.println("El "+num+" por "+i+" es igual a "+mult);
        }
        }
        }
    }
}