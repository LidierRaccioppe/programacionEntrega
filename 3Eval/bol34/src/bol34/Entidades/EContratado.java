package bol34.Entidades;
import java.util.GregorianCalendar;
public class EContratado extends Empleado{
    private float sueldoBasico,sueldoTotal;
    private int anoActual = 2023;
    public EContratado(String DNI, String nombre, String apellido, GregorianCalendar calendario, float sueldoBasico) {
        super(DNI, nombre, apellido, calendario);
        this.sueldoBasico = sueldoBasico;
        this.sueldoTotal = sueldoACobrar();
    }
    public float sueldoACobrar(){
        float sueldoTotal;
        int anosTrabajados = anoActual - super.getCalendario().get(GregorianCalendar.YEAR);
        if(anosTrabajados>=0 && anosTrabajados<=3){
            sueldoTotal = sueldoBasico + (5/100)*sueldoBasico;
        }
        else if(anosTrabajados<=7){
            sueldoTotal = sueldoBasico + (10/100)*sueldoBasico;
        }
        else if(anosTrabajados<=15){
            sueldoTotal = sueldoBasico + (15/100)*sueldoBasico;
        }
        else{
            sueldoTotal = sueldoBasico + (20/100)*sueldoBasico;
        }
        return sueldoTotal;
    }
    public float getSueldoBasico() {
        return sueldoBasico;
    }
    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public int getAnoActual() {
        return anoActual;
    }
    public void setAnoActual(int anoActual) {
        this.anoActual = anoActual;
    }
    @Override
    public String toString() {
        return super.toString() + ", " + sueldoTotal;
    }
}