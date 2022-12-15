package boletin_4;
public class Boletin_4 {
    public static void main(String[] args) {
        libro objLibro1 = new libro("La Esmorga", "Eduardo",1959, (short)120);
        objLibro1.amosar();
        libro objLibro2 = new libro();
        objLibro2.amosar();
        objLibro2.setValorAutor("avdadnodav") ;
        objLibro2.setValorTitulo("titutlo");
        objLibro2.setValorAño(90);
        }
}