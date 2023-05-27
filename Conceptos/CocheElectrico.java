package Conceptos;
public class CocheElectrico extends Coche {

    String motorElectrico;
    
    public CocheElectrico(){


    }
    public CocheElectrico(String motorElectrico){

        this.motorElectrico=motorElectrico;
    }
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico= motorElectrico;
    }
    @Override
    public void acelerar(Integer cantidad){
        super.acelerar(cantidad);
    }
    
    @Override
    public String toString(){
        return "_Coche Electrico{" + "Color: " + color + "\nFabricante: " + fabricante +  "\nModelo: " + modelo + "\nPeso: " + peso + " kg" + "\nLargo: " + largo +  " metros" + "\nVelocidad: " + velocidad + " km/h" + "\nmotorElectrico: " + motorElectrico + "}";
    }
}