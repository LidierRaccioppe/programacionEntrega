package ejarraylistobjetos;
import com.maximo.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Metodos {
    public ArrayList<Jugador> añadir(ArrayList <Jugador> lista){
        Jugador ju = new Jugador(PedirDatos.pedirString("Nombre :"),PedirDatos.pedirInt("Dorsal : "));
        lista.add(ju);
        
        /*tambien se puede de esta forma
        
        lista.add(new Jugador(PedirDatos.pedirString("Nombre :"),PedirDatos.pedirInt("Dorsal : ")));
        
        */
        return lista;
    }
    public void mostrar1(ArrayList <Jugador> lista){
        System.out.println(lista);
    }
    public void mostrar2(ArrayList <Jugador> lista){
        // con for each
        for (Jugador elemento :lista) 
            System.out.println(elemento);
        
    }
    public void mostrar3(ArrayList <Jugador> lista){
        // con for
        for (int i = 0;i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
    public void mostrar4(ArrayList <Jugador> lista){
        // con interador
        Iterator it = lista.iterator();
        while(it.hasNext()){
            /*
            Jugador aux = (Jugador) it.next();
            System.out.println(aux);
            */
            System.out.println(it.next());
        }
    }
    public int buscarElemento(ArrayList <Jugador> lista){
        int posiccion = PedirDatos.pedirInt("Ingrese el dorsal a buscar");
        int encontrado = 0; // no se encontro
        for(Jugador elemento:lista){
            if(posiccion == elemento.getDorsal());{
                    System.out.println("El jugador se llama : "+elemento.getNombre());
                    encontrado =1;
                }
            if( encontrado ==0 ){
                System.out.println("Ese Jugador no esta en el equipo");
            }
        }
        return encontrado;
    }
    public void borrarPorNombre(ArrayList <Jugador> lista){
        String nombreABorrar = PedirDatos.pedirString("Ingrese el nombre de quien usted desea borrar");
        Iterator it = lista.iterator();
        Jugador ju;
        while(it.hasNext()){
            ju = (Jugador) it.next();
            if(ju.getNombre().equalsIgnoreCase(nombreABorrar))
                it.remove();
        }
    }
    public void borrar2(ArrayList <Jugador> lista){
        int encontrado = buscarElemento(lista);
        if (encontrado==1){
            String nombreABorrar = PedirDatos.pedirString("Ingrese el nombre de quien usted desea borrar");
        Iterator it = lista.iterator();
        Jugador ju;
        while(it.hasNext()){
            ju = (Jugador) it.next();
            if(ju.getNombre().equalsIgnoreCase(nombreABorrar))
                it.remove();
        }
        }
        else 
            System.out.println("No esta en el equipo");
    }
    public void ordenar (ArrayList <Jugador> lista){
        // ordenacion por el dorsal pikacho
        // este metodo buscara al metodo compareTo
        Collections.sort(lista);
    } // se puede cambiar entre si se ordena por dorsal o por nombre en la clase Jugador
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}