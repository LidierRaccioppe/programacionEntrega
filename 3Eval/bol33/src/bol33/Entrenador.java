package bol33;
public class Entrenador extends SeleccionFutbol{
    private Integer idFederacion;
    public void planidicarEntrenamiento(){
        System.out.println("planidicarEntrenamiento"+"entrenador");
    }
    @Override
    public void jugarPartido() {
        System.out.println("jugarPartido"+"Entrenador");
    }
    @Override
    public void entrenar() {
        System.out.println("entrenar"+"Entrenador");
    }
    @Override
    public void viajar() {
        System.out.println("viajar"+"Entrenador");
    }
    @Override
    public void concentrarse() {
        System.out.println("concentrarse"+"Entrenador");
    }
    public Entrenador(Integer idFederacion, Integer id, String nombre, String apellido, Integer edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }
    public Entrenador(Integer idFederacion) {
        this.idFederacion = idFederacion;
    }
    public Entrenador() {
    }
}