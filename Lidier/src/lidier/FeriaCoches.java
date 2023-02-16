package lidier;

import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;


     //  float i = parseFloat(JOptionPane.showInputDialog("Ingrese el porcentaje a bajar, sin el porcentaje"));
       //obj.modificarPrecio(obj.getPrecio()*(i/100));


public class FeriaCoches {
    //instancio por su utilidad para los metodos y valores
    Coche obj = new Coche("citroenC4", 7000);
    private Coche objetose= obj;
    public FeriaCoches() {
    }
    // constructor por su utilidad para los metodos y valores
    public FeriaCoches(Coche objetos) {
        this.objetose = objetos;
    }
    public void mostrar(){
       System.out.println(obj.getMarca() + "precio original"+obj.getPrecio());
    }
    //baja es para establecer y acelerar la bajada del precio al no tener que decir que lo ponga en tanto por 1
    public float bajaPorcentual(float baja){
        obj.modificarPrecio(baja/100);
        return obj.getPrecio();
    }
    // getter y setter por su utilidad
    public Coche getObjeto() {
        return obj;
    }
    //preguntar lo de repetir
    public Coche getObj() {
        return obj;
    }
    public void setObj(Coche obj) {
        this.obj = obj;
    }
    
    
    
}