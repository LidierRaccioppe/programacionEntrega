package boletin12_2;

import javax.swing.JOptionPane;

public class Boletin12_2 {
    public static void main(String[] args) {
        
        int intentos=0, numJugadores, numero=0, paraVerif=0, numeroAdivinado=0;
        do{
        do{
        JOptionPane.showInputDialog("ingrese el numero a adivinar", numero);
        }while(numero>0&&numero<=50);
        do{
        JOptionPane.showInputDialog("ingrese el numero de intentos", intentos);
        JOptionPane.showInputDialog("ingrese el numero que crees que puso", numeroAdivinado);
        }while(intentos>0&&intentos<=50);
        int i=intentos;
        do{
            for(i=i; i<=intentos|numeroAdivinado!=numero;i++){
                //por terminar
                if(numeroAdivinado<numero)JOptionPane.showInputDialog("estas abajo", numeroAdivinado);
            else if(numeroAdivinado>numero)JOptionPane.showInputDialog("estas arriba", numeroAdivinado);
            }
            }while(numeroAdivinado!=numero);
        JOptionPane.showInputDialog("Adivinaste el numero, si quiere volver a jugar escriba 1 ", paraVerif);
        }while(paraVerif!=1);
        
        int p1= (int)(Math.random()*(50-1)+1);
        
        
        
        
        
    }
    
}
