
package boletin_5;

public class Boletin_5 {

    public static void main(String[] args) {
        consumo obj1 = new consumo();
        obj1.setlitros(50);
        obj1.setpGas(1.57);
        
        consumo obj2 = new consumo(200, 12, 60,1.5);
        
        double consumoMedios = obj2.consumoMedio();
        System.out.println("el cMed"+consumoMedios);
        obj2.setlitros(80);
        System.out.println("la vMed"+obj2.vMed);
    }
    
}
