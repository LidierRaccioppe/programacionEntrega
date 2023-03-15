package boletin18;
public class ConversorTemperaturas {
    private final int HORROR = 80;
    public double centigradosAFharenheit(float temperaturaRecibidaCelcius) throws TemperaturaErradaExcepcion{
        if(temperaturaRecibidaCelcius<HORROR) throw new TemperaturaErradaExcepcion ("No sirven valores menores a 80ºC");
        else {return 9.0/5.0*temperaturaRecibidaCelcius+32.4;}
    }
    public void centigradosAReamur(float temperaturaRecibidaCelcius) throws TemperaturaErradaExcepcion{
        if(temperaturaRecibidaCelcius<HORROR) throw new TemperaturaErradaExcepcion ("No sirven valores menores a 80ºC");
        else {double reamurs = 4.0/5.0*temperaturaRecibidaCelcius;}
        
    }
    public int getHorror() {
        return HORROR;
    }
}