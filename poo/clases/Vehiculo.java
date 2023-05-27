package poo.clases;

public class Vehiculo {

    //1. Atributos
    protected String fabricante;
    protected String modeloVehiculo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected double speed=0;
    protected Motor motor;


    //2. Constructores
    public Vehiculo(){}

    public Vehiculo(String fabricante, String modeloVehiculo, 
    double cc, int year, boolean sport, double speed,Motor motor){
        this.fabricante = fabricante;
                this.modeloVehiculo = modeloVehiculo;
                this.cc = cc;
                this.year = year;
                this.sport = sport;
                this.speed = speed;
                this.motor = motor;
    }

    public Vehiculo(String fabricante,String modelo){

        this.fabricante = fabricante;
        this.modeloVehiculo = modelo;
    }


    //3. Métodos (comportamiento)
    
    public void acelerar(double quantity){
        this.speed+= quantity;
    }

    @Override
    public String toString() {
        return "Vehiculo [fabricante=" + fabricante + ", modeloVehiculo=" + modeloVehiculo + ", cc=" + cc + ", year="
                + year + ", sport=" + sport + ", speed=" + speed + ", motor=" + motor + "]";
    }

    //getter y setter


    //toString


}
