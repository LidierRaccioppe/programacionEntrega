package ejstring;
public class EjString {
    public static void main(String[] args) {
        String nombre= "Nabuconodosor";
        
        /*buscar/conseguir
        
        1-  numero de letras
        2-  pasar el nombre todo a mayusculas
        3-  pasar a minusculas
        4-  comparar el nombre inicial con "Nabuconodosor"
        5-  comparar el nombre con NaBucoNodosor sin tener en cuenta lass mayusculas y minusculas                                            
        6-  pasar el nombre inicial a un array de char 
        7-  corta por la c ---> queda Nabu
        
        */
        System.out.println("ejer 1 : "+nombre.length());
        System.out.println("ejer 2 : "+nombre.toUpperCase());
        System.out.println("ejer 3 : "+nombre.toLowerCase());
        System.out.println("ejer 4 : "+ nombre.compareTo("Nabuconodosor"));
        System.out.println("ejer 5 : "+nombre.compareToIgnoreCase("NaBucoNodosor"));
        System.out.println("ejer 6 : ") ;
        
        char []textos = new char [1];
        
        nombre.getChars(0, 0, textos, 0);
        
        
        System.out.println("ejer 7 : "+nombre.split( "c"));
        
    }
}