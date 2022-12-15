package boletin7_4;
public class cuatro {
    public void peso(String nombre1, float peso1, String nombre2, float peso2){
    if(peso1>peso2) System.out.println("El mas pesado es " +nombre1 +" y con un peso de " +peso1 +" habiendo ganando por " +(peso1-peso2));
    else if(peso1<peso2) System.out.println("El mas pesado es " +nombre2 +" y con un peso de " +peso2 +" habiendo ganando por " +(peso2-peso1));
    else System.out.println("Tiene el mismo peso");
    }
}