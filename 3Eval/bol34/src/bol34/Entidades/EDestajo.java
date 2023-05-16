package bol34.Entidades;
import java.util.GregorianCalendar;
public class EDestajo extends Empleado{
    private int numeroDeClientesCaptados;
    private float complementoPorClienteCaptado;
    public EDestajo(String DNI, String nombre, String apellidos, GregorianCalendar gregorio, int numeroDeClientesCaptados, float complementoPorClienteCaptado) {
        super(DNI, nombre, apellidos, gregorio);
        this.numeroDeClientesCaptados = numeroDeClientesCaptados;
        this.complementoPorClienteCaptado = complementoPorClienteCaptado;
    }
    @Override
    public String toString() {
        return super.toString() + ", " + numeroDeClientesCaptados + ", " + complementoPorClienteCaptado;
    }
    public EDestajo(String DNI, String nombre, String apellidos, GregorianCalendar gregorio) {
        super(DNI, nombre, apellidos, gregorio);
    }
}