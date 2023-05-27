package poo.Sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoCRUDV2 empleadoCRUDV2 = new EmpleadoCRUDV2();

        Empleado juan = new Empleado("Juan", 30, 40000, true);
        Empleado mateo = new Empleado("Mateo", 30, 40000, true);
        Empleado paulina = new Empleado("Paulina", 30, 40000, true);

        //guardar empleados
       /* empleadoCRUDV2.save(juan);
        empleadoCRUDV2.save(mateo);
        empleadoCRUDV2.save(paulina);*/

        //recuperar empleados
        List <Empleado> empleados = empleadoCRUDV2.recuperarEmpleados();

        System.out.println(empleados);

    }
}