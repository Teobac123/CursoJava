

public class CocheServiceSportImpl implements CocheServices{

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de Carreras");
        return new CocheElectrico();
    }

    
    
}
