
package ejemploobjetos;


public class Rectangulo {
    // declaro atributos
    public float base;
    private float altura;
    
    //constructores
    public Rectangulo (float ba, float alt){ //constructor parametrizado
        base= ba;
        altura= alt;
    }
    public Rectangulo(){ //constructor por defecto
        
    }
    //metodos de acceso getters y setters
    public void darValorAltura (float al){ //equivale a setAltura
        altura=al;
    }
    public float devolverValorAltura (){ // equivale a getAltura
        return altura;
    }
    public void setBase (float bas){
        base = bas;
    }
    public float getBase (){
        return base;
    }
    //defino metodos
    
    public float calcularArea (float b, float alt) {
        float area = b*alt;
        return area;
    }   
     public void calcularPerimetro (float b, float a) {
         float peri = 2*b+2*a;
         //System.out.println(" perimetro = "+ peri);
         System.out.println(" peri = "+ (2*b+2*a));   
     }  
}