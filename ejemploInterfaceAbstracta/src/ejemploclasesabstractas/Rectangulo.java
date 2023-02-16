package ejemploclasesabstractas;
public class Rectangulo extends FigurasGeometricas implements IDibujable, IRotable{
    public Rectangulo(float base, float altura){
        super(base,altura);
    }
    
    @Override
    public float calcularArea() {
        return super.getBase()*super.getAltura();
    }
    @Override
    public float calcularPerimetro() {
        return 2*super.getBase()+2*super.getAltura();
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujamos el Rectangulo");
    }

    @Override
    public void rotar() {
        System.out.println("Rotamos el Rectangulo");
    }
}