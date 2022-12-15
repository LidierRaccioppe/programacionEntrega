package ejemploherencia;
public class EstudianteInternacional extends Estudiante{
    private String pais;
    public EstudianteInternacional(){
        super();
    }
    public EstudianteInternacional(String n, String d, String nomCol, String nive, String pai){
        super(n,d,nomCol,nive);
        pais=pai;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return (super.toString()+" , pais= " + pais);
    }
}