package modulo1;

public class StringMain {
    public static void main(String[] args) {
        
        // La clase String

        /*
          length()
          startWith("")
          endsWith("")
          indexOf("")
          subString(1,5)
          trim()
          equals()
          compareTo
         */

         String mensaje = "Hola Mundo";

         System.out.println(mensaje.length());
         String mensajeMAY = mensaje.toUpperCase();
         System.out.println(mensajeMAY);
         System.out.println(mensajeMAY.trim());
         mensajeMAY = mensajeMAY.trim();

         String otro = "HOLA MUNDO";

         if (mensajeMAY.equals(otro)){

            System.out.println("Verdadero!!");
         }
        }
    
}
