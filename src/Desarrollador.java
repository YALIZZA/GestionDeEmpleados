public class Desarrollador extends Empleado{

private String lenguaje;

public Desarrollador(String nombre, String cargo, double salario, String lenguaje) {
    super(nombre, cargo, salario);
    this.lenguaje = lenguaje;
}

public String getLenguaje() {
    return lenguaje;
}

public void setLenguaje(String lenguaje) {
    this.lenguaje = lenguaje;
}
@Override
public void mostrarDatos() {
    System.out.println("DESARROLLADOR - nombre: " + nombre + " cargo: " + cargo + " salario: " + getSalario() + " lenguaje: " + lenguaje);
}

}