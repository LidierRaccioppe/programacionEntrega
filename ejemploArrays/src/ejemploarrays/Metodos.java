package ejemploarrays;

import java.util.Arrays;

public class Metodos {
    public float [] crearArrayFloat(){
        float []temperaturas = new float [5];
        for(int i =0;i<temperaturas.length;i++){
            temperaturas[i]= PedirDatos_1.pedirFloat("temperaturas :");
        }
        return temperaturas;
    }
    public void mostrarArray ( float []temperaturas){
        for(int i =0;i<temperaturas.length;i++){
            System.out.println("temperaturas"+i+"--->"+temperaturas[i]);
        }
    }
    public void mostrarArrayForeach( float []temperaturas){
    for (Float elemento:temperaturas){
        System.out.println("temperatura"+elemento);
    }
}
    public void buscar(float []temperaturas){
        short encuentro = 0 ; //no se encontron el elemento
        float objetivo = PedirDatos_1.pedirFloat("");
        //objetivo = JOptionPane.showInputDialog("Ingrese lo que desea buscar");
        for(int i=0;i<temperaturas.length;i++){
            if( objetivo==temperaturas[i]){
                System.out.println( "Esta en la lista, en la posicion"+i+1); 
               encuentro = 1;
               break;
            }
            else{
                if(encuentro==0){
               System.out.println( "No esta en la lista"); 
                }
            }
        }
    }
    public void ordenar(float [] temperaturas){
        /*float aux; 
        for(int i=0; i< temperaturas.length-1;i++){
            for(int j=i+1;j<temperaturas.length;j++){
                if(temperaturas[i]>temperaturas[i]){
                    aux = temperaturas[i];
                    temperaturas[i] = temperaturas[j];
                    temperaturas[i]=aux;
                }
            }
        }
        System.out.println("Array Ordenado");*/
        //tambien
        Arrays.sort(temperaturas);
    }
    public void insertarElemento(float [] temperaturas){
        //añadir un elemento a la arrayyyyyyyy
    }
    public void borrarElemento(float [] temperaturas){
        
    }
    
}