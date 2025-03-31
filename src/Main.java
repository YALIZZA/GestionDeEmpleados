import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        ArrayList<Persona> personas = new ArrayList<Persona>();

        int option;

        do {
            System.out.println("MENU EMPRESA");
            System.out.println("1. Agregar administrativo");
            System.out.println("2. Agregar directivo");
            System.out.println("3. Agregar desarrollador");
            System.out.println("4. Agregar tester");
            System.out.println("5. Mostrar colaboradores");
            System.out.println("6. Salir");
            System.out.print("Elija una opcion ");
            option = entrada.nextInt();
            entrada.nextLine();//limpia el buffer
            switch (option) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombreA = entrada.nextLine();
                    System.out.print("Cargo: ");
                    String cargoA = entrada.nextLine();
                    System.out.print("Salario: ");
                    double salarioA = entrada.nextDouble();
                    System.out.print("departamento: ");
                    String departamentoA = entrada.nextLine();
                    personas.add(new Administrativo(nombreA, cargoA, salarioA, departamentoA));
                    break;
                case 2:
                    System.out.print("Nombre: ");
                    String nombreD = entrada.nextLine();
                    System.out.print("Cargo: ");
                    String cargoD = entrada.nextLine();
                    System.out.print("Salario: ");
                    double salarioD = entrada.nextDouble();
                    System.out.print("numumero de proyectos: ");
                    int numProyectosD = entrada.nextInt();
                    personas.add(new Directivo(nombreD, cargoD, salarioD, numProyectosD));
                    break;
                case 3:
                    System.out.print("Nombre: ");
                    String nombreDes = entrada.nextLine();
                    System.out.print("Cargo: ");
                    String cargoDes = entrada.nextLine();
                    System.out.print("Salario: ");
                    double salarioDes = entrada.nextDouble();
                    System.out.print("lenguaje: ");
                    String lenguajeDes = entrada.nextLine();
                    personas.add(new Desarrollador(nombreDes, cargoDes, salarioDes, lenguajeDes));
                    break;
                case 4:
                    System.out.print("Nombre: ");
                    String nombreT = entrada.nextLine();
                    System.out.print("Cargo: ");
                    String cargoT = entrada.nextLine();
                    System.out.print("Salario: ");
                    double salarioT = entrada.nextDouble();
                    System.out.print("tipo de test: ");
                    String tipoTestT = entrada.nextLine();
                    personas.add(new Tester(nombreT, cargoT, salarioT, tipoTestT));
                    break;
                case 5:
                     if (personas.isEmpty()) {
                      System.out.println("No hay colaboradores en la empresa");
                     } else { 
                        System.out.println("Lista de colaboradores");
                        for (Persona i : personas)  {
                            i.mostrarDatos();
                        }
                     }
                    break;
                case 6:
                    System.out.println("saliendo del sistema...");
                    break;
                default: 
                    System.out.println("Opcion no valida");
                    break;
            }
            } while (option != 6);
            entrada.close();
    }

 }

