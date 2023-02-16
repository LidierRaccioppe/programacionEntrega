package com.maximo.aplicante;
import com.maximo.datos.PedirDatos;
import com.maximo.estructura.Libro;
import com.maximo.estructura.Metodos;
import java.util.ArrayList;
public class Aplicacion {
    public static void main(String[] args) {
        //tratar la excepcion aqui
        List <Libro> listalibrante = new ArrayList<Libro>();
        Metodos metod = new Metodos();
        int opcion;
        do{
        opcion = PedirDatos.pedirInt("***MENU***\n 1---> AÑADIR LIBRO \n 2---> VENDER\n 3---> MOSTRAR\n 4---> REGULAR\n"
                + " 5---> BUSCAR ELEMENTO\n");
        try{
            switch(opcion)
        {
            case 1 : metod.añadir(listalibrante);
            break;
            case 2: metod.vender(listalibrante);
            break;
            case 3: metod.mostrar(listalibrante);
            break;
            case 4: metod.regular(listalibrante);
            break;
            case 5: metod.buscarElemento(listalibrante);
            break;
            default : System.out.println("OPCION INCORRECTA");
            }
        }catch(Exception ex){
            System.out.println("No tienes listas"+ ex.getMessage());
        }
        }while (opcion>=1&&opcion<=5);
    }
}