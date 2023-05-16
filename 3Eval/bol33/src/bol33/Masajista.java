package bol33;
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private Integer aniosExperiencia;
    public void darMasaje(){
        System.out.println("darMasaje"+"masajista");
    }
    @Override
    public void jugarPartido() {
        System.out.println("jugarPartido"+"Masajista");
    }
    @Override
    public void entrenar() {
        System.out.println("entrenar"+"Masajista");
    }
    @Override
    public void viajar() {
        System.out.println("viajar"+"Masajista");
    }
    @Override
    public void concentrarse() {
        System.out.println("concentrarse"+"Masajista");
    }
    public Masajista(String titulacion, Integer aniosExperiencia, Integer id, String nombre, String apellido, Integer edad) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    public Masajista(String titulacion, Integer aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    public Masajista() {
    }
}