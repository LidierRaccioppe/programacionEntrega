package com.maximo.genericos;
import java.util.ArrayList;
public class ejGenericos {
    public static void main(String[] args) {
        
        
        /* inicialmente
        
        ColeccionesGenericas<Integer>objList = new ColeccionesGenericas<>();
        ArrayList<Integer> lista = new ArrayList<>();
        obxLis.añadir(1, lista);
        obxLis.añadir(2, lista);
        obxLis.añadir(3, lista);
        ColeccionesGenericas.mostar(lista);
        
        */
        
        //con float para Jugadores
        ColeccionesGenericas<Jugador>objList = new ColeccionesGenericas<>();
        ArrayList<Jugador> lista = new ArrayList<>();
        objList.añadir(new Jugador ("aaa",1), lista);
        objList.añadir(new Jugador ("bbb",8), lista);
        objList.añadir(new Jugador ("ddd",3), lista);
        objList.añadir(new Jugador ("ccc",5), lista);
        ColeccionesGenericas.mostrar(lista);
        objList.ordenar(lista);
        System.out.println("\n");
        ColeccionesGenericas.mostrar(lista);
        
        
        /*
        
        ClaseGenericos <Xogador> obx = new ClaseGenericos();
        Xogador x = new Xogador("Manuel", 2);
        
        obx.setDato(x);
        System.out.println(obx.getDato());
        
        */
    }
}