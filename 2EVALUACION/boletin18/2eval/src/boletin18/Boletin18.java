package boletin18;
public class Boletin18 {
    public static void main(String[] args) {
        ConversorTemperaturas ct = new ConversorTemperaturas();
        try{
            System.out.println(ct.centigradosAFharenheit(90)); 
        }catch(TemperaturaErradaExcepcion ex){
            System.out.println("No se puede usar celcius menores a "+ct.getHorror());
        }
    }
}