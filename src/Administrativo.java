public class Administrativo extends Empleado {
    
    private String departamento;

    public Administrativo(String nombre, String cargo, double salario, String departamento) {
        super(nombre, cargo, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("ADMINISTRATIVO - nombre: " + nombre + " cargo: " + cargo + " salario: " + getSalario() + " departamento: " + departamento);
    }
       
}

