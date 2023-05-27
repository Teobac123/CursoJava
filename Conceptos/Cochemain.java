public class Cochemain {
    public static void main(String[] args) {
        
        /*Coche cocheObj= new Coche("rojo", "Honda", "Civic", 1430.45, 5.4);

        cocheObj.acelerar(50);
        cocheObj.peso=1350.8;
        System.out.println(cocheObj);*/

        CocheElectrico CE=new CocheElectrico();
        CE.motorElectrico="Si";
        CE.color="rojo";
        CE.fabricante="Toyota";
        CE.modelo="Corolla";
        CE.largo=5.6;
        CE.peso=1285.90;
        CE.velocidad=80;

        System.out.println(CE);

        CocheElectrico ce2= new CocheElectrico("azul", "Alfa", "Romeo", 1500d, 4.5, "TxZ");
        ce2.acelerar(120);
        System.out.println(ce2);
    
    }
}
