
import java.util.Scanner;

import javax.naming.NameNotFoundException;

public class ThrowMain {
    public static void main(String[] args) {
        
        try { 
            leerNombres();
        }catch(NameFormatException e) {

        }

    }
    /**
     * metodo que lee nombres de consola y verifica que tenga longitud igual o mayor que 8
     * caracteres
     * @throws NameFormatException
    */
    private static void leerNombres() throws NameFormatException { 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un Nombre");
        while ( teclado.hasNext()){
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            if(nombre.length() < 8){
                teclado.close();
                throw new NameFormatException("El nombre debe contener minimo 8 caracteres");

            }

        }
        teclado.close();
    }
    
}
