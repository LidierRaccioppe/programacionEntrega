package boletin8_2;
import java.util.Scanner;
public class Boletin8_2 {
    public static void main(String[] args) {
        int valor;
        System.out.println("ingrese el numero de la figura");
        Scanner sc = new Scanner(System.in);
        siete obj = new siete();
        valor = sc.nextInt();
        obj.area(valor);
    }
}