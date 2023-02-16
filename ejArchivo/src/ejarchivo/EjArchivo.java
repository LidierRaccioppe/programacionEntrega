package ejarchivo;
import java.io.File;
import lectura.leerArchivos;
public class EjArchivo {
    public static void main(String[] args) {
        File f = new File("pikachonumeros.txt");
        leerArchivos leer = new leerArchivos();
        leer.leerPalabras(f);
        
        
    }
}