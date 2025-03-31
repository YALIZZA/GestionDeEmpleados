public class Tester extends Empleado{
    
    private String tipoTest;

    public Tester(String nombre, String cargo, double salario, String tipoTest) {
        super(nombre, cargo, salario);
        this.tipoTest = tipoTest;
    }

    public String getTipoTest() {
        return tipoTest;
    }

    public void setTipoTest(String tipoTest) {
        this.tipoTest = tipoTest;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("TESTER - nombre: " +nombre + "cargo: " +cargo + "salario: " + getSalario() + "tipo de test: " + tipoTest);
    }
}
