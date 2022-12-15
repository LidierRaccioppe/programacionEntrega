package aplicacionlibreria;

import com.maximo.datos.PedirDatos;

public class AplicacionLibreria {
public static void main(String[] args) {
    String valor = PedirDatos.pedirString("teclea el nombre de tus carnes: ");
    System.out.println(valor);
    
    int valorInt = PedirDatos.pedirInt("teclea la edad de tus carnes: ");
    System.out.println(valorInt);
    
    
    }
    
}
