package Main;

import Clases.Persona;
import Estructuras.Pila;
import Metodos.MetodosPila;

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
        
        Object o1;
        Persona persona = new Persona("Sebastian",1);
        o1 = persona;
        System.out.println(o1.toString());
        
        
        MetodosPila mp1 = new MetodosPila();
        int opMenu;
        Pila pila = new Pila();
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
                    mp1.mostrarPila(pila);
                    pausa();
                    break;
                case 3:
                    
                    limpiaP();
                    
                    Pila pilaInvertida = new Pila();
                    pilaInvertida = mp1.invertirPila(pila);
                    mp1.mostrarPila(pilaInvertida);
                    
                    pausa();
                    break;

            }
                    
        }while(opMenu != 4);
    }
    
    public static void pausa(){
        System.out.println("\n\n\t Presione ENTER para continuar");
        String h = Leer.dato();
    }
    
    public static void limpiaP(){
        for (int i = 0; i < 25; i++) {
            System.out.println("                                                           ");
            
        }
    }
    
    
}
