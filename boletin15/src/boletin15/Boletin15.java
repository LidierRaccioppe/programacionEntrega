package boletin15;
import javax.swing.JOptionPane;
public class Boletin15 {
        static String titulo;
        static String autor;
        static String formato;
        static String duracion;
        static String actor;
        static String actris;
        static String genero;
        static byte seleccion;
    public static void main(String[] args) {
        JOptionPane.showInputDialog(null, "Ingrese un valor 1 para elegir pelicula y 2 para disco", seleccion);
        switch(seleccion){
            case 1://pelicula
        JOptionPane.showInputDialog(null, "Ingrese los Datos del Pelicula: titulo", titulo);
        JOptionPane.showInputDialog(null, "Ingrese los Datos del Pelicula: autor", autor);
        JOptionPane.showInputDialog(null, "Ingrese los Datos del Pelicula: formato", formato);
        JOptionPane.showInputDialog(null, "Ingrese los Datos del Pelicula: duracion", duracion);
        JOptionPane.showInputDialog(null, "Ingrese los Datos del Pelicula: actor", actor);
        JOptionPane.showInputDialog(null, "Ingrese los Datos del Pelicula: actris", actris);
        break;
            case 2://disco
        JOptionPane.showInputDialog(null, "Ingrese los Datos del Disco: titulo", titulo);
        JOptionPane.showInputDialog(null, "Ingrese los Datos del Disco: titulo", autor);
        JOptionPane.showInputDialog(null, "Ingrese los Datos del Disco: titulo", formato);
        JOptionPane.showInputDialog(null, "Ingrese los Datos del Disco: titulo", duracion);
        JOptionPane.showInputDialog(null, "Ingrese los Datos del Disco: titulo", genero);
            break;
            default:
                System.out.println("fallaste");
        }
        Pelicula pe = new Pelicula(actor, actris, titulo, autor, formato, duracion);
        System.out.println(pe.toString());
        
        
        
        Disco dis1 = new Disco(genero, titulo, autor, formato, duracion);
        System.out.println(dis1.toString());
    }
}