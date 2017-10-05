package Estructuras;
import Clases.Persona;
import java.util.NoSuchElementException;
import java.util.Vector;


public class PilaV<E> extends Vector<E>{
    private int largo;
    private Nodo primero;
    
    private class Nodo{
        //inserte Objeto
        //El objeto puede ser cualquiera mientras se modifique el codigo de push y pop
        public E item;
        //
        public Nodo sig;
    }
    
    public boolean isEmpty(){
        return primero == null;
    }
    
    public void push(E item){
        Nodo temp = new Nodo();
        temp.item = item;
        temp.sig=primero;
        primero=temp;
        largo++;
    }
    
    public E pop() {
        if (isEmpty()) throw new NoSuchElementException("Pila Vacia");
        Nodo temp = primero;
        E e1 = temp.item;
        primero = primero.sig;            
        largo--; 
        return  e1;                 
    }

    public int largo(){
        return largo;
    }

    public Nodo getPrimero() {
        return primero;
    }  
}