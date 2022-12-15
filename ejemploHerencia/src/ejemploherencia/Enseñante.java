package ejemploherencia;
public class Enseñante extends Persona{
    private String materia;
    public Enseñante(){
        super();
    }
    public Enseñante(String n, String d, String mate){
        super(n,d);
        materia=mate;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        /*Persona per= new Persona();
        per.toString();*/
        return (super.toString()+" , materia= " + materia);
    }
}