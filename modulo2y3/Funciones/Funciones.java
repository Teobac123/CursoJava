package modulo2y3.Funciones;
import java.util.Scanner;
public class Funciones {

    public static void main(String[] args) {

        // opción 1: función sin parametros y sin tipo de retorno SETTER
        showMenu();

        // opción 2: función sin parametros y con tipo de retorno
        String menu= getMenu();
        System.out.println(menu);

        double price = getPrice(100.99);
        System.out.println(price);

        // opción 3: función con parametros y sin tipo de retorno

        imprimirSaludoNombre("Mateo");

        // opción 4: función con parametros y con tipo de retorno
        String saludo = obtenerSaludoNombre("Mateo","Baccillere");
        System.out.println(saludo);

    }

    private static String obtenerSaludoNombre(String nombre, String apellido) {
        return "Buenos dias " + nombre + " " + apellido;
    }

    static void imprimirSaludoNombre(String nombre) {
        System.out.println("Buenas tardes " + nombre);
    }

    static double getPrice(double precio) {
        return precio + precio*0.21 ;
    }

    static void showMenu(){ //SETTER
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos al E-commerce de zapatillas");
        System.out.println("1 -Ver zapatillas");
        System.out.println("2 -Comprar zapatillas");
        System.out.println("3 -Salir");

    }

    static String getMenu(){ //GETTER
        return "Bienvenidos al E-commerce de zapatillas: \n 1 -Ver zapatillas \n 2 -Comprar zapatillas \n 3 -Salir";
    } 
}
