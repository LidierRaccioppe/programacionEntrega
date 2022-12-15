package ejemplobucles;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bucles {
    //escribe un programa que sume cinco numeros enteros 
    public static int primerEntero(){
        return Integer.parseInt(JOptionPane.showInputDialog("teclea numero"));
    }

    public void conWhile(){
        float numero, suma=0, intentos=0;
        Scanner obj = new Scanner(System.in);
        while(intentos<5){
        System.out.println("Ingrese un numero");
        numero = obj.nextFloat();
        suma= suma+numero;
        intentos++;
        }
         System.out.println("suma"+ suma);  
    }
    public void conDoWhile(){
        float num, intentos=0, suma=0;
        do{
            Scanner obj = new Scanner(System.in);
            System.out.println("Ingrese numero");
            num=obj.nextFloat();
            suma= num+ suma;
            intentos++;
        }while(intentos<5);
        System.out.println("suma"+suma);
        JOptionPane.showMessageDialog(null,"suma="+ suma);
        
    }
    public void conFor (){
    int num, suma=0;
    for(int i=0;i<5;i++){
    num= primerEntero();
    suma= suma+num;
    }
        System.out.println("suma = "+suma);
}
    
    public static int pedirNumero(int numero){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    


    
    
    

}

