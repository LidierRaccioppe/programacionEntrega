package ejemploherencia;
public class Estudiante extends Persona{
    private String nombreCole;
    private String nivel;
    public Estudiante(){
        super();
    }
    public Estudiante(String n, String di, String cole, String nive){
        super(n,di);
        nombreCole=cole;
        nivel=nive;
    }

    public String getNombreCole() {
        return nombreCole;
    }

    public void setNombreCole(String nombreCole) {
        this.nombreCole = nombreCole;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString()+" , nombreCole= " + nombreCole + ", nivel= " + nivel;
    }
}