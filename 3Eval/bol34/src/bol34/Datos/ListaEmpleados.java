package bol34.Datos;
import bol34.Entidades.EContratado;
import bol34.Entidades.EDestajo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class ListaEmpleados {
    FileWriter escritor = null;
    PrintWriter mostrador = null;
    public void añadirEmpleadoContratado(File f, EContratado e) {
        try {
            escritor = new FileWriter(f, true);
            mostrador = new PrintWriter(escritor);
            mostrador.println(e.toString());
        } catch (IOException ex) {
            System.out.println("Error en la Escritura: " + ex.getMessage());
        } finally {
            mostrador.close();
        }
    }
    public void añadirEmpleadoDestajado(File f, EDestajo e) {
        try {
            escritor = new FileWriter(f, true);
            mostrador = new PrintWriter(escritor);
            mostrador.println(e.toString());
        } catch (IOException ex) {
            System.out.println("Error en la Escritura: " + ex.getMessage());
        } finally {
            mostrador.close();
        }
    }
}