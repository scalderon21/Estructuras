package Metodos;

import Estructuras.Pila;
import interfaces.iPila;


public class MetodosPila implements iPila{
    Pila pilaAux;
    @Override
    public iPila invertirPila(iPila pila) {
        Pila p1 = new Pila();
        p1 = (Pila)pila;
        while(!p1.isEmpty()){
            pilaAux.push(p1.pop());
       }
        return (iPila)pilaAux;
    }

    @Override
    public void mostrarPila(iPila pila) {
        Object o1 = new Object();
        Pila p1 = new Pila();
        p1 = (Pila)pila;
        while(!p1.isEmpty()){
            o1 = p1.pop();
            o1.toString();
            pilaAux.push(p1.pop());
       }
    }
    
    
    
}

