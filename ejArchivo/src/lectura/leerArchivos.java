package lectura;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class leerArchivos {
    Scanner sc;
    public void leerPalabras(File arch){
        try{
            sc = new Scanner(arch);
            while(sc.hasNext()){
                String dato = sc.nextLine();
                System.out.println(dato);
            }
        }catch (FileNotFoundException ex){
            System.out.println("Archivo no encontrado, error 1"+ ex.getMessage());
        }
        finally{
            sc.close();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}