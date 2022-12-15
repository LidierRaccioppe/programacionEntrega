package boletin16;
public class CuentaAhorro extends Cuenta{
    private double c,r,t;
    private final double interesSimple = c*r*t/100;
    public CuentaAhorro() {
    }
    public CuentaAhorro(double c, double r, double t, long numeroCuenta, double saldo, Persona cliente) {
        super(numeroCuenta, saldo, cliente);
        this.c = c;
        this.r = r;
        this.t = t;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getT() {
        return t;
    }
    public void setT(double t) {
        this.t = t;
    }
    public double getInteresSimple() {
        return interesSimple;
    }
    //no tiene sentido darle un setter al interes simple
    @Override
    public String toString() {
        return super.toString() + "c=" + c + ", r=" + r + ", t=" + t + ", interesSimple=" + interesSimple;
    }
}