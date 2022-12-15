package boletin7_5;
public class Cinco {
    public void Cinco(float num1, float num2, float num3){
        if(num1>num2&&num1>num3) System.out.println("El mayor es primero = " +num1);
        else if(num2>num1&&num2>num3)System.out.println("El mayor es el segundo = " +num2);
        else System.out.println("El mayor es el tercero = " +num3);
    }
}