

public class CocheserviceClassicImpl implements CocheServices {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche Clasico");
        return new CocheElectrico();
    }

    

}
