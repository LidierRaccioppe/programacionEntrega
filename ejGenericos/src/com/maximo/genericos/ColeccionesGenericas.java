package com.maximo.genericos;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class ColeccionesGenericas <T>{
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
    
    
    
    
    
    
    
    
    
}