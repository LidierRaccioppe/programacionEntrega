
package ejemplocondicionales;

public class CondicionalDoble {
    public void consultarEdad(int edad){
        if(edad>=18)
            System.out.println("Eres Mayor De Edad");
        else
            System.out.println("No Eres Mayor De Edad");
        System.out.println("Termina el IF");
    }
    public void operarEdad(int edad){
        String res = (edad>=18)? "mayor":"menor";
        System.out.println(res);
    }
    
    
}
