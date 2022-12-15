package boletin11_3nuevo;
import java.util.Scanner;
public class Boletin11_3nuevo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base=sc.nextInt();
        while(base<=0){
            System.out.println("esta mal la base, ingrese la de nuevo");
            base=sc.nextInt();
        }
        int altura=sc.nextInt();
        while(altura<=0){
            System.out.println("esta mal la altura, ingrese la de nuevo");
            altura=sc.nextInt();
        }
        System.out.println("Tu área es "+base*altura/2);
    }
}