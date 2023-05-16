package bol34.Presentacion;

import java.util.Scanner;
import bol34.Datos.*;
import bol34.Presentacion.*;
import bol34.Entidades.*;
public class Aplicacion {
    public static void main(String[] args) {
        
        
        
        
        ListaEmpleados listaEmpl = new ListaEmpleados();
        Empleado emp = new Empleado();
        EDestajo dest = new EDestajo(emp);
        ListaEmpleados metod = new ListaEmpleados();
        
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        do{
            System.out.println("***MENU***\n 1---> AÑADIR EMPLEADO CONTRATADO \n 2---> AÑADIR EMPLEADO DESTAJADO\n 3---> MOSTRAR SUELDO DE CONTRATADO\n 4---> REGULAR\n"
                + " 5---> BUSCAR ELEMENTO\n");
        opcion = sc.nextInt();
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