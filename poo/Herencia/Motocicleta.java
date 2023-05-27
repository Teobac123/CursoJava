package poo.Herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo{

    boolean baul;
    
    public Motocicleta() {
    }

    public Motocicleta(String fabricante, String modeloVehiculo, double cc, int year, boolean sport, double speed,
            Motor motor, boolean baul) {
        super(fabricante, modeloVehiculo, cc, year, sport, speed, motor);
        this.baul = baul;
    }
    
}
