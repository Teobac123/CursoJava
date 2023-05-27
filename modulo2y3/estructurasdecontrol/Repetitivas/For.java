package modulo2y3.estructurasdecontrol.Repetitivas;
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    /* for(int i = 1; i <= 10; i++){
            System.out.println("El valor de i es: " + i);
        }*/

        String[] nombres ={ "Mateo", "Paulina", "Giuliana"};
        
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);    
        }

    }
}
