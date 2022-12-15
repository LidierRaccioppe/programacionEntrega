package ejemploherencia;
public class EjemploHerencia {
    public static void main(String[] args) {
        Persona per= new Persona("Jorge", "ciudadvieja");
        System.out.println(per.toString());
        Enseñante ens= new Enseñante("Máximo","salsipuedes","geografia");
        System.out.println(ens.toString());
        Estudiante es = new Estudiante("Sergei", "lavalleja", "Escuela Del Sol Naciente De Goku", "Japon/Asian");
        System.out.println(es.toString());
        EstudianteInternacional esin = new EstudianteInternacional("Yuuto Kaiba", "TreintayDos", "Escuela Consagrada Del Real Corazon De Buda", "Chino/Asian", "Peru");
        System.out.println(esin.toString());
        
        
        
        
    }
}