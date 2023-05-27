
import java.util.Scanner;
public class Scannermain {
    public static void main(String[] args) {
        
        System.out.println("Hola Mundo");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = sc.nextLine();

        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        System.out.println("El nombre es: " + nombre);
        System.out.println("El número es: " + numero);

    }
    
}
