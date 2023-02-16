package ejemploexcepciones;
public class DividirExcepciones {
    public void divir2enteros(int numerador, int denominador){
        int resultado=numerador/denominador;
        System.out.println(numerador+"/"+denominador + "="+ resultado);
    }
    public void dividirTratandoExcepcion(int numerador, int denominador){
        try{
            int resultado=numerador/denominador;
        System.out.println(numerador+"/"+denominador + "="+ resultado);
        }catch(ArithmeticException ex){
            System.out.println("Error al dividir "+ ex.getMessage());
        }
        System.out.println("Termina el metodo");
    }
    public void dividir3bloquesExcepcion(int numerador, int denominador){
        try{
            int resultado=numerador/denominador;
        System.out.println(numerador+"/"+denominador + "="+ resultado);
        }catch(ArithmeticException ex){
            System.out.println("Error al dividir "+ ex.getMessage());
        }
        finally{
            System.out.println("Este bloque se ejecuta siempre");
        }
        System.out.println("Termina el metodo");
    }
    public void dividirPropagandoExcepcion(int numerador, int denominador) throws ArithmeticException{
        if(denominador ==0)
            throw new ArithmeticException("Cuidado no dividas entre cero");
        else{
            int resultado=numerador/denominador;
        System.out.println(numerador+"/"+denominador + "="+ resultado);
        }
        
        System.out.println("Termina el metodo");
    }
    public void dividirConNuestraExcepcion(int numerador, int denominador) throws NuestraExcepcion{
        if(denominador==0) throw new NuestraExcepcion ("No dividas entre cero desde nuestra excepcion *****");
        else{
            int resultado=numerador/denominador;
        System.out.println(numerador+"/"+denominador + "="+ resultado);
        }
    }
}