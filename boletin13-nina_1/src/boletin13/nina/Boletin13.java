package boletin13.nina;
import otro.Personal;
public class Boletin13 {
    public static void main(String[] args) {
        Personal al = new Personal("111", "222");
        Academica obj1 = new Academica(7, "aa", al);
        
        
        Academica obj2  = new Academica(3, "bb", al );
        Academica obj3;
        obj3 = new Academica(4, "pepa", new Personal("3333","ccc@"));
        
        obj1.getNome();
        obj1.getAlum().getTelefono();
    }
}