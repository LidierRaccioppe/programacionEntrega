package boletin16;
public class CuentaCorriente extends Cuenta {
    private final double interes=1.5/100;
    public CuentaCorriente() {
    }
    public CuentaCorriente(long numeroCuenta, double saldo, Persona cliente) {
        super(numeroCuenta, saldo, cliente);
    }
    public double getInteres() {
        return interes;
    }
    @Override
    public String toString() {
        return super.toString() + "interes=" + interes;
    }
}