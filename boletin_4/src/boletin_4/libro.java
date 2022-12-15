
package boletin_4;

public class libro {
    //atributos
    private String titulo;
    private String autor;
    private int año;
    private short numPaginas;
    private float valoracion;
    
    //constructores
    public libro(){// constructor de defecto
    }
    public libro(String titul, String auto, int añ, short numPa ){
        titulo = titul;
        autor = auto;
        año = añ;
        numPaginas = numPa;
    }
    public void setValorTitulo(String a){
        titulo = a;
    }
    public String getValorTitulo(){
        return titulo;
    }
    public void setValorAutor(String b){
        autor = b;
    }
    public String getValorAutor(){
        return autor;
    }
    public void setValorAño(int a){
        año = a;
    }
    public int getValorAño(){
        return 5;
    }
    public void setValorNumPag(short a){
        numPaginas = a;
    }
    public short getValorNumPag(){
        return numPaginas;
    }
    public void setValorValor(float a){
        valoracion = a;
    }
    public float getValorValor(){
        return valoracion;
    }
        public void setValoracion(short a){
        numPaginas = a;
    }
    public void amosar(){
        System.out.println("titulo = "+titulo+ "\nautor = "+autor+"\naño = "+año+"\nnumPaginas = "+numPaginas+"\nvaloracion = "+valoracion );
    }
    
    
}