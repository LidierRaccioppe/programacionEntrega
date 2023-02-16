package ejmatriz;

import java.util.Random;

public class MetodosMatrices {
    Random num = new Random();
    public int[][]  crearArrayMultiversal(){
        int filas= PedirDatos.pedirInt("Numero de filas a tener");
        int columnas = PedirDatos.pedirInt("Numero de Columnas a tener");
        int [][]notas= new int[filas][columnas];
        for (int i =0 ; i<filas; i++){ //tambien i < notas.length
            for(int j=0; j<columnas;j++){ //tambien j<notas[].length
                notas[i][j]= PedirDatos.pedirInt("Ingrese valor");
                // Con numeros aleatorios
                //notas[i][j] = num.nextInt(11);
            }
        } 
        return notas;
    }
    public void ver(int [][]matriz){
        for(int i =0 ; i<matriz.length;i++){
            System.out.print("\n|");
                for(int j=0; j<matriz[i].length;j++){
                    System.out.print(matriz[i][j]+".");
                }
                System.out.println("|");
            }
    }
    public void mediaAlumno(int [][]matriz){
        int i;
        int media=0;
        for(i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                int parte= matriz[i][j];
                media=media+parte;
            }
        }
        System.out.println("media pre dividir "+ media);
        media=media/matriz.length;
        
        System.out.println("Nota media = " + media);
    }
    public float[] mediaAlumnoModulo(int [][]matriz){
        float []lista = new float [matriz.length];
        int acumulador;
        for(int i = 0 ; i<matriz.length;i++){
            acumulador=0;
            for(int j = 0 ; j<matriz[i].length;j++){
                acumulador=acumulador+matriz[i][j];
            }
            lista [i]=acumulador/matriz[i].length;
        }
        return lista;
    }
    public float[] mediaAlumnado (int [][] matriz){
        float []lista = new float [matriz.length];
        int acumulador=0;
        for(int i = 0 ; i<matriz.length;i++){
            acumulador=0;
            for(int j = 0 ; j<matriz[i].length;j++){
                acumulador=acumulador+matriz[i][j];
            }
            lista [i]=acumulador/matriz[i].length;
        }
        return lista;
    }
    public float[] mediaAlumnadoModulo (int [][] matriz){
        float []lista = new float [matriz.length];
        int acumulador=0
                ;
        int columnass = 0;
        for (int filass = 0; filass < matriz.length; filass++) {
            for (columnass = 0; columnass < matriz[filass].length; columnass++) {
                acumulador = acumulador + matriz[filass][columnass];
            }
            lista [filass]=acumulador/matriz.length;
                System.out.println("Materia tiene de media " + (acumulador / matriz.length));


        }
        return lista;
    }
    public String [] arrayNombreAlumno (){
        int filas=PedirDatos.pedirInt("Ingrese la cantidad de humanos que creara");
        
        
        
        String [] nombres = new String  [filas];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre de los humanos");
            nombres [i]=PedirDatos.pedirString("Ingrese el nombre del humano numero "+(i+1));
        }
        return nombres;
    }
    public String [] arrayNombreMateria (){
        int filas=PedirDatos.pedirInt("Ingrese la cantidad de Materias que habra");
        
        
        
        String [] nombres = new String  [filas];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre de las materias");
            nombres [i]=PedirDatos.pedirString("Ingrese el nombre de la materia de numero "+(i+1));
        }
        return nombres;
    }
    
}