package Metodos;

import Estructuras.Pila;
import Clases.Persona;


public class MetodosPila{
    
    Pila pilaAux;
    
    public Pila invertirPila(Pila pila) {
        Pila p1 = new Pila();
        p1 = pila;
        while(!p1.isEmpty()){
            pilaAux.push(p1.pop());
       }
        return pilaAux;
    }

    public void mostrarPila(Pila pila) {
        Pila p1 = new Pila();
        Object o1 = new Object();
        p1 = pila;
        while(!p1.isEmpty()){
            o1 = p1.pop();
            System.out.println(o1.toString());
       }
    }
    
    
    
}

