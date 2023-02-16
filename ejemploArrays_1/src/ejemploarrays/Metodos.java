package ejemploarrays;

import java.util.Arrays;

public class Metodos {
    static int tam = 20;
    
    
    public float [] crearArrayFloat(){
        float []temperaturas = new float [tam];
        int i;
        int numEle = PedirDatos_1.pedirInt("Cuantos elementos <= de "+tam);
        for(i =0;i<numEle;i++){
            temperaturas[i]= PedirDatos_1.pedirFloat("temperaturas :");
        }
        tam = i;
        return temperaturas;
    }
    public void mostrarArray ( float []temperaturas){
        System.out.println("********"+ tam);
        for(int i =0;i<=tam;i++){
            System.out.println("temperaturas"+i+"--->"+temperaturas[i]);
        }
    }
    public void mostrarArrayForeach( float []temperaturas){
    for (Float elemento:temperaturas){
        System.out.println("temperatura"+elemento);
    }
}
    public void buscar(float []temperaturas){
        int encuentro = 0 ; //no se encontron el elemento
        float objetivo = PedirDatos_1.pedirFloat("");
        //objetivo = JOptionPane.showInputDialog("Ingrese lo que desea buscar");
        for(int i=0;i<tam;i++){
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
        for(int i=0; i< tam-1;i++){
            for(int j=i+1;j<tam;j++){
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
    public void borrarElemento(float [] temperaturas){
        int encontrado = 0; //no esta en la lista 
        int i,j;
        float eleBorrar = PedirDatos_1.pedirFloat("Numero a Borrar");
        for(i=0; i<tam;i++){
            if (eleBorrar == temperaturas[i]){
                encontrado =1;
                for(j=i; j<tam-1;j++){
                    temperaturas[j]=temperaturas[j+1];
                }
                tam--;
            }
            
        }
        
        
        
        
        
    }
    public void insertarElemento(float [] temperaturas){
        if(tam<temperaturas.length){
            float eleInsertar = PedirDatos_1.pedirFloat("Numero a Insertar");
            temperaturas [tam]=eleInsertar;
            tam++;
            
        }
        else {
            System.out.println("*** No se Puede Insertar el Elemento ***");
            
            
            
        }
    }
    
}