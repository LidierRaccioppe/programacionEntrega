package boletin16;
public class Cuenta{
    private long numeroCuenta;
    private double saldo;
    private Persona cliente;
    public Cuenta() {
    }
    public Cuenta(long numeroCuenta, double saldo, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public long getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Persona getCliente() {
        return cliente;
    }
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    public void ingresar(double co){
        saldo = saldo + co;
    }
    public void retirar(double co){
        saldo = saldo - co;
    }
    public double actualizarSaldo(){
        return saldo;
    }
    @Override
    public String toString() {
        return "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente;
    }
}