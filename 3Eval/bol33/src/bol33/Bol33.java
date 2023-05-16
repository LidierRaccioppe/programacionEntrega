package bol33;

import java.util.ArrayList;

public class Bol33 {
    public static void main(String[] args) {
        //nombre en clave: Aplicacion
        ArrayList lista = new ArrayList();
        SeleccionFutbol sel = new Futbolista();
        sel.concentrarse();
        sel = new Entrenador();
        sel.viajar();
        sel = new Masajista();
        sel.entrenar();
        sel = new Seleccionador();
        sel.concentrarse();
        lista.add(new Futbolista());
    }
}