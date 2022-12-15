package boletin16;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.*;

import javax.swing.JOptionPane;

public class Boletin16 {
    public static void main(String[] args) {
        /*Crea un programa que cree varias cuentas (supongo que se refiere a que sean de 
        mas de un tipo) y prueba sus caracteristicas*/
        Persona pe= new Persona();
        Cuenta cu = new Cuenta();
        CuentaCorriente cc = new CuentaCorriente();
        String nom = JOptionPane.showInputDialog("Ingrese el nombre");
        pe.setNombre(nom);
        String ape= JOptionPane.showInputDialog("Ingrese el apellido");
        pe.setApellido(ape);
        String nif = JOptionPane.showInputDialog("Ingrese el NIF");
        pe.setNIF(nif);
        System.out.println(pe.toString());
        
        cu.setCliente(pe);
        long nc =parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta"));
        cu.setNumeroCuenta(nc);
        double sald =parseDouble(JOptionPane.showInputDialog("Ingrese su saldo"));
        cu.setSaldo(sald);
        cu.ingresar(1);
        cu.retirar(3);
        System.out.println(cu.toString());
        
        //cuenta corriente
        System.out.println(cc.getInteres());
        System.out.println(cc.toString());
        
        //cuenta ahorro
        ////////Falta que muestre un valor de 
        if(sald>1000){
        CuentaAhorro ca = new CuentaAhorro();
        
        double cap = parseDouble(JOptionPane.showInputDialog("Ingrese el Capital"));
        ca.setC(cap);
        double te = parseDouble(JOptionPane.showInputDialog("Ingrese el Valor de t actual"));
        ca.setT(te);
        double ere = parseDouble(JOptionPane.showInputDialog("Ingrese el Valor de R actual"));
        ca.setR(ere);
        System.out.println(ca.getInteresSimple());
        System.out.println(ca.toString());
        }
    }
}