package Principal;

import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        //pido datos
        String titulo =JOptionPane.showInputDialog("Ingrese el titulo a ingresar");
        float preccio = parseFloat(JOptionPane.showInputDialog("Ingrese el precio del libro a ingresar"));
        String nombre =JOptionPane.showInputDialog("Ingrese el nombre a ingresar");
        //objetizo
        Libro l = new Libro();
        Libreria li = new Libreria();
        //uso los metodos
        l.setTitulo(titulo);
        l.setPrecio(preccio);
        li.setNombre(titulo);
        System.out.println("titulo = " + l.getTitulo() + " precio = " + l.getPrecio() + " nombre = " + li.getNombre());
       
        
        
        //l.setTitulo(titulo),l.setPrecio(preccio),"vegetta"
    }
}