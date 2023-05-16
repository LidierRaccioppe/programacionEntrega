package bol34.Entidades;
import java.util.GregorianCalendar;
public class Empleado {
    private String DNI,nombre,apellidos;
    private GregorianCalendar calendario;
    public Empleado(String DNI, String nombre, String apellidos, GregorianCalendar gregorio) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calendario = gregorio;
    }
    public Empleado() {
    }
    @Override
    public String toString() {
        return DNI + ", " + nombre + ", " + apellidos + ", " + calendario.get(GregorianCalendar.YEAR) + "/" + calendario.get(GregorianCalendar.MONTH) + "/" + calendario.get(GregorianCalendar.DATE);
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    // averiguar que hace en su plenitud de desarrollo
    public GregorianCalendar getCalendario() {
        return calendario;
    }
    public void setCalendario(GregorianCalendar calendario) {
        this.calendario.set(calendario.get(GregorianCalendar.YEAR), GregorianCalendar.MONTH, GregorianCalendar.DATE);
    }
}