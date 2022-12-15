package boletin8_2;
import java.util.Scanner;
public class siete {

    public void area(int valor) {
        double horizontal;
        double vertical;
        Scanner obj = new Scanner(System.in);

        switch (valor) {


            case 1:
                System.out.println("Ingrese el lado");
                horizontal= obj.nextDouble();
                System.out.println("tu area es "+horizontal*horizontal);
                break;
            case 2:
                System.out.println("Ingrese la base");
                horizontal= obj.nextDouble();
                System.out.println("Ingrese la altura");
                vertical= obj.nextDouble();
                System.out.println("tu area es "+vertical*horizontal/2);
                break;
            case 3:
                System.out.println("Ingrese el radio");
                horizontal= obj.nextDouble();
                System.out.println("tu area es "+horizontal*2*3.14);
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
    }
    }
}