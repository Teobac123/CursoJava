public abstract class Coche{
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad=0;

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color=color;
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.peso=peso;
        this.largo=largo;
    }
    public Coche(){

    }

    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad<=120){
            this.velocidad+=cantidad;
        }
    }
    @Override
    public String toString(){
        return "_Coche{" + "Color: " + color + 
        "\nFabricante: " + fabricante + 
        "\nModelo: " + modelo +
        "\nPeso: " + peso +
         " kg" + "\nLargo: " + largo + 
         " metros" + "\nVelocidad: " + velocidad +
          " km/h" + "}";
    }

}