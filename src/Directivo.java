public class Directivo extends Empleado{

    private int numProyectos;

    public Directivo(String nombre, String cargo, double salario, int numProyectos) {
        super(nombre, cargo, salario);
        this.numProyectos = numProyectos;
    }

    public int getNumProyectos() {
        return numProyectos;
    }

    public void setNumProyectos(int numProyectos) {
        this.numProyectos = numProyectos;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("DIRECTIVO - nombre: " + nombre + "cargo: " + cargo + "salario: " + getSalario() + "num proyectos: " + numProyectos);
    }
    
}
