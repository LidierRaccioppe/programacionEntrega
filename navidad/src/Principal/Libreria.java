package Principal;
import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;
public class Libreria {
    Libro libr = new Libro();
    private Libro lib;
    private String nombre;
    public Libreria() {
    }
    public Libreria(Libro lib, String nombre) {
        this.lib = lib;
        this.nombre = nombre;
    }
    public void modificarPrecio(float modify){
        float ingreso = parseFloat(JOptionPane.showInputDialog("Ingrese el valor a agregar o quitar"));
        if(ingreso>=0)libr.setPrecio(ingreso+libr.getPrecio()); 
        else libr.setPrecio(-ingreso+libr.getPrecio());
    }
    public Libro getLibr() {
        return libr;
    }
    public void setLibr(Libro libr) {
        this.libr = libr;
    }
    public Libro getLib() {
        return lib;
    }
    public void setLib(Libro lib) {
        this.lib = lib;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}