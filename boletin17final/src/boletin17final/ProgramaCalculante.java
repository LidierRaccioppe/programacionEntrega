package boletin17final;
import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;
public class ProgramaCalculante {
    private double nboletines;
    private double notaboletinglobal;
    private double notaexamen;
    private double notaexamen2;
    private double notaexamenfinal=(notaexamen+notaexamen)/2;
    private double notapractica;
    private double notafinal= notaexamenfinal*0.4+notapractica*0.4+notaboletinglobal;
    private double notab;

    public ProgramaCalculante() {
    }
    public ProgramaCalculante(double nboletines, double notaboletinglobal, double notaexamen, double notaexamen2, double notapractica) {
        this.nboletines = nboletines;
        this.notaexamen = notaexamen;
        this.notaexamen2 = notaexamen2;
        this.notapractica = notapractica;
    }
    public void nota(){
        boolean reintentar=true;
        while(reintentar==true){
        notaexamen = parseDouble(JOptionPane.showInputDialog("Ingrese su nota del primer examen"));
        notaexamen2 = parseDouble(JOptionPane.showInputDialog("Ingrese su nota del segundo examen"));
        notapractica = parseDouble(JOptionPane.showInputDialog("Ingrese su nota del examen practico"));
        notaexamenfinal=(notaexamen+notaexamen)/2;
        nboletines = parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de boletines entregado, sin el porciento"));
        if(nboletines>90){notab=2;}
        else if(nboletines<=90&&nboletines>=70){notab=1;}
        else if(nboletines<70){notab=0;}
        notafinal= notaexamenfinal*0.4+notapractica*0.4+notab;
        reintentar = parseBoolean(JOptionPane.showInputDialog("¿Quiere Hacer Otro Calculo?, true=si y false=no"));
        }
    }
    public double getNboletines() {
        return nboletines;
    }
    public void setNboletines(double nboletines) {
        this.nboletines = nboletines;
    }
    public double getNotaexamen() {
        return notaexamen;
    }
    public void setNotaexamen(double notaexamen) {
        this.notaexamen = notaexamen;
    }
    public double getNotaexamen2() {
        return notaexamen2;
    }
    public void setNotaexamen2(double notaexamen2) {
        this.notaexamen2 = notaexamen2;
    }
    public double getNotaexamenfinal() {
        return notaexamenfinal;
    }
    public void setNotaexamenfinal(double notaexamenfinal) {
        this.notaexamenfinal = notaexamenfinal;
    }
    public double getNotapractica() {
        return notapractica;
    }
    public void setNotapractica(double notapractica) {
        this.notapractica = notapractica;
    }
    public double getNotafinal() {
        return notafinal;
    }
    public void setNotafinal(double notafinal) {
        this.notafinal = notafinal;
    }
    public double getNotab() {
        return notab;
    }
    public void setNotab(double notab) {
        this.notab = notab;
    }
    
    @Override
    public String toString() {
        return "Prueba Teorica1 =" + notaexamen + " Prueba Teorica2 =" + notaexamen2 + " Prueba Teorica final =" + notaexamenfinal +
               " \nPrueba Practica =" + notapractica + 
               " \nBoletines =" + notab+ 
               " \nNota Total =" + notafinal;
    }
}