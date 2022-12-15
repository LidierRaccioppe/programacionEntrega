
package boletin_5;

public class consumo {
    double km, litros, vMed, pGas;
    public consumo(){// constructor de defecto
    }
    public consumo(double kim, double lit, double vemed, double pegas){
        km = kim;
        litros = lit;
        vMed = vemed;
        pGas = pegas;
    }
    /*public void setkm(double a){
        km = a;
    }
    public double getkm(){
        return km;
    }
    public void setlitros(double a){
        litros = a;
    }
    public double getlitros(){
        return litros;
    }
    public void setvMed(double a){
        vMed = a;
    }
    public double getvMed(){
        return vMed;
    }
    public void setpGas(double a){
        pGas = a;
    }
    public double getpGas(){
        return pGas;
    }*/
    public double getTiempo(){
        return km*vMed;
    }
    public double consumoMedio(){
        return litros/km*100;
    }
    public double consumoEuros(){
        return litros*100/km*pGas;
    }
    public double getkm(){
        return km;
    }
    public void setlitros(double a){
        litros = a;
    }
    public void setvMed(double a){
        vMed = a;
    }
    public void setpGas(double a){
        pGas = a;
    }
}
