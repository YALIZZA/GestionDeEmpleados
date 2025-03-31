public class Empleado extends Persona {

    private double salario;

    public Empleado(String nombre, String cargo, double salario) {
        super(nombre, cargo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("EMPLEADO - nombre: " + nombre + " cargo: " + cargo + " salario: " + salario);
    }
}