package Metodos;

import Estructuras.Pila;
import Clases.Persona;


public class MetodosPila{
    
    
    
    public Pila invertirPila(Pila pila) {
        Pila pilaAux = new Pila();
        Pila p1 = pila;
        while(!p1.isEmpty()){
            pilaAux.push(p1.pop());
       }
        return pilaAux;
    }

    public void mostrarPila(Pila pila) {
        Pila p1 = pila;
        while(!p1.isEmpty()){
            System.out.println(p1.pop().toString());
       }
    }
    
    
    
}

