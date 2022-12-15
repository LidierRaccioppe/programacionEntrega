package boletin13.nina;
import otro.Personal;
public class Boletin13 {
    public static void main(String[] args) {
        Personal al = new Personal("aaa","bbb");
        Academica obj = new Academica(7,"aa",al);
        System.out.println(obj.toString());
    }
    
}
