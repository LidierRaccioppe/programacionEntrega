package ejarraylist;
import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
public class ListaEnteros {
    ArrayList <Integer> listaEntero = new ArrayList <Integer> ();
    public void añadir(){
        listaEntero.add(2);
        listaEntero.add(3);
        listaEntero.add(5);
    }
    public void mostrar(){
        System.out.println(listaEntero);
    }
    public void mostrarForEach(){
        for (int i = 0; i < listaEntero.size(); i++) {
            System.out.println(listaEntero);
        }
    }
    public void adicionYPosicionamiento(){
        boolean validar =true;
        do{
            listaEntero.add(parseInt(JOptionPane.showInputDialog("Ingrese la posicion del numero a ingresar")), parseInt(JOptionPane.showInputDialog("Ingrese el numero a ingresar")));
            validar = parseBoolean(JOptionPane.showInputDialog("ingrese true si quieres seguir ingresando numeros o false si no"));
        }while(validar==false);
    }
    public void adicion(){
        boolean validar =true;
        
        do{
        if (validar ==true){
            listaEntero.add(parseInt(JOptionPane.showInputDialog("Ingrese el numero a ingresar")));
        validar = parseBoolean(JOptionPane.showInputDialog("ingrese true si quieres seguir ingresando numeros o falso si no"));
        }
        
        }while(validar==false);
    }
    public void borracionSelectiva(){
        listaEntero.remove(parseInt(JOptionPane.showInputDialog("borracionSelectiva: Ingrese la posicion del numero a borrar")));
    }
    public void corroboracion(){
        listaEntero.contains(parseInt(JOptionPane.showInputDialog("corroboracion: Ingrese el numero para corroborar")));
    }
    public void borracionPrimero(){
        listaEntero.remove(Integer.valueOf(JOptionPane.showInputDialog("borracionPrimero: Ingrese el numero a borrar")));
    }
    public void ordenar(){
        Collections.sort(listaEntero);
    }
    public void ordenarInversamente(){
        Collections.sort(listaEntero, Collections.reverseOrder());
    }
    
    
}