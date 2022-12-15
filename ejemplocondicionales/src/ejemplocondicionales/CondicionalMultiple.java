package ejemplocondicionales;
public class CondicionalMultiple {
    public void verEdad(int edad){
        if (edad>18) System.out.println("Es mayor de 18");
        else if (edad==18) System.out.println("Tiene 18");
        else System.out.println("Tiene menos de 18");
    }
}