package boletin16;
public class Persona {
    private String nombre;
    private String apellido;
    private String NIF;
    public Persona() {
    }
    public Persona(String nombre, String apellido, String NIF) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NIF = NIF;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNIF() {
        return NIF;
    }
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", NIF=" + NIF;
    }
}