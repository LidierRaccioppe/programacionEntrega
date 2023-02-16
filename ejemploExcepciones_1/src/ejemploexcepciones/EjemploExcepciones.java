package ejemploexcepciones;
import java.util.Scanner;
public class EjemploExcepciones {
    public static void main(String[] args) {
        DividirExcepciones obj = new DividirExcepciones();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numerador de la division");
        int numeradoro = sc.nextInt();
        System.out.println("Ingrese el denominador de la division");
        int denominadoro = sc.nextInt();
        
        try{
        obj.dividirConNuestraExcepcion(numeradoro, denominadoro);
            System.out.println("resultado = "+ numeradoro/denominadoro);
        }catch(NuestraExcepcion ex){
            System.out.println("No dividir entre cero" + ex.toString());
                }
        System.out.println("Fin del Programa");
    }
}