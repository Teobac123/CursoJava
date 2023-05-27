package Conceptos;

import java.util.ArrayList;
import java.util.List;
public class ListMain {
    public static void main(String[] args) {
        
        List <String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for(String nombre: nombres){

            System.out.println(nombre);
        }

        List <Coche> coches = new ArrayList<>();

        coches.add( new CocheElectrico("Rojo", "Alfa Romeo", "Deportivo", 1500.80, 3.14, "Modelo Deportivo"));
       
        System.out.println(coches);
    }
}
