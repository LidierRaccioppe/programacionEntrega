package ejemploclasesabstractas;
public abstract class FigurasGeometricas {
    private float base;
    private float altura;
    // Contructor para poder crear las figuras con los atributos
    public FigurasGeometricas(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public float getBase() {
        return base;
    }
    public float getAltura() {
        return altura;
    }
    //metodos abstractos
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
    
    
    
    
    
    
    
}