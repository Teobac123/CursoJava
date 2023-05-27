package poo.Sininterfaces;

public class Empleado {
    String name;
    int age;
    double salary;
    boolean alta;

    //Constructores
    public Empleado(){}

    public Empleado(String name, int age, double salary, boolean alta) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "\nEmpleado [name=" + name + ", age=" + age 
        + ", salary=" + salary + ", alta=" + alta + "]";

    }
    
    
}
