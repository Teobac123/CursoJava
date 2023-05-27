package modulo2y3.estructurasdecontrol.Repetitivas;

public class While {
    public static void main(String[] args) {
        int contador = 0;
        while(contador < 10){
            System.out.println("Hola Mundo");
            contador++;

            /*if(contador == 5) //Romper el bucle
            break;
        }*/

            if(contador == 5){ // salta a la siguiente iteraccion
                continue;
            }
        }
    }   
}
