package modulo1;

public class Funciones {
    public static void main(String[] args) {
        String hola= giveholaMundo();
        System.out.println(hola);
        holaMundo();
        holaMundo("Mateo");
        int suma=sum(5, 5);
        System.out.println("El resultado de la suma es: " + suma);
    }

    private static void holaMundo(){
        System.out.println("Hola Mundo desde un metodo");
    }
    protected static void holaMundo(String name){
        System.out.println("Hola " + name);
    }
    public static String giveholaMundo(){
        return "Hola Mundo";
    }
    private static int sum(int num1, int num2){
        return num1+num2;
    }
    
}
