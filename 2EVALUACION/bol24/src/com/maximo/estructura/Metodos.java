package com.maximo.estructura;
import com.maximo.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Metodos {
    public ArrayList<Libro> añadir(ArrayList<Libro>lista){
        Libro li = new Libro(PedirDatos.pedirString("Titulo :"),PedirDatos.pedirString("Autor :"),PedirDatos.pedirString("ISBN :"),PedirDatos.pedirInt("Precio :"),PedirDatos.pedirInt("numUnidades :"));
        lista.add(li);
        return lista;
    }
    public int buscarElemento(ArrayList <Libro> lista){
        String posiccion = PedirDatos.pedirString("Ingrese el ISBN a buscar");
        int encontrado = 0; // no se encontro
        for(Libro elemento:lista){
            if(posiccion == elemento.getIsbn());{
                    System.out.println("El libro : "+elemento.getTitulo()+", tiene :"+elemento.getNumUnidades()+" unidades disponibles");
                    encontrado =1;
                }
            if( encontrado ==0 ){
                System.out.println("Ese Libro no esta en nuestra Libreria");
                System.out.println("O\nLista vacia");
            }
        }
        return encontrado;
    }
    public void vender(ArrayList <Libro> lista) throws Exception{
        if (lista==null){
            throw new Exception("Lista Vacia");
        }else{
        int encontrado = buscarElemento(lista);
        if (encontrado==1){
            String isbnABorrar = PedirDatos.pedirString("Ingrese el ISBN a Buscar de nuevo");
        Iterator it = lista.iterator();
        Libro li;
        while(it.hasNext()){
            li = (Libro) it.next();
            if(li.getIsbn().equalsIgnoreCase(isbnABorrar))
                li.setNumUnidades(li.getNumUnidades()-1);
        }
        }
        else 
            System.out.println("No esta en el equipo");
        }
    } 
    public void ordenar (ArrayList <Libro> lista){
        // ordenacion por el dorsal pikacho
        // este metodo buscara al metodo compareTo
        Collections.sort(lista);
    }
    public void mostrar(ArrayList <Libro> lista) throws Exception{
        if (lista==null){
            throw new Exception("Lista Vacia");
        }else{
            ordenar(lista);
        Iterator it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        }
        
        
    }
    public void regular(ArrayList<Libro>lista) throws Exception{
        if (lista==null){
            throw new Exception("Lista Vacia");
        }else{
        Libro li;
        Iterator it = lista.iterator();
        int cont=0;
        while(it.hasNext()){
            li = (Libro) it.next();
            if (li.getNumUnidades()==0){
                it.remove();
                cont++;
                System.out.println("Regulacion Realizada Correctamente , se regularon : " + cont);
            }
        }
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}