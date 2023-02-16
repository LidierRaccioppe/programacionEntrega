package lidier;
public class Coche {
    private String Marca="citroenC4";
    private float Precio=7000;

    public Coche() {
    }
    
    public Coche(String Marca, float Precio) {
        this.Marca = Marca="citroenC4";
        this.Precio = Precio=7000;
    }
    public void modificarPrecio(float preci){
        Precio= Precio*preci;
    }
    // preguntar si debo poner los setter y getters
    // getters y setter por su utilidad y necesidad

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public float getPrecio() {
        return Precio;
    }

    @Override
    public String toString() {
        return "Marca=" + Marca + ", Precio=" + Precio;
    }
    
    
    
    
    
}