package modulo2y3.estructurasdecontrol.Condicionales;
import java.util.Scanner;
public class IfElseIf {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Coloque que día es: ");
        String dia = s.nextLine();

        boolean resultado = dia.equals("Martes");

        if (dia.equalsIgnoreCase("Lunes")){
            System.out.println("Animo con la semana de champions");
        } else if (dia.equalsIgnoreCase("Martes")){
            System.out.println("Martes con M de Me besas");
        } else if (dia.equalsIgnoreCase("Miercoles")){
            System.out.println("Miercoles");
        } else if (dia.equalsIgnoreCase("Jueves")){
            System.out.println("Ya es jueves");
        } else if (dia.equalsIgnoreCase("Viernes")){
            System.out.println("Ya es viernes");
        } else if (dia.equalsIgnoreCase("Sábado")){
            System.out.println("Ya es Sábado");
        } else if (dia.equalsIgnoreCase("Domingo")){
            System.out.println("Ya es Domingo");
        } else {
            System.out.println("El día introducido no es un día valido");
        }


    }
    
}
