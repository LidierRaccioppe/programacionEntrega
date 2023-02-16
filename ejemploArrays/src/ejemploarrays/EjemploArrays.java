package ejemploarrays;
import javax.swing.JOptionPane;
public class EjemploArrays {
    public static void main(String[] args) {
        
        Metodos obj = new Metodos();
        float [] aux = new float[] {1.5f , 1.6f};
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1----> CREAR ARRAY \n" + "2---> MOSTRAR\n3 ---> BUSQUEDA\n4--->ORDENAR\n TECLEA OPCION"));
        switch ( opcion){
            case 1:obj.crearArrayFloat();
            break;
            case 2: obj.mostrarArrayForeach(aux);
            break;
            case 3:
                break;
            case 4: obj.ordenar(aux);
            break;
        }
        }while(opcion<=4);
    }
}