package Metodos;

import Estructuras.Pila;
import interfaces.iPila;


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
        Object o1 = new Object();
        Pila p1 = new Pila();
        p1 = pila;
        while(!p1.isEmpty()){
            o1 = p1.pop();
            o1.toString();
            pilaAux.push(p1.pop());
       }
    }
    
    
    
}

