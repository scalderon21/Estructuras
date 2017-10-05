package Main;

import Clases.Persona;
import Estructuras.PilaV;
import Metodos.MetodosPila;
import java.util.Stack;

public class Main {
        public static int menu(){
        System.out.println("\n1. Ingresar Persona");
        System.out.println("2. Mostrar Pila");
        System.out.println("3. Invertir y Mostrar Pila");
        System.out.println("4. Salir");
        System.out.print("Ingrese opcion ");
        return Leer.datoInt();
    }
    
    public static void main(String[] args) {
        MetodosPila mp1 = new MetodosPila();
        PilaV pila = new PilaV();
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
                    pila = mp1.mostrarPilaVPersona(pila);
                    pausa();
                    break;
                case 3:
                    
                    limpiaP();
                    
                    PilaV pilaInvertidaV = new PilaV();
                    pilaInvertidaV = mp1.invertirPilaV(pila);
                    mp1.mostrarPilaVPersona(pilaInvertidaV);
                    
                    pausa();
                    break;

            }
                    
        }while(opMenu != 4);
        
        Stack s = new Stack();
    }
    
    public static void pausa(){
        System.out.println("\n\n\t Presione ENTER para continuar");
        String h = Leer.dato();
    }
    
    public static void limpiaP(){
        for (int i = 0; i < 5; i++) {
            System.out.println("                                                           ");
            
        }
    }
    
    
}
