package ejarraylist;
import java.util.ArrayList;
public class Metodos {
    
    ArrayList lista = new ArrayList(); // podemos meter cualquier tipo de dato
    
    public void crearArrayList(){
        lista.add(2);
        lista.add("aaaaaaa me apetece");
        lista.add(2.3);
        lista.add("be");
        
        
        
        
        
        
        
    }
    public void ver(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }
    }
    
    
    
    
    
}