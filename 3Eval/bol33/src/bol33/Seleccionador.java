package bol33;
public class Seleccionador extends SeleccionFutbol{
    public void seleccionarJugador(){
        System.out.println("seleccionarJugador"+"seleccionador");
    }
    public Seleccionador(Integer id, String nombre, String apellido, Integer edad) {
        super(id, nombre, apellido, edad);
    }
    public Seleccionador() {
    }
    @Override
    public void jugarPartido() {
        System.out.println("jugarPartido"+"Seleccionador");
    }
    @Override
    public void entrenar() {
        System.out.println("entrenar"+"Seleccionador");
    }
    @Override
    public void viajar() {
        System.out.println("viajar"+"Seleccionador");
    }
    @Override
    public void concentrarse() {
        System.out.println("concentrarse"+"Seleccionador");
    }
}