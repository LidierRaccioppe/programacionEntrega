package bol21parte2;

import javax.swing.JOptionPane;

public class Bol21parte2 {
    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int [] aux = null;
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1---> CREAR ARRAY \n" +
                    "2---> MOSTRAR\n3--->APROBADOS Y SUSPENSOS\n4 ---> NOTA MEDIA\n5 ---> MAYOR NOTA\n6--->SALIR TECLEA OPCION"));
        switch ( opcion){
            case 1: aux=obj.crearArrayInt();
            break;
            case 2: obj.mostrarArray(aux);
            break;
            case 3: obj.aprobadosSuspensos(aux);
            break;
            case 4: obj.notaMedia(aux);
            break;
            case 5: obj.mayorNota(aux);
            break;
            case 6: System.exit(opcion);
            default: System.out.println("OPCION INCORRECTA");;
        }
        }while(opcion<=6);
    }
}