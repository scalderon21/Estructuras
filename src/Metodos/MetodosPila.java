package Metodos;

import Estructuras.Pila;
import Clases.Persona;
import Estructuras.PilaV;


public class MetodosPila{
    
    
    
    public Pila invertirPila(Pila pila) {
        Pila pilaAux = new Pila();
        Pila p1 = pila;
        while(!p1.isEmpty()){
            pilaAux.push(p1.pop());
       }
        return pilaAux;
    }

    //Este metodo muestra el metodo toString() aparentemente por coincidencia de nombre.
    public void mostrarPilaGenerico(Pila pila) {
        Pila p1 = pila;
        Pila aux = null;
        while(!p1.isEmpty()){
            System.out.println(p1.pop().toString());
       }
    }
    
    public PilaV mostrarPilaVPersona(PilaV pila) {
        PilaV p1 = pila;
        PilaV aux = new PilaV();
        Persona asd = new Persona();
        while(!p1.isEmpty()){
            asd=(Persona)p1.pop();
            System.out.println(asd.toString());
            aux.push(asd);
       }
        return invertirPilaV(aux);
    }
    
    public PilaV invertirPilaV(PilaV pila) {
        PilaV pilaAux = new PilaV();
        PilaV p1 = pila;
        while(!p1.isEmpty()){
            pilaAux.push(p1.pop());
       }
        return pilaAux;
    }
    
    
    
}

