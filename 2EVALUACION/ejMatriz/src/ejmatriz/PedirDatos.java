package ejmatriz;
import static java.lang.Boolean.parseBoolean;
import static java.lang.Byte.parseByte;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
import static java.lang.Short.parseShort;
import javax.swing.JOptionPane;
public class PedirDatos {
    public static String pedirString(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    public static int pedirInt(String mensaje){
        return parseInt(JOptionPane.showInputDialog(mensaje));
    }
    public static byte pedirByte(String mensaje){
        return parseByte(JOptionPane.showInputDialog(mensaje));
    }
    public static short pedirShort(String mensaje){
        return parseShort(JOptionPane.showInputDialog(mensaje));
    }
    public static long pedirLong(String mensaje){
        return parseLong(JOptionPane.showInputDialog(mensaje));
    }
    public static float pedirFloat(String mensaje){
        return parseInt(JOptionPane.showInputDialog(mensaje));
    }
    public static double pedirDouble(String mensaje){
        return parseInt(JOptionPane.showInputDialog(mensaje));
    }
    public static boolean pedirBoolean(String mensaje){
        return parseBoolean(JOptionPane.showInputDialog(mensaje));
    }
    public static void validar0a10(double value){
        if(value>=0&&value<=10) System.out.println("Esta validado de 0 a 10 y esta bien");
        else System.out.println("Esta validado de 0 a 10 y esta mal");
    }
}