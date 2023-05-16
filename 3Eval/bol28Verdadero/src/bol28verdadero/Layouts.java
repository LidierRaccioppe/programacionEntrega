package bol28verdadero;
import javax.swing.*;
public class Layouts {
    
    JFrame marco;
    JPanel panel;
    
    
    JLabel etiquetaNombre = new JLabel("Nombre"), etiquetaPassword = new JLabel("Contraseña");
    
    JTextField campoUserName = new JTextField();
    JPasswordField campoContraseña = new JPasswordField();
    JTextArea area = new JTextArea("Area de Texto.");
    JButton botonConfirmar = new JButton ("Confirmar"), botonLimpiar = new JButton ("Limpiar");
    
    
    
        
    public void bol28VerdaderoEsperemos(){
        seteamos();
        añadimos();
        cerrarVentana();
   }
    
    
   
    public void seteamos(){
        
        marco = new JFrame("Boletin 28 Verdadero");
        panel = new JPanel();
        // damos posiciones
        marco.setBounds(0, 0, 500, 450);
        panel.setBounds(5, 5, 500, 450);
        etiquetaNombre.setBounds(50 , 50, 100,50);
        etiquetaPassword.setBounds(50 , 100, 100,50);
        campoUserName.setBounds(150 , 50, 200,50);
        campoContraseña.setBounds(150 , 100, 200,50);
        campoContraseña.setEchoChar('-');
        area.setBounds(50 , 200, 300,100);
        botonConfirmar.setBounds(100 , 350, 150,50);
        botonLimpiar.setBounds(300 , 350, 150,50);
    }
    
    public void añadimos(){
        // Añadimos los componentes al panel
        panel.setLayout(null);
        panel.add(etiquetaNombre);
        panel.add(etiquetaPassword);
        panel.add(campoUserName);
        panel.add(campoContraseña);
        panel.add(area);
        panel.add(botonConfirmar);
        panel.add(botonLimpiar);
        marco.add(panel);
    }
    
    public void cerrarVentana(){
        // arreglo la muestra
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
}
