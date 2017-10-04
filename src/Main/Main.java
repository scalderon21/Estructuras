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
        
        do{
            opMenu = menu();
            switch(opMenu){
                case 1:
                    limpiaP();
                    
                    System.out.println("Ingrese nombre Persona");
                    String nombre = Leer. dato();
                    System.out.println("Ingrese ID de la persona");
                    int id = Leer.datoInt();
                    Persona p1 = new Persona(nombre,id);
                    pila.push(p1);
                    
                    pausa();
                    break;
                case 2:
                    limpiaP();
                    
                    mp1.mostrarPila((iPila)pila);
                    
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
