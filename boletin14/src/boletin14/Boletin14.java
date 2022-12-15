package boletin14;
import com.maximo.Partes.*;
public class Boletin14 {
    public static void main(String[] args) {
        Monitor mon = new Monitor(45);
        Teclado tec = new Teclado("Asus");
        Cpu cup = new Cpu(15);
        
        Ordenador obj = new Ordenador(mon,tec,cup, 1500.0F);
        System.out.println(obj.toString());
        System.out.println("precio"+ obj.getPrecio());
        System.out.println(obj.getTe().getMarcas());
        System.out.println(obj.getPro().getVelocidad());
        
        
        
        
        
        
        
        
        
        
        
    }
}