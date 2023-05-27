package Conceptos;
public class Polimorfismomain {
    public static void main(String[] args) {
        

        Coche coche1=new CocheHibrido();

        CocheElectrico coche2=new CocheElectrico();

        //Polimorfismo

        Coche coche3=new CocheElectrico();

        if(coche3 instanceof CocheElectrico){
            System.out.println("Coche Electrico");
        }


    }
}
