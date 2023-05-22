package modulo1;

public class Arraymain {
    public static void main(String[] args) {
        
        int[] notas = new int[10];
        
        int[] notas2 = {7,6,8,3,4,1,5,7};

        notas[0] = 8;
        notas[1] = 9;

        System.out.println(notas[0]);

        for(int i = 0; i < notas2.length; i++){

            System.out.println(notas[i]);
        }

        for(int item:notas2){

            System.out.println(item);
        }

        //notas2.binarySearch(notas,9);
        //notas2.sort(notas2);

        //equals(notas,notas2);
    }
    
}
