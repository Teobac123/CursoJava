public class Interfacesmain {
    public static void main(String[] args) {
        
        CocheServices service= new CocheserviceClassicImpl();
        CocheServices service2= new CocheServiceSportImpl();
            
        Coche coche1= service.crearCocheDemo();
        Coche coche2= service2.crearCocheDemo();
       
    }
    
}
