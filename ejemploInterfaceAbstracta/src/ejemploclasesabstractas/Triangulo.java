package ejemploclasesabstractas;
public class Triangulo extends FigurasGeometricas implements IDibujable{
    public Triangulo(float base, float altura) {
        super(base, altura);
    }
    @Override
    public float calcularArea() {
        return super.getAltura()*super.getBase()/2;
    }
    @Override
    public float calcularPerimetro() {
        return 3*super.getBase();
    }
    //double k = super.getAltura()+ super.getBase()+ Math.sqrt(Math.pow(super.getAltura(),2)+Math.pow(super.getBase(),2), 2);

    @Override
    public void dibujar() {
        System.out.println("Dibjuamos el Triangulo");
    }
}