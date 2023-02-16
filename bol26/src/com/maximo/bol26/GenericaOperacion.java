package com.maximo.bol26;
import com.maximo.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class GenericaOperacion <T extends Comparable <T>>{
    public void GenericaOperacion(){}
    public <T> void añadir(T elemento , ArrayList<T>lista){
        lista.add(elemento);
    }
    public static <T> void mostrar (ArrayList<T> lista){
        for(T ele:lista)
        System.out.println(ele);
    }
    public <T> void ordenar (ArrayList <T> lista){
        lista.sort((Comparator<? super T>) Comparator.naturalOrder()); //
    }
    public void elementInferior (ArrayList<T> lista){
        System.out.println("El menor es"+ Collections.min(lista, null));
    }
    public void elementSuperior (ArrayList<T> lista){
        System.out.println("El mayor es"+ Collections.max(lista, null));
    }
    public int buscarPosicionElemento (ArrayList<T> lista, T porBuscar){
        int posicion=0;
        
        
        
        for(T ele :lista){
            if(ele == porBuscar){
                
            }
            
            
            
        }
        
        
        
        
        
        
        return posicion;
    }
    
    
    public void eliminar (ArrayList <T> lista, T obje){
        int 
        
        
        
        
        
    }
    
    
    
    
    
    
    
}