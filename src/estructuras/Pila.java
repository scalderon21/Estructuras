package Estructuras;
import Clases.Persona;
import java.util.NoSuchElementException;
import java.util.Vector;


public class Pila {
    private int largo;
    private Nodo primero;
    
    private class Nodo{
        //inserte Objeto
        //El objeto puede ser cualquiera mientras se modifique el codigo de push y pop
        private Object objeto;
        //
        private Nodo sig;
    }
    
    public boolean isEmpty(){
        return primero == null;
    }
    
    public void push(Object objeto){
        Nodo temp = new Nodo();
        temp.objeto = objeto;
        temp.sig=primero;
        primero=temp;
        largo++;
    }
    
    public Object pop() {
        if (isEmpty()) throw new NoSuchElementException("Pila Vacia");
        Nodo temp = primero;
        Object o1 = temp.objeto;
        primero = primero.sig;            
        largo--; 
        return  o1;                 
    }

    public int largo(){
        return largo;
    }

    public Object getPrimero() {
        return primero.objeto;
    }  
}
