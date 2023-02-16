/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bol17;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class CalcNota {
    private double examenT,examenT2,examenP,boletin;

    public CalcNota() {
    }

    public CalcNota(double examenT, double examenT2, double examenP, double boletin) {
        this.examenT = examenT;
        this.examenT2 = examenT2;
        this.examenP = examenP;
        this.boletin = boletin;
    }
    
    public void ponerNotaT(){
    boolean resultado=false;
    while(resultado==false){
        
    examenT=parseDouble(JOptionPane.showInputDialog("Dame nota 1º examen teorico"));
    examenT2=parseDouble(JOptionPane.showInputDialog("Dame nota 2º examen teorico"));
    examenP=parseDouble(JOptionPane.showInputDialog("Dame nota 1º examen practico"));
    boletin=parseDouble(JOptionPane.showInputDialog("Cuantos boletines tienes?(Max 100)"));
    double notat,notap,notab=0,notaTotal=0,notamed;
    
    if(boletin>90){
    notab=2;
    }
    if(boletin>=70 && boletin <=90){
    notab=1;
    }
    if(boletin<70){
    notab=0;
    }
    notat=((examenT+examenT2)/2);
    notap=examenP;
    notaTotal=(notat*4/10)+(notap*4/10)+notab;
    notamed=(examenT+examenT2+examenP)/3;
    JOptionPane.showMessageDialog(null,"Examen Teorico......."+notat);
    JOptionPane.showMessageDialog(null,"Examen Practico......"+notap);
    JOptionPane.showMessageDialog(null,"Boletines............"+notab);
    JOptionPane.showMessageDialog(null,"Nota media examen...."+notamed);
    JOptionPane.showMessageDialog(null,"Nota Final..........."+notaTotal);
    resultado=parseBoolean(JOptionPane.showInputDialog("Quieres calcular otra nota? (true para salir)"));
    }
    }
    
    public double getExamenT() {
        return examenT;
    }

    public void setExamenT(double examenT) {
        this.examenT = examenT;
    }

    public double getExamenT2() {
        return examenT2;
    }

    public void setExamenT2(double examenT2) {
        this.examenT2 = examenT2;
    }

    public double getExamenP() {
        return examenP;
    }

    public void setExamenP(double examenP) {
        this.examenP = examenP;
    }

    public double getBoletin() {
        return boletin;
    }

    public void setBoletin(double boletin) {
        this.boletin = boletin;
    }

    @Override
    public String toString() {
        return "CalcNota{" + "examenT=" + examenT + ", examenT2=" + examenT2 + ", examenP=" + examenP + ", boletin=" + boletin + '}';
    }
    
    
    
}
