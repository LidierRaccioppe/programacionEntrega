package ejemplocondicionales;

import javax.swing.JOptionPane;

public class Ejemplocondicionales {
    public static void main(String[] args) {
        //condicionalsimple obj1 = new condicionalsimple();
        //obj1.mayoredad(9999999);
        //obj1.mayoredad(-22);
        // pedimos datos usando JOptionPane
        //obj2.consultarEdad(edad);
        
        //System.out.println(res);
        /*Integer.parseInt(two);
        
        
        
        
        
        
        Integer.valueOf(12312);
        String myString = "1234";*/
        
        /*try {
            foo = Integer.parseInt(myString);
        }
        catch (NumberFormatException e) {
            foo = 0;
        }
        System.out.println("a "+foo);*/
        
        
        //obj1.mayoredad(edad);
        //condicional doble
        
        
        
        /*CondicionalDoble obj2 = new CondicionalDoble();
        String res =JOptionPane.showInputDialog("teclea la edad");
        int edad = Integer.parseInt(res);
        obj2.operarEdad(edad);
        int ed = Integer.parseInt( JOptionPane.showInputDialog("mensaje"));*/
        
        //Condicinal multiple
        
        /*CondicionalMultiple obj3 = new CondicionalMultiple();
        int edad = Integer.parseInt(JOptionPane.showInputDialog("teclea la edad"));
        obj3.verEdad(edad);*/
        
        
        //usar clase para uso futuro
        /*CondicionalMultiple obj3 = new CondicionalMultiple();
        int ed = pedirEntero("Dame el valor de tu edad");
        obj3.verEdad(ed);
        */
        CondicionalMultiple_1 obj4 = new CondicionalMultiple_1();
        int dia = Integer.parseInt(JOptionPane.showInputDialog("teclea el dia"));
        obj4.verDiaSwitchCase(dia);
        
        
        
        
        
        
    }
    /*public static int pedirEntero (String mensage){
        return Integer.parseInt(JOptionPane.showInputDialog(mensage));
    }
    public void ver(){
        int respuesta = pedirEntero("dame valor");
        System.out.println(respuesta);
    }*/
}