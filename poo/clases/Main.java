package poo.clases;

import poo.Herencia.Camion;
import poo.Herencia.Coche;
import poo.Herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        

        // 1. Clases y Objetos
        // Clase identificador = new Clase();
        Vehiculo toyotaPrius= new Vehiculo();

        Motor motorGTI = new Motor("GTI", 190, 459.0, 6 );
        Vehiculo fordFocus = new Vehiculo("Ford", "Focus", 2.0,2015, false, 0.00, motorGTI );

        System.out.println(fordFocus.fabricante);
        
        fordFocus.acelerar(150);
        System.out.println(fordFocus.speed);

        // 2. Herencia
        Motocicleta kawasakiNinja = new Motocicleta(); 
        kawasakiNinja.fabricante = "Kawasaki";
    
        System.out.println("Fin de programa");

        // 3. Polimorfismo
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        // 4. Clases Abstractas; no se pueden instanciar, solo instancian clases hijas
    }
}