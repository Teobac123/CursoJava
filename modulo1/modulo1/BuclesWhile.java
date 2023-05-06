package modulo1;

public class BuclesWhile {
    public static void main(String[] args) {
        
        boolean check=true;
        int count=0;
        count++; //condición    
             while(count< 10){
                if(count == 6){
                    //break; // rompe el flujo de ejecución
                    //continue; //salta el valor 6 y continua a la siguiente iteración
                }
            System.out.println("Hola " + count);
                count++;
        }
        System.out.println("Fin");
    }
}
