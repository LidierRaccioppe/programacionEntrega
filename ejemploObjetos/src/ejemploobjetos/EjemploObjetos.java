
package ejemploobjetos;

import java.util.Scanner;

public class EjemploObjetos {

    public static void main(String[] args) {
        float base, altura;
        
        /*Rectangulo obxRec1 = new Rectangulo();
        float resultado = obxRec1.calcularArea(2, 3.0f);
        System.out.println("area = "+ resultado);
        obxRec1.calcularPerimetro(2, 3);
        //instancio objeto tipo rectangulo con el constructor parametrizado
        Rectangulo obxRec2 = new Rectangulo(5,8);
        float base=obxRec2.getBase();
        float altura=obxRec2.devolverValorAltura();
        
        
        
        float re= obxRec2.calcularArea(base, altura);
        System.out.println(" nuevo area = "+ re);*/
        Scanner obxScanner = new Scanner(System.in);
        System.out.println("Ingrese su base");
        base=obxScanner.nextFloat();
        System.out.println("Ingrese su altura");
        altura=obxScanner.nextFloat();
        Rectangulo obx3 = new Rectangulo (altura, base);
        
        
        
        
        }
   
    }
