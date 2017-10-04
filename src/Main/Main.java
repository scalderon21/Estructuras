package Main;

import Clases.Persona;
import Estructuras.Pila;
import Metodos.MetodosPila;
import interfaces.iPila;

public class Main {
        public static int menu(){
        System.out.println("\n1. Ingresar Persona");
        System.out.println("2. Mostrar Persona");
        System.out.println("3. Salir");
        System.out.print("Ingrese opcion ");
        return Leer.datoInt();
    }
   
    
    public static void main(String[] args) {
        MetodosPila mp1 = new MetodosPila();
        Pila pila = new Pila();
        int opMenu;
        
        Persona p1 = new Persona("Persona 1",1);
        Persona p2 = new Persona("Persona 2",2);
        Persona p3 = new Persona("Persona 3",3);
        pila.push(p1);
        pila.push(p2);
        pila.push(p3);
        
        do{
            opMenu = menu();
            switch(opMenu){
                case 1:
                    limpiaP();
                    
                    System.out.println("Ingrese nombre Persona");
                    String nombre = Leer. dato();
                    System.out.println("Ingrese ID de la persona");
                    int id = Leer.datoInt();
                    Persona p4 = new Persona(nombre,id);
                    pila.push(p1);
                    
                    pausa();
                    break;
                case 2:
                    limpiaP();
                    
                    mp1.mostrarPila(pila);
                    
                    pausa();
                    break;
            }
                    
        }while(opMenu != 3);
    }
    
    public static void pausa(){
        System.out.println("\n\n\t Presione ENTER para continuar");
        String h = Leer.dato();
    }
    
    public static void limpiaP(){
        for (int i = 0; i < 35; i++) {
            System.out.println("                                                           ");
            
        }
    }
    
    
}
