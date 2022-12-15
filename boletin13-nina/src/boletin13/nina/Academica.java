package boletin13.nina;
import javax.swing.JOptionPane;
import otro.Personal;
public class Academica {
    private int nota;
    private String nome;
    public static int numRef=2018;
    private Personal alum;
    public void Academica(){
        numRef++;
    }
    public Academica(int nota, String nome, Personal alum){
        Academica.numRef ++;
        this.alum=alum;
        this.nome=nome;
        this.nota=nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getNumRef() {
        return numRef;
    }

    public static void setNumRef(int numRef) {
        Academica.numRef = numRef;
    }

    public Personal getAlum() {
        return alum;
    }

    public void setAlum(Personal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "nota=" + nota + ", nome=" + nome + ", alum=" + alum +"numRef="+numRef;
    }
    public int validaNota (){
        do{
            nota = Integer.parseInt(JOptionPane.showInputDialog("ingrese nota entre 0 y 10", nota));
        }while(nota<0||nota>10);
        return 0;
    }
}