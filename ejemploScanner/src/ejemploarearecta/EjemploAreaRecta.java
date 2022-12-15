
package ejemploarearecta;

import java.util.Scanner;


public class EjemploAreaRecta {
    public static void main(String[] args) {
        //proyecto que calcula el area de un rectangulo de base = 2 y altura = 5
        float base , altura ; // son variables locales
        Scanner obxScanner = new Scanner(System.in); // instanciamos un objeto con new
        System.out.println("teclea base");
        base=obxScanner.nextFloat();
        System.out.println("teclea altura");
        altura = obxScanner.nextFloat();
        float area = base*altura;
        System.out.println("El área es = "+area);
        
        
        
        
    }
    
}
