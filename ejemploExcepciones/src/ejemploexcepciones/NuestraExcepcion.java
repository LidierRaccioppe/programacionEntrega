package ejemploexcepciones;
public class NuestraExcepcion extends Exception{
    public NuestraExcepcion(){
        super();
    }
    public NuestraExcepcion(String mensage){
        super(mensage);
    }
}