package bol33;
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }   
    @Override
    public void concentrarse() {
        System.out.println("concentrarse"+"SeleccionFutbol");
    }
    @Override
    public void viajar() {
        System.out.println("viajar"+"SeleccionFutbol");
    }
    @Override
    public void entrenar() {
        System.out.println("entrenar"+"SeleccionFutbol");
    }
    @Override
    public void jugarPartido() {
        System.out.println("jugarPartido"+"SeleccionFutbol");
    }
    public SeleccionFutbol(Integer id, String nombre, String apellido, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public SeleccionFutbol() {
    }
}