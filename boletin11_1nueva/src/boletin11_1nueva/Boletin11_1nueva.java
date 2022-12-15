package boletin11_1nueva;
import java.util.Scanner;
public class Boletin11_1nueva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negativo=0, positivo=0, cero=0;
        for(float i=0;i<10;i++){
            float valor;
            
            System.out.println("Ingresa el número");
            valor=sc.nextFloat();
            if(valor<0)negativo++;
            else if(valor>0) positivo++;
            else cero++;
            if(i==9)System.out.println("Tus positivos son "+positivo+" tus negativos son "+negativo+"tus ceros son "+cero);
        }
    }
}