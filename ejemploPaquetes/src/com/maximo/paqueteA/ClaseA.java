package com.maximo.paqueteA;
import com.maximo.paqueteB.ClaseD;
public class ClaseA {
    private void amosarClaseA(){
        System.out.println("Mostramos la clase A");
    }
    public void amosar(){
    ClaseB obj = new ClaseB();
    obj.amosarClaseB();
    ClaseD obj2 = new ClaseD();
    obj2.amosarClaseD();
}
}