package ejemploarrays;
import javax.swing.JOptionPane;
public class EjemploArrays {
    public static void main(String[] args) {
        
        Metodos obj = new Metodos();
        float [] aux = null;
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1----> CREAR ARRAY \n" + "2---> MOSTRAR\n3 ---> BUSQUEDA\n4--->ORDENAR\n 5-->BORRAR \n6--->INSERTAR\n7-->SALIR TECLEA OPCION"));
        switch ( opcion){
            case 1: obj.crearArrayFloat();
            break;
            case 2: obj.mostrarArray(aux);
            break;
            case 3: obj.buscar(aux);
            break;
            case 4: obj.ordenar(aux);
            break;
            case 5: obj.borrarElemento(aux);
            break;
            case 6: obj.insertarElemento(aux);
            break;
            case 7: System.exit(0);
            break;
            default: System.out.println("OPCION INCORRECTA");;
        }
        }while(opcion<=7);
    }
}