package bol33;
public class Futbolista extends SeleccionFutbol{
    private Integer dorsal;
    private String demarcacion;
    public void entrevista(){
        System.out.println("entrevista"+"futbolistas");
    }
    @Override
    public void jugarPartido() {
        System.out.println("jugarPartido"+"Futbolista");
    }
    @Override
    public void entrenar() {
        System.out.println("entrenar"+"Futbolista");
    }
    @Override
    public void viajar() {
        System.out.println("viajar"+"Futbolista");
    }
    @Override
    public void concentrarse() {
        System.out.println("concentrarse"+"Futbolista");
    }
    public Futbolista(Integer dorsal, String demarcacion, Integer id, String nombre, String apellido, Integer edad) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    public Futbolista(Integer dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    public Futbolista() {
    }
}