package ejarraylistobjetos;
import com.maximo.datos.PedirDatos;
import java.util.ArrayList;
public class EjArrayListObjetos {
    public static void main(String[] args) {
        ArrayList <Jugador> listajugante = new ArrayList<Jugador>();
        Metodos metod = new Metodos();
        int opcion;
        do{
            
        
        opcion = PedirDatos.pedirInt("***MENU***\n 1---> AÑADIR jUGANTE \n 2---> MOSTRAR\n 3---> MOSTRAR CADA UNO\n 4---> MOSTRAR FOR I\n"
                + " 5---> MOSTRAR ITERANTEMENTE\n 6---> BUSCAR ELEMENTANTE\n 7---> BORRAR\n 8---> ORDENAR\n");
        switch(opcion)
        {
            case 1 : metod.añadir(listajugante);
            break;
            case 2: metod.mostrar1(listajugante);
            break;
            case 3: metod.mostrar2(listajugante);
            break;
            case 4: metod.mostrar3(listajugante);
            break;
            case 5: metod.mostrar4(listajugante);
            break;
            case 6: metod.buscarElemento(listajugante);
            break;
            case 7: metod.borrar2(listajugante);
            break;
            case 8: metod.ordenar(listajugante);
            break;
            default : System.out.println("OPCION INCORRECTA");
            
            
        }
        }while (opcion>=1&&opcion<=8);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}