package ejemploexcepciones;
public class EjemploExcepciones {
    public static void main(String[] args) {
        DividirExcepciones obj = new DividirExcepciones();
        try{
        obj.dividirConNuestraExcepcion(8, 0);
        }catch(NuestraExcepcion ex){
            System.out.println("No dividir entre cero" + ex.toString());
                }
        System.out.println("Fin del Programa");
    }
}