package modulo2y3.estructurasdecontrol.Condicionales;
import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Coloque que día es hoy");
        
        String dia = s.nextLine();

        switch(dia){
            case "Lunes":
                System.out.println("Es Lunes");
                break;

            case "Martes":
                System.out.println("Es Martes");
                break;

            case "Miercoles":
                System.out.println("Es Miercoles");
                break;

            case "Jueves":
                System.out.println("Es Jueves");
                break;

            case "Viernes":
                System.out.println("Es Viernes");
                break;

            default: 
                System.out.println("No es un día valido");
                break;
        }
    }
}
