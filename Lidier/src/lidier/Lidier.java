package lidier;
import static java.lang.Boolean.parseBoolean;
import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;
public class Lidier {
    public static void main(String[] args) {
        boolean confirm =true;        
        while(confirm==true){
        //instancio
        Coche obj1 = new Coche("citroenC4", 7000);
        FeriaCoches coche = new FeriaCoches(obj1);
        //descuento
        coche.mostrar();
        //bajas para saber en tanto porciento cuanto debo bajar
        float bajas= parseFloat(JOptionPane.showInputDialog("Ingrese el porcentaje a bajar, sin el porcentaje"));
        coche.bajaPorcentual(bajas);
        
        //gastar para poder medir cuanto va a gastar el consumidor
        float gastar= parseFloat(JOptionPane.showInputDialog("¿Cuanto va a gastar?"));
        if(gastar<obj1.getPrecio()) JOptionPane.showMessageDialog(null, "No lo puedes comprar");
        
        
        JOptionPane.showMessageDialog(null, obj1.toString());
        confirm = parseBoolean(JOptionPane.showInputDialog("Si quiere repetir ingrese true y si no ingrese false"));
        }
    }
}