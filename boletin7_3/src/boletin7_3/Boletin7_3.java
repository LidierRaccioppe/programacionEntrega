package boletin7_3;

import javax.swing.JOptionPane;

public class Boletin7_3 {
    
    public static void main(String[] args) {
        tres obj1 = new tres();
        int num = Integer.parseInt(JOptionPane.showInputDialog("teclea el numero"));
        obj1.signo(num);
    }
}